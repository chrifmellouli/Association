package com.sonysoft.models;

public class Bank {

	private String name;

	public Bank() {
	}

	public Bank(String name) {
		super();
		this.name = name;
	}

	public String getNom() {
		return name;
	}

	public void setNom(String name) {
		this.name = name;
	}

	public void loanEmpolyee(Employee employee) {
		if (employee.isRequestLoan()) {
			if (employee.getSalary() > 2000) {
				System.out.println(employee.toString() + ": loan accorded");
				employee.setRequestLoan(true);
			} else if (employee instanceof Cadre) {
				if (((Cadre) employee).getPosition().toUpperCase().equals("CONFIRMED")) {
					System.out.println(employee.toString() + ": loan accorded");
					employee.setRequestLoan(true);
				} else {
					System.out.println(employee.toString() + ": loan refused");
					employee.setRequestLoan(false);
				}
			} else {
				System.out.println(employee.toString() + ": loan refused");
				employee.setRequestLoan(false);
			}
		} else {
			System.out.println(employee.toString() + ": has not request loan!");
		}
	}

	@Override
	public String toString() {
		return "Bank [name=" + name + "]";
	}

}
