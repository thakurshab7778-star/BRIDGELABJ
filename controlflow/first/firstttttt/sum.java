package Bridgelabz.first.controlflow.first.firstttttt;

import java.util.Scanner;

public class sum {
        public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);

            double total = 0.0;  // variable to store total sum
            double number;       // variable to store user input

            System.out.println("Enter numbers to add (enter 0 or a negative number to stop):");

            while (true) {
                System.out.print("Enter a number: ");
                number = sc.nextDouble();

                // Break the loop if 0 or negative number is entered
                if (number <= 0) {
                    break;
                }

                // Add the number to total
                total += number;
            }

            // Print the total
            System.out.println("The total sum of entered positive numbers is " + total);

            sc.close();
        }
    }

