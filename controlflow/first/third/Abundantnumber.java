package Bridgelabz.first.controlflow.first.third;

import java.util.Scanner;

public class Abundantnumber {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // Step 1: Get integer input
            System.out.print("Enter an integer: ");
            int number = sc.nextInt();

            // Step 2: Initialize sum to 0
            int sum = 0;

            // Step 3: Find divisors of the number using a for loop
            System.out.print("Divisors of " + number + ": ");
            for (int i = 1; i < number; i++) {
                if (number % i == 0) {
                    sum += i;  // Add divisor to sum
                    System.out.print(i + " "); // Show divisors
                }
            }

            // Step 4: Display sum of divisors
            System.out.println("\nSum of divisors = " + sum);

            // Step 5: Check if sum > number (Abundant condition)
            if (sum > number) {
                System.out.println(number + " is an Abundant Number");
            } else {
                System.out.println(number + " is NOT an Abundant Number");
            }

            sc.close();
        }
    }

