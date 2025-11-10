package Bridgelabz.first.controlflow.first.third;

import java.util.Scanner;

public class Calculatorswitchcase {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // Step 1: Get user inputs
            System.out.print("Enter first number: ");
            double first = sc.nextDouble();

            System.out.print("Enter second number: ");
            double second = sc.nextDouble();

            System.out.print("Enter operator (+, -, *, /): ");
            String op = sc.next();

            double result = 0; // Variable to store result

            // Step 2: Perform operation based on operator using switch...case
            switch (op) {
                case "+":
                    result = first + second;
                    System.out.println("Result: " + first + " + " + second + " = " + result);
                    break;

                case "-":
                    result = first - second;
                    System.out.println("Result: " + first + " - " + second + " = " + result);
                    break;

                case "*":
                    result = first * second;
                    System.out.println("Result: " + first + " * " + second + " = " + result);
                    break;

                case "/":
                    if (second != 0) {
                        result = first / second;
                        System.out.println("Result: " + first + " / " + second + " = " + result);
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                    }
                    break;

                default:
                    System.out.println("Invalid Operator! Please use +, -, * or /.");
            }

            sc.close();
        }


}
