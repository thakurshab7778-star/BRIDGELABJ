package Bridgelabz.first.Arrayss.firstt;

import java.util.Scanner;

public class multiplicationtablefrom6to9 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // Step 1: Get user input
            System.out.print("Enter a number to print its multiplication table from 6 to 9: ");
            int number = sc.nextInt();

            // Step 2: Define an integer array to store multiplication results (for 6 to 9)
            int[] multiplicationResult = new int[4]; // (9 - 6 + 1) = 4 results

            // Step 3: Use a for loop to calculate and store results
            for (int i = 6; i <= 9; i++) {
                multiplicationResult[i - 6] = number * i;
            }

            // Step 4: Display the results
            System.out.println("\nMultiplication Table of " + number + " (from 6 to 9):");
            for (int i = 6; i <= 9; i++) {
                System.out.println(number + " * " + i + " = " + multiplicationResult[i - 6]);
            }

            sc.close();
        }

}
