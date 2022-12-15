package com.sonysoft.models;

public class Main {

	public static void main(String[] args) {

		Bank bna = new Bank("bna");
		Employee mark = new Cadre("A1", "Mark", 1900, false, bna, "director");
		Employee joe = new Cadre("A11", "JOE", 2000, true, bna, "director");
		Employee bill = new Agent("B1", "JOE", 2100, true, bna);

		bna.loanEmpolyee(mark);
		bna.loanEmpolyee(joe);
		bna.loanEmpolyee(bill);
	}

}
