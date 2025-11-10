package Bridgelabz.first.controlflow.first.firstttttt;

import java.util.Scanner;

public class votingelegbility {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // Taking input
            System.out.print("Enter the person's age: ");
            int age = sc.nextInt();

            // Check voting eligibility
            if (age >= 18) {
                System.out.println("The person's age is " + age + " and can vote.");
            } else {
                System.out.println("The person's age is " + age + " and cannot vote.");
            }

            sc.close();
        }
    }


