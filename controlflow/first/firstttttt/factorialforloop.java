package Bridgelabz.first.controlflow.first.firstttttt;

import java.util.Scanner;

public class factorialforloop {
        public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);

            // Take input from the user
            System.out.print("Enter a positive integer: ");
            int number = sc.nextInt();

            // Check if input is a natural number
            if (number < 0) {
                System.out.println("Factorial is not defined for negative numbers.");
            } else {
                long factorial = 1;  // Use long to handle large results

                // Compute factorial using for loop
                for (int i = 1; i <= number; i++) {
                    factorial *= i;
                }

                // Display result
                System.out.println("The factorial of " + number + " is " + factorial);
            }

            sc.close();
        }
    }


