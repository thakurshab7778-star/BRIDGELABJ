package Bridgelabz.first.controlflow.first.third;

import java.util.Scanner;

public class countdigits {
        public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);

            // Step 1: Get integer input
            System.out.print("Enter an integer: ");
            int number = sc.nextInt();

            // Step 2: Create variable 'count' with initial value 0
            int count = 0;

            // Step 3: Handle case for 0 (since while loop won't run for 0)
            if (number == 0) {
                count = 1;
            } else {
                // Step 4: If number is negative, make it positive
                if (number < 0) {
                    number = -number;
                }

                // Step 5: Loop until number becomes 0
                while (number != 0) {
                    number = number / 10; // Remove last digit
                    count++;              // Increment digit count
                }
            }

            // Step 6: Display the total count of digits
            System.out.println("Number of digits: " + count);

            sc.close();
        }
    }


