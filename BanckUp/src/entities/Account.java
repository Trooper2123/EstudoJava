package entities;

import java.util.Locale;
import java.util.Scanner;



public class Account {

	private double balance;
	private static int number;
	private String holder;
	
	Scanner sc;
	
	public Account () {
		
		this.sc = new Scanner(System.in);
		this.sc.useLocale(Locale.US);
		
		this.balance = 0;

		
		System.out.println("Enter account number: ");
		Account.number = sc.nextInt();
		System.out.println("Enter account Holder: ");
		this.holder = sc.next().toUpperCase();

		System.out.println("New Account: Holder -" + holder);
		System.out.println("Number - " + Account.number);

		char ans = 'y';
		
		while (ans == 'y') {
			
			System.out.println("Enter operation: Deposit (d) Withdraw (w) ");
			char tipe = this.sc.next().charAt(0);
		
			this.operations(tipe);
			
			System.out.println("Next operation ? y/n ");
			ans = this.sc.next().charAt(0);
			
		}
		
		System.out.println( "Account: " + getNumber() 
		+ ", " + "Holder :" + getHolder() 
		+ ", Balance: $ " + getBalance());
		
		sc.close();

	}
	
	public void operations(char tipe) {
		
		if (tipe == 'd') {
			System.out.println("Enter deposit value: ");
			double value = sc.nextDouble();
			this.deposit(value);

		} else if (tipe == 'w') {
			System.out.println("Enter Withdraw value: ");
			double value = sc.nextDouble();
			this.withdraw(value);
		}
		
		System.out.println( "Account: " + getNumber() 
		+ ", " + "Holder :" + getHolder() 
		+ ", Balance: $ " + getBalance());
		
	}

	public void deposit(double amount) {
		this.balance += amount;
	}

	public void withdraw(double amount) {
		this.balance -= amount + 5.00;
	}

	public double getBalance() {
		return this.balance;
	}

	public int getNumber() {
		return Account.number;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public String getHolder() {
		return this.holder;
	}

}
