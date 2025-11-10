package Bridgelabz.first.controlflow.first.second;

import java.util.Scanner;

public class greatfactor {
        public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);

            // Taking user input
            System.out.print("Enter a positive integer: ");
            int number = sc.nextInt();

            // Check for positive number
            if (number <= 1) {
                System.out.println("Please enter a number greater than 1.");
            } else {
                int greatestFactor = 1;  // Initialize with 1

                // Loop from (number - 1) down to 1
                for (int i = number - 1; i >= 1; i--) {
                    if (number % i == 0) {
                        greatestFactor = i;  // Found the greatest factor
                        break;  // Exit loop after finding the first factor
                    }
                }

                System.out.println("The greatest factor of " + number + " (excluding itself) is: " + greatestFactor);
            }

            sc.close();
        }

}
