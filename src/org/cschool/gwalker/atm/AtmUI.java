package org.cschool.gwalker.atm;

import java.util.Scanner;

public class AtmUI {

	Scanner input = new Scanner(System.in);

	private int choice;
	private double amount;

	public AtmUI() {
		// TODO Auto-generated constructor stub
	}

	public void doOptionDisplay() {

		this.display("Please Choose a Transaction Option, Then Press the Cooresponding Key: \n" + "1: Deposit Funds \n"
				+ "2: Withdraw Funds \n" + "3: Check Current Balance \n" + "4: QuickCash (Withdraw $40)");

		this.choice = input.nextInt();

		if (this.choice == 1){
			this.display("Please Enter the Amount You Would Like to Deposit: ");
			this.setAmount(input.nextDouble());
		}
		
		if (this.choice == 2) {
			
			this.display("Please Enter the Amount You Would Like to Withdraw: ");
			this.setAmount(- + input.nextDouble());
		}
		
		if (this.choice == 3) {
			
			//Get and Return Current Balance from Account
		}
		
		if (this.choice == 4) {
			
			this.choice = 2;
			
			this.setAmount(-40);
		}
		
	}
	
	
	
	public void doCompleteTransaction(boolean completed) {
		
		//Method to verify transaction was completed
		
		/*if (compleated){
			this.display("Thank You for Choosing CCS6 Bank, Have a Nice Day!");
			}
			
		if (!completed){
			this.display("Uh-oh, Something Went Wrong on Our End. Transaction Cancelled,"
			+ " Would you Like to Make Another Transaction?");
			TODO Enter Y/N Options. Y = Return to Main Menu, N = Exit
		}
			*/
		
	
	}

	private void display(String message) {
		System.out.println(message);
	}

	public int getChoice() {
		return choice;
	}

	public void setChoice(int choice) {
		this.choice = choice;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	public static void main(String[] args) {
		
		AtmUI ui = new AtmUI();
		ui.doOptionDisplay();
		
		
		System.out.println(ui.getChoice());
		System.out.println(ui.getAmount());
	}

}
