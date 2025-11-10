package Bridgelabz.first.controlflow.first.firstttttt;

import java.util.Scanner;

public class factorwhileloop {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // Take input from the user
            System.out.print("Enter a positive integer: ");
            int number = sc.nextInt();

            // Check if input is valid
            if (number < 0) {
                System.out.println("Factorial is not defined for negative numbers.");
            } else {
                int i = 1;
                long factorial = 1;  // use long to handle large values

                // Compute factorial using while loop
                while (i <= number) {
                    factorial *= i;
                    i++;
                }

                // Display result
                System.out.println("The factorial of " + number + " is " + factorial);
            }

            sc.close();
        }
    }


