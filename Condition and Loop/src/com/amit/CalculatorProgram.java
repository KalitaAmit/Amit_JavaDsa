package com.amit;

import java.util.Scanner;

public class CalculatorProgram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ans = 0;

        // Take input from user until they press X or x
        while (true) {
            // take the operator as input
            System.out.print("Enter the operator (+, -, *, /, %, X to exit): ");
            char op = in.next().trim().charAt(0);

            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                // input two numbers
                System.out.print("Enter two numbers: ");
                int number1 = in.nextInt();
                int number2 = in.nextInt();

                if (op == '+') {
                    ans = number1 + number2;
                } else if (op == '-') {
                    ans = number1 - number2;
                } else if (op == '*') {
                    ans = number1 * number2;
                } else if (op == '/') {
                    if (number2 != 0) {
                        ans = number1 / number2;
                    } else {
                        System.out.println("Cannot divide by zero!");
                        continue; // skip printing result
                    }
                } else if (op == '%') {
                    ans = number1 % number2;
                }

                System.out.println("Result = " + ans);
            }
            else if (op == 'X' || op == 'x') {
                // exit condition
                System.out.println("Exiting calculator...");
                break;
            }
            else {
                System.out.println("Invalid operation!");
            }
        }
    }
}


