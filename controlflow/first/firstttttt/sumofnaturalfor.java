package Bridgelabz.first.controlflow.first.firstttttt;

import java.util.Scanner;

public class sumofnaturalfor {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // Take user input
            System.out.print("Enter a natural number (n): ");
            int n = sc.nextInt();

            // Check if input is a natural number
            if (n <= 0) {
                System.out.println("The number " + n + " is not a natural number.");
            } else {
                int sumFor = 0;

                // Compute sum using for loop
                for (int i = 1; i <= n; i++) {
                    sumFor += i;
                }

                // Compute sum using formula
                int sumFormula = n * (n + 1) / 2;

                // Print both results
                System.out.println("Sum computed using for loop: " + sumFor);
                System.out.println("Sum computed using formula: " + sumFormula);

                // Compare results
                if (sumFor == sumFormula) {
                    System.out.println("✅ Both results are correct and match!");
                } else {
                    System.out.println("❌ The results do not match!");
                }
            }

            sc.close();
        }
    }


