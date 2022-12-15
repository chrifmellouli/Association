package com.sonysoft.models;

public class Cadre extends Employee {

	private String position;

	public Cadre() {
	}

	public Cadre(String id, String name, int salary, boolean requestLoan, Bank bank, String position) {
		super(id, name, salary, requestLoan, bank);
		this.position = position;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	@Override
	public void requestLoan() {
		System.out.println("Cadre request : \n" + this.toString() + " request a loan");
		super.setRequestLoan(true);
	}

	@Override
	public String toString() {
		return "Cadre [ " + super.toString() + " position : " + position + " ]";
	}

}
