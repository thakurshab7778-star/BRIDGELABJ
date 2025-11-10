package Bridgelabz.first.controlflow.first.second;

import java.util.Scanner;

public class greatfactorewhile {
        public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);

            // Taking user input
            System.out.print("Enter a positive integer: ");
            int number = sc.nextInt();

            // Check for positive number
            if (number <= 1) {
                System.out.println("Please enter a number greater than 1.");
            } else {
                int greatestFactor = 1; // Initialize
                int counter = number - 1; // Start from one less than number

                // Loop using while
                while (counter >= 1) {
                    if (number % counter == 0) {
                        greatestFactor = counter; // Found the greatest factor
                        break; // Exit loop
                    }
                    counter--; // Decrement counter
                }

                // Display result
                System.out.println("The greatest factor of " + number + " (excluding itself) is: " + greatestFactor);
            }

            sc.close();
        }


}
