package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter to day price: ");
        double todayPrice = sc.nextDouble();
        System.out.print("Enter the amount to be brought: ");
        double amount = sc.nextDouble();


        double calc = CurrencyConverter.converter(todayPrice,amount);


        System.out.printf("Amount to be payed in R$: %.2f%n", calc);

        sc.close();


    }
}
