package entities;

import java.util.Scanner;

public class Account {
	private int number;
	private String holder;
	private double balance;
	private String MONEY_COIN = "R";
	
	public Account(){
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter account nunber: ");
		this.number = scanner.nextInt();
		String trash = scanner.nextLine();
		
		System.out.print("Enter account holder: ");
		this.holder = scanner.nextLine();
		
		System.out.print("Is there an initial deposit (y/n)?");
		String option = scanner.nextLine();
		
		if(option.toLowerCase().equals("y")) {
			System.out.printf("Enter initial deposit value: %s$", this.MONEY_COIN);
			this.balance = scanner.nextDouble();
		}
		
		
		scanner.close();
	}
	
	public Account(int number, String holder, double balance){
		this.number = number;
		this.holder = holder;
		this.balance = balance;
	}

	private int getNumber() {
		return number;
	}

	private void setNumber(int number) {
		this.number = number;
	}

	private String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	private double getBalance() {
		return balance;
	}

	private void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void accountData() {
		System.out.println("\nAccount data:");
		System.out.printf("Account %d, Holder: %s, Balance: %s$%.2f", this.getNumber(), this.getHolder(), this.MONEY_COIN, this.getBalance());
	}
	
	public void deposit(double amount){
		if(amount < 0) {
			amount *= -1;
		}
		this.setBalance(this.getBalance() + amount);
	}
	
	public void withdraw(double amount){
		if(amount < 0) {
			amount *= -1;
		}
		this.setBalance(this.getBalance() - (amount + 5));			
	}
	
	
}
