package com.company;

import java.util.Scanner;

public class FizzBuzzFibonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read in user inputs
        System.out.println("Please enter the first integer: ");
        int num1 = Integer.parseInt(scan.nextLine());

        System.out.println("Please enter the second integer: ");
        int num2 = Integer.parseInt(scan.nextLine());
        // How to make it so that if the user inputs a string, it loops the user to input a correct value?

        System.out.println("FizzBuzz" + "\n" + "==========");
        for (int i = 1; i <= num1; i++) {
            if (((i % 5) == 0) && ((i % 3) == 0)) {
                System.out.println("FizzBuzz");
            } else if ((i % 5) == 0) {
                System.out.println("Buzz");
            } else if ((i % 3) == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }
        }

        System.out.println("\n" + "Fibonacci" + "\n" + "==========");
        int fib1 = 0, fib2 = 1;
        int counter = 0;

        while (counter < num2) {
            System.out.print(fib1 + " ");
            int fib3 = fib2 + fib1;
            fib1 = fib2;
            fib2 = fib3;
            counter = counter + 1;
        }

    }
}
