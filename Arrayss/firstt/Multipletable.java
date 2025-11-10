package Bridgelabz.first.Arrayss.firstt;

import java.util.Scanner;

public class Multipletable {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // Step 1: Get integer input
            System.out.print("Enter a number to print its multiplication table: ");
            int number = sc.nextInt();

            // Step 2: Define an integer array to store results from 1 to 10
            int[] table = new int[10];

            // Step 3: Run loop to calculate and store results
            for (int i = 1; i <= 10; i++) {
                table[i - 1] = number * i; // store result in array
            }

            // Step 4: Display the multiplication table
            System.out.println("\nMultiplication Table of " + number + ":");
            for (int i = 1; i <= 10; i++) {
                System.out.println(number + " * " + i + " = " + table[i - 1]);
            }

            sc.close();
        }

}
