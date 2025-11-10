package Bridgelabz.first.controlflow.first.firstttttt;

import java.util.Scanner;

public class employeBonus {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // Taking inputs
            System.out.print("Enter your salary (INR): ");
            double salary = sc.nextDouble();

            System.out.print("Enter your years of service: ");
            int years = sc.nextInt();

            double bonus = 0.0;

            // Check if eligible for bonus
            if (years > 5) {
                bonus = 0.05 * salary;
                System.out.println("You are eligible for a bonus of INR " + bonus);
            } else {
                System.out.println("You are not eligible for a bonus. Complete more than 5 years of service.");
            }

            sc.close();
        }
    }


