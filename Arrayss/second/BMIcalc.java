package Bridgelabz.first.Arrayss.second;

import java.util.Scanner;

public class BMIcalc {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // Step a: Take input for number of persons
            System.out.print("Enter number of persons: ");
            int n = sc.nextInt();

            // Step b: Create arrays to store weight, height, BMI, and weight status
            double[] weight = new double[n];
            double[] height = new double[n];
            double[] bmi = new double[n];
            String[] status = new String[n];

            // Step c: Take input for weight and height of persons
            for (int i = 0; i < n; i++) {
                System.out.println("\nEnter details for Person " + (i + 1) + ":");
                System.out.print("Enter weight (in kg): ");
                weight[i] = sc.nextDouble();
                System.out.print("Enter height (in meters): ");
                height[i] = sc.nextDouble();
            }

            // Step d: Calculate BMI and determine weight status
            for (int i = 0; i < n; i++) {
                bmi[i] = weight[i] / (height[i] * height[i]);

                if (bmi[i] <= 18.4)
                    status[i] = "Underweight";
                else if (bmi[i] <= 24.9)
                    status[i] = "Normal";
                else if (bmi[i] <= 39.9)
                    status[i] = "Overweight";
                else
                    status[i] = "Obese";
            }

            // Step e: Display height, weight, BMI, and weight status
            System.out.println("\n----------------------------------------------");
            System.out.println("Person\tHeight(m)\tWeight(kg)\tBMI\t\tStatus");
            System.out.println("----------------------------------------------");

            for (int i = 0; i < n; i++) {
                System.out.printf("%d\t%.2f\t\t%.2f\t\t%.2f\t%s\n",
                        (i + 1), height[i], weight[i], bmi[i], status[i]);
            }

            System.out.println("----------------------------------------------");
        }
    }

