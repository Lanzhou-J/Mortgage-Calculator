package com.codewithLanzhou;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        byte MONTHS_IN_YEAR = 12;
        byte PERCENT = 100;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Principal: ");
        int principal = scanner.nextInt();
        while(principal < 1000 || principal > 1_000_000){
            System.out.println("Enter a number between 1,000 and 1,000,000");
            principal = scanner.nextInt();
        };

        System.out.print("Annual Interest Rate: ");
        float annualInterestRate = scanner.nextFloat();
        while(annualInterestRate <= 0 || annualInterestRate > 30){
            System.out.println("Enter a value greater than 0 and less than or equal to 30");
            annualInterestRate = scanner.nextFloat();
        };


        System.out.print("Period(Years): ");
        byte years = scanner.nextByte();
        while(years < 1 || years > 30){
            System.out.println("Enter a value between 1 and 30");
            years = scanner.nextByte();
        };

        float monthlyInterestRate = (annualInterestRate/PERCENT)/MONTHS_IN_YEAR;

        int numberOfPayments = years * MONTHS_IN_YEAR;
        double totalRate = Math.pow((1 + monthlyInterestRate), (numberOfPayments));

        double mortgage = principal * ((monthlyInterestRate * totalRate)/(totalRate - 1));
        NumberFormat currency = NumberFormat.getCurrencyInstance();

        String mortgageFormatted = currency.format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);

    }
}
