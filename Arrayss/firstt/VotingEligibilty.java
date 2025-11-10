package Bridgelabz.first.Arrayss.firstt;

import java.util.Scanner;

public class VotingEligibilty {
        public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);

            // Step 1: Define an array to store ages of 10 students
            int[] ages = new int[10];

            // Step 2: Take user input for each student's age
            System.out.println("Enter the ages of 10 students:");
            for (int i = 0; i < ages.length; i++) {
                System.out.print("Enter age for student " + (i + 1) + ": ");
                ages[i] = sc.nextInt();
            }

            System.out.println("\n--- Voting Eligibility Results ---");

            // Step 3: Check eligibility for each student
            for (int i = 0; i < ages.length; i++) {
                int age = ages[i];

                if (age < 0) {
                    System.out.println("Student " + (i + 1) + " has an INVALID age: " + age);
                }
                else if (age >= 18) {
                    System.out.println("Student " + (i + 1) + " with age " + age + " can vote.");
                }
                else {
                    System.out.println("Student " + (i + 1) + " with age " + age + " cannot vote.");
                }
            }

            sc.close();
        }

}
