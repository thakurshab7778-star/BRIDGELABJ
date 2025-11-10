package Bridgelabz.first.Arrayss.second;

import java.util.Scanner;

public class grade2d {
        public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

            // Step a: Take input for the number of students
            System.out.print("Enter number of students: ");
            int n = sc.nextInt();

            // Step b: Create a 2D array for marks and 1D arrays for percentage and grade
            double[][] marks = new double[n][3];  // physics, chemistry, maths
            double[] percentage = new double[n];
            char[] grade = new char[n];

            // Step c: Take input for marks
            for (int i = 0; i < n; i++) {
                System.out.println("\nEnter marks for Student " + (i + 1) + ":");

                for (int j = 0; j < 3; j++) {
                    String subject = (j == 0) ? "Physics" : (j == 1) ? "Chemistry" : "Maths";
                    System.out.print(subject + ": ");
                    marks[i][j] = sc.nextDouble();

                    // Validation: marks should be between 0 and 100
                    if (marks[i][j] < 0 || marks[i][j] > 100) {
                        System.out.println("❌ Invalid marks! Enter marks between 0–100.");
                        j--; // repeat same subject input
                    }
                }
            }

            // Step d: Calculate percentage and assign grades
            for (int i = 0; i < n; i++) {
                double total = marks[i][0] + marks[i][1] + marks[i][2];
                percentage[i] = total / 3.0;

                if (percentage[i] >= 80)
                    grade[i] = 'A';
                else if (percentage[i] >= 70)
                    grade[i] = 'B';
                else if (percentage[i] >= 60)
                    grade[i] = 'C';
                else if (percentage[i] >= 50)
                    grade[i] = 'D';
                else if (percentage[i] >= 40)
                    grade[i] = 'E';
                else
                    grade[i] = 'R';
            }

            // Step e: Display results
            System.out.println("\n---------------------------------------------------------------");
            System.out.println("Student\tPhysics\tChemistry\tMaths\tPercentage\tGrade");
            System.out.println("---------------------------------------------------------------");

            for (int i = 0; i < n; i++) {
                System.out.printf("%d\t%.2f\t%.2f\t\t%.2f\t%.2f\t\t%c\n",
                        (i + 1), marks[i][0], marks[i][1], marks[i][2], percentage[i], grade[i]);
            }

            System.out.println("---------------------------------------------------------------");
        }
    }

