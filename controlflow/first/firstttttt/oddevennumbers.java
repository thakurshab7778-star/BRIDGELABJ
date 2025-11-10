package Bridgelabz.first.controlflow.first.firstttttt;

import java.util.Scanner;

public class oddevennumbers {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // Take user input
            System.out.print("Enter a natural number: ");
            int number = sc.nextInt();

            // Check if the number is a natural number
            if (number <= 0) {
                System.out.println("The number " + number + " is not a natural number.");
            } else {
                // Loop through numbers from 1 to n
                for (int i = 1; i <= number; i++) {
                    if (i % 2 == 0) {
                        System.out.println(i + " is an even number.");
                    } else {
                        System.out.println(i + " is an odd number.");
                    }
                }
            }

            sc.close();
        }
    }

