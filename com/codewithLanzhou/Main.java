package com.codewithLanzhou;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        byte MONTHS_IN_YEAR = 12;
        byte PERCENT = 100;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Principal: ");
        float principal = scanner.nextFloat();

        System.out.print("Annual Interest Rate: ");
        float annualInterestRate = scanner.nextFloat();

        System.out.print("Period(Years): ");
        byte years = scanner.nextByte();

        float monthlyInterestRate = (annualInterestRate/PERCENT)/MONTHS_IN_YEAR;

        int numberOfPayments = years * MONTHS_IN_YEAR;
        double totalRate = Math.pow((1 + monthlyInterestRate), (numberOfPayments));

        double mortgage = principal * ((monthlyInterestRate * totalRate)/(totalRate - 1));
        NumberFormat currency = NumberFormat.getCurrencyInstance();

        String mortgageFormatted = currency.format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);
    }
}
