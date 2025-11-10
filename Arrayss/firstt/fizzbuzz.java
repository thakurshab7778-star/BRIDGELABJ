package Bridgelabz.first.Arrayss.firstt;

import java.util.Scanner;

public class fizzbuzz {
        public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);

            // Step 1: Take number input
            System.out.print("Enter a positive integer: ");
            int number = sc.nextInt();

            // Step 2: Check for natural number
            if (number <= 0) {
                System.out.println("Error: Please enter a positive integer!");
                return;
            }

            // Step 3: Create a String array to store results
            String[] results = new String[number + 1]; // include 0 to number

            // Step 4: Loop through numbers and apply FizzBuzz logic
            for (int i = 0; i <= number; i++) {
                if (i == 0) {
                    results[i] = "0"; // store 0 as it is
                } else if (i % 3 == 0 && i % 5 == 0) {
                    results[i] = "FizzBuzz";
                } else if (i % 3 == 0) {
                    results[i] = "Fizz";
                } else if (i % 5 == 0) {
                    results[i] = "Buzz";
                } else {
                    results[i] = String.valueOf(i);
                }
            }

            // Step 5: Print results with position info
            System.out.println("\nFizzBuzz Results:");
            for (int i = 0; i <= number; i++) {
                System.out.println("Position " + i + " = " + results[i]);
            }

            sc.close();
        }

}
