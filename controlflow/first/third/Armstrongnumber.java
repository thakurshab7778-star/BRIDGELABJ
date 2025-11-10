package Bridgelabz.first.controlflow.first.third;

import java.util.Scanner;

public class Armstrongnumber {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // 1) Get integer input and store it in 'number'
            System.out.print("Enter a non-negative integer: ");
            int number = sc.nextInt();

            // Negative numbers are not considered in this simple Armstrong check
            if (number < 0) {
                System.out.println("Please enter a non-negative integer.");
                sc.close();
                return;
            }

            // 2) Define sum and originalNumber per the hint
            int sum = 0;
            int originalNumber = number;

            System.out.println("\nSteps:");
            // 3) Use while loop until originalNumber becomes 0
            while (originalNumber != 0) {
                // 3.a) Extract the last digit (remainder of modulus 10)
                int digit = originalNumber % 10;

                // 3.b) Compute cube of the digit
                int cube = digit * digit * digit; // same as (int)Math.pow(digit, 3) but faster

                // 3.c) Add cube to sum
                sum += cube;

                // Print the step (digit, its cube, running sum)
                System.out.printf("Digit: %d, Cube: %d, Running Sum: %d%n", digit, cube, sum);

                // 3.d) Remove the last digit (integer division by 10)
                originalNumber = originalNumber / 10;
            }

            // 4) Finally check if the original input 'number' equals computed 'sum'
            System.out.println("\nFinal sum of cubes = " + sum);
            if (sum == number) {
                System.out.println(number + " is an Armstrong Number.");
            } else {
                System.out.println(number + " is NOT an Armstrong Number.");
            }

            sc.close();
        }
    }

