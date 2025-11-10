package Bridgelabz.first.controlflow.first.firstttttt;

import java.util.Scanner;

public class numbercheck {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // Taking input
            System.out.print("Enter a number: ");
            int number = sc.nextInt();

            // Checking number type
            if (number > 0) {
                System.out.println("The number is positive.");
            } else if (number < 0) {
                System.out.println("The number is negative.");
            } else {
                System.out.println("The number is zero.");
            }

            sc.close();
        }
    }


