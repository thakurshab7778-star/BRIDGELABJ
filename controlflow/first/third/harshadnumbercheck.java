package Bridgelabz.first.controlflow.first.third;

import java.util.Scanner;

public class harshadnumbercheck {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // Step 1: Get integer input from user
            System.out.print("Enter an integer: ");
            int number = sc.nextInt();

            int originalNumber = number; // Keep original number for checking later
            int sum = 0; // Step 2: Initialize sum to 0

            // Step 3: Use while loop to find sum of digits
            while (number != 0) {
                int digit = number % 10;  // Get last digit
                sum += digit;             // Add to sum
                number = number / 10;     // Remove last digit
            }

            // Step 4: Check if original number is divisible by the sum of digits
            if (sum != 0 && originalNumber % sum == 0) {
                System.out.println(originalNumber + " is a Harshad Number");
            } else {
                System.out.println(originalNumber + " is NOT a Harshad Number");
            }

            sc.close();
        }
    }

