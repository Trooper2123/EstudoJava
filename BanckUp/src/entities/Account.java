package entities;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Locale;
import java.util.Scanner;


public class Account {

	private static int number;
	char ans;
	private double balance;
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

		System.out.println("Wish to make an operation? y/n");
		this.ans = sc.next().charAt(0);


		this.loopOperation(ans);

		System.out.println( "Account: " + getNumber()
				+ ", " + "Holder :" + getHolder()
				+ ", Balance: $ " + round(getBalance(),2));

		sc.close();

		System.out.println("---------------END OF SESSION-----------");
	}

	public void loopOperation(char ans) {
		while (ans == 'y') {

			System.out.println("Enter operation: Deposit (d) Withdraw (w) ");
			char tipe = this.sc.next().charAt(0);

			this.operations(tipe);

			System.out.println("Next operation ? y/n ");
			ans = this.sc.next().charAt(0);
		}
	}
		public void operations(char opTipe) {

			if (opTipe == 'd') {
				System.out.println("Enter deposit value: ");
				double value = sc.nextDouble();
				this.deposit(value);

			} else if (opTipe == 'w') {
				System.out.println("Enter Withdraw value: ");
				double value = sc.nextDouble();
				this.withdraw(value);
			}

			System.out.println("Account: " + getNumber()
					+ ", " + "Holder :" + getHolder()
					+ ", Balance: $ " + round(getBalance(),2));
		}

		// METODO DE ARREDONDAMENTO GENÉRICO DE DOUBLE
	private static double round(double value, int places) {
		if (places < 0) throw new IllegalArgumentException();

		BigDecimal bd = new BigDecimal(Double.toString(value));
		bd = bd.setScale(places, RoundingMode.HALF_UP);
		return bd.doubleValue();
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
