package Bridgelabz.first.controlflow.first.third;

import java.util.Scanner;

public class StudentGrade {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // Input marks for three subjects
            System.out.print("Enter marks in Physics: ");
            double physics = sc.nextDouble();

            System.out.print("Enter marks in Chemistry: ");
            double chemistry = sc.nextDouble();

            System.out.print("Enter marks in Maths: ");
            double maths = sc.nextDouble();

            // Calculate average
            double average = (physics + chemistry + maths) / 3;

            String grade, remarks;

            // Determine grade and remarks
            if (average >= 80) {
                grade = "A";
                remarks = "Level 4, above agency-normalized standards";
            } else if (average >= 70) {
                grade = "B";
                remarks = "Level 3, at agency-normalized standards";
            } else if (average >= 60) {
                grade = "C";
                remarks = "Level 2, below, but approaching agency-normalized standards";
            } else if (average >= 50) {
                grade = "D";
                remarks = "Level 1, well below agency-normalized standards";
            } else if (average >= 40) {
                grade = "E";
                remarks = "Level 1-, too below agency-normalized standards";
            } else {
                grade = "R";
                remarks = "Remedial standards";
            }

            // Output result
            System.out.println("\n----- Result -----");
            System.out.printf("Average Marks: %.2f%%\n", average);
            System.out.println("Grade: " + grade);
            System.out.println("Remarks: " + remarks);

            sc.close();
        }
    }


