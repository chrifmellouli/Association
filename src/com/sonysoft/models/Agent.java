package com.sonysoft.models;

public class Agent extends Employee {

	public Agent() {
	}

	public Agent(String id, String name, int salary, boolean requestLoan, Bank bank) {
		super(id, name, salary, requestLoan, bank);
	}

	@Override
	public void requestLoan() {
		System.out.println("Agent request : \n" + this.toString() + " request a loan");
		super.setRequestLoan(true);
	}

	@Override
	public String toString() {
		return "Agent [ " + super.toString() + " ]";
	}

}
