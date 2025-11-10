package Bridgelabz.first.controlflow.first.third;

import java.util.Scanner;

public class Bmicalculator {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // Step a: Take user input for weight (kg) and height (cm)
            System.out.print("Enter your weight in kilograms: ");
            double weight = sc.nextDouble();

            System.out.print("Enter your height in centimeters: ");
            double heightCm = sc.nextDouble();

            // Step b: Convert height from cm to meters
            double heightM = heightCm / 100;

            // Calculate BMI using the formula
            double bmi = weight / (heightM * heightM);

            // Step c: Determine BMI status using conditions
            String status;
            if (bmi <= 18.4) {
                status = "Underweight";
            } else if (bmi <= 24.9) {
                status = "Normal";
            } else if (bmi <= 39.9) {
                status = "Overweight";
            } else {
                status = "Obese";
            }

            // Display result
            System.out.println("\n----- BMI Report -----");
            System.out.printf("Weight: %.2f kg\n", weight);
            System.out.printf("Height: %.2f m\n", heightM);
            System.out.printf("BMI: %.2f\n", bmi);
            System.out.println("Status: " + status);

            sc.close();
        }
    }


