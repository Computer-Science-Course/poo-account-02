package application;

import java.util.Locale;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Account account = new Account();
		
		account.accountData();
		account.deposit(-100);
		account.accountData();
		account.deposit(100);
		account.accountData();
		account.withdraw(-50);
		account.accountData();
		account.withdraw(-50);
		account.accountData();

	}

}
