package Bridgelabz.first.controlflow.first.firstttttt;

import java.util.Scanner;

public class Sumuntilzero {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            double total = 0.0;  // variable to store total sum
            double number;       // variable to store user input

            System.out.println("Enter numbers to add (enter 0 to stop):");

            // Input loop
            while (true) {
                System.out.print("Enter a number: ");
                number = sc.nextDouble();

                // check if user entered 0
                if (number == 0) {
                    break;
                }

                // add the number to total
                total += number;
            }

            // print the total
            System.out.println("The total sum of entered numbers is " + total);

            sc.close();
        }
    }


