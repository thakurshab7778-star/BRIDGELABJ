package Bridgelabz.first.Programmingelement.level2;

import java.util.Scanner;

public class Quotientreminder {


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // Taking inputs
            System.out.print("Enter the first number: ");
            int number1 = sc.nextInt();

            System.out.print("Enter the second number: ");
            int number2 = sc.nextInt();

            // Calculating quotient and remainder
            int quotient = number1 / number2;
            int remainder = number1 % number2;

            // Displaying output
            System.out.println("The Quotient is " + quotient + " and Remainder is " + remainder +
                    " of two numbers " + number1 + " and " + number2);

            sc.close();
        }
    }


