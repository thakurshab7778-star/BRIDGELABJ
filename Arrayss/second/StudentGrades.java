package Bridgelabz.first.Arrayss.second;

import java.util.Scanner;

public class StudentGrades {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // Step a: Take input for the number of students
            System.out.print("Enter number of students: ");
            int n = sc.nextInt();

            // Step b: Create arrays to store marks, percentages, and grades
            double[][] marks = new double[n][3];  // physics, chemistry, maths
            double[] percentage = new double[n];
            char[] grade = new char[n];

            // Step c: Take input for marks of students
            for (int i = 0; i < n; i++) {
                System.out.println("\nEnter marks for Student " + (i + 1) + ":");

                // Physics
                System.out.print("Physics: ");
                marks[i][0] = sc.nextDouble();
                if (marks[i][0] < 0 || marks[i][0] > 100) {
                    System.out.println("❌ Invalid marks! Enter positive marks between 0-100.");
                    i--;  // Repeat this student’s input
                    continue;
                }

                // Chemistry
                System.out.print("Chemistry: ");
                marks[i][1] = sc.nextDouble();
                if (marks[i][1] < 0 || marks[i][1] > 100) {
                    System.out.println("❌ Invalid marks! Enter positive marks between 0-100.");
                    i--;
                    continue;
                }

                // Maths
                System.out.print("Maths: ");
                marks[i][2] = sc.nextDouble();
                if (marks[i][2] < 0 || marks[i][2] > 100) {
                    System.out.println("❌ Invalid marks! Enter positive marks between 0-100.");
                    i--;
                    continue;
                }
            }

            // Step d: Calculate percentage and assign grade
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

