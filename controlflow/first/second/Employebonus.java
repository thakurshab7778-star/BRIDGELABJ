package Bridgelabz.first.controlflow.first.second;

import java.util.Scanner;

public class Employebonus {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // Taking inputs
            System.out.print("Enter your salary: ");
            double salary = sc.nextDouble();

            System.out.print("Enter your years of service: ");
            int years = sc.nextInt();

            // Check for bonus eligibility
            if (years > 5) {
                double bonus = salary * 0.05;  // 5% bonus
                System.out.println("Congratulations! You are eligible for a bonus.");
                System.out.println("Your bonus amount is: " + bonus);
            } else {
                System.out.println("You are not eligible for a bonus yet.");
            }

            sc.close();
        }

}
