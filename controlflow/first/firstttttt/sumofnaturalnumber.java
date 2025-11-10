package Bridgelabz.first.controlflow.first.firstttttt;

import java.util.Scanner;

public class sumofnaturalnumber {
        public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);

            // Take user input
            System.out.print("Enter a natural number (n): ");
            int n = sc.nextInt();

            // Check if input is a natural number
            if (n <= 0) {
                System.out.println("The number " + n + " is not a natural number.");
            } else {
                int sumWhile = 0;
                int i = 1;

                // Compute sum using while loop
                while (i <= n) {
                    sumWhile += i;
                    i++;
                }

                // Compute sum using formula
                int sumFormula = n * (n + 1) / 2;

                // Print both results
                System.out.println("Sum computed using while loop: " + sumWhile);
                System.out.println("Sum computed using formula: " + sumFormula);

                // Compare results
                if (sumWhile == sumFormula) {
                    System.out.println("✅ Both results are correct and match!");
                } else {
                    System.out.println("❌ The results do not match!");
                }
            }

            sc.close();
        }
    }


