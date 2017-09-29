package org.cschool.gwalker.atm;

import java.util.Scanner;

public class Atm {

	private double balance;

	// Instance Variables for Request
	private int request;
	private int requestedAmount;
	
	Scanner input = new Scanner(System.in);
	
	public boolean doAuthenticate() {
		/*
		 * TODO Finish This
		 */

		display("Enter Account and Pin:");
		
		return true;

	}

	public void doHandleRequest() {
		// TODO Display Options and enter Requirements

		display("Please Choose an Option: " + "\n Deposit - Press 1" + "\n Withdraw - Press 2");

		this.request = input.nextInt();

		if (this.request == 1) {

			this.display("Please Input the Amount you would like to Deposit (Only Whole Dollars):");

			this.requestedAmount = input.nextInt();
			
		}
			
		if (this.request == 2) {

			this.display("Please Input the Amount you would like to Withdraw (Only Whole Dollars):");

			this.requestedAmount = input.nextInt();

		}

	}

	public void doHandleTransaction() {
		if (this.request == 1) {

			this.balance += this.requestedAmount;

			this.display(" $" + this.requestedAmount + " Deposited."
					+ "\n New Balance: $" + this.balance);

		} else if (this.request == 2) {
			
			this.balance -= this.requestedAmount;

			this.display(" $" + this.requestedAmount + " Deposited."
					+ "\n New Balance: $" + this.balance);

		}

	}

	public void doFinish() {
		this.display("Thank You. Please Come Again!");
	}

	private void display(String message) {
		System.out.println(message);
	}

	public static void main(String[] args) {
		Atm atm = new Atm();

		/* Authenticate */

		boolean Authenticated = false;

		while (!Authenticated) {
			Authenticated = atm.doAuthenticate();
		}

		/* Handle Request */
		atm.doHandleRequest();

		atm.doHandleTransaction();

		atm.doFinish();

	}

}
