package org.cschool.gwalker.atm;

import java.util.Scanner;

public class Atm {

	private double balance;

	// Instance Variables for Request
	private int request;
	private double requestedAmount;

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

		AtmUI atmUI = new AtmUI();

		atmUI.doOptionDisplay();

		request = atmUI.getChoice();
		requestedAmount = atmUI.getAmount();

	}

	public void doHandleTransaction() {
		if (this.request == 1) {

			this.balance += this.requestedAmount;

			this.display(" $" + this.requestedAmount + " Deposited." + "\n New Balance: $" + this.balance);

		} else if (this.request == 2) {

			this.balance -= this.requestedAmount;

			this.display(" $" + this.requestedAmount + " Withdrawn." + "\n	New Balance: $" + this.balance);

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
