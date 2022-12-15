package com.sonysoft.models;

public abstract class Employee {

	private String id;
	private String name;
	private int salary;
	private boolean requestLoan;
	private Bank bank;

	public Employee() {
	}

	public Employee(String id, String name, int salary, boolean requestLoan, Bank bank) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.requestLoan = requestLoan;
		this.bank = bank;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public boolean isRequestLoan() {
		return requestLoan;
	}

	public void setRequestLoan(boolean requestLoan) {
		this.requestLoan = requestLoan;
	}

	public Bank getBank() {
		return bank;
	}

	public void setBank(Bank bank) {
		this.bank = bank;
	}

	public abstract void requestLoan();

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", requestLoan=" + requestLoan
				+ ", bank=" + bank + "]";
	}

}
