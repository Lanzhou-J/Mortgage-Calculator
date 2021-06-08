package com.codewithLanzhou;

import java.util.Scanner;

public class practice {
    static void runFizzBuzz(){
        System.out.print("Number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        String result = "";
        boolean isFizz = (number % 5 == 0);
        boolean isBuzz = (number % 3 == 0);
        if (isFizz)
            result += "Fizz";
        if (isBuzz)
            result += "Buzz";
        if (!isFizz && !isBuzz)
            result += number;

        System.out.println(result);
    }
}
