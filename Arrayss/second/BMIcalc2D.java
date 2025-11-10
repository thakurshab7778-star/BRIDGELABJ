package Bridgelabz.first.Arrayss.second;

import java.util.Scanner;

public class BMIcalc2D {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // Step 1: Take input for number of persons
            System.out.print("Enter number of persons: ");
            int number = sc.nextInt();

            // Step 2: Create 2D array for height, weight, and BMI
            // personData[i][0] = weight
            // personData[i][1] = height
            // personData[i][2] = BMI
            double[][] personData = new double[number][3];
            String[] weightStatus = new String[number];

            // Step 3: Take input for weight and height with validation
            for (int i = 0; i < number; i++) {
                System.out.println("\nEnter details for Person " + (i + 1) + ":");

                // Validate weight
                double weight;
                do {
                    System.out.print("Enter weight (in kg): ");
                    weight = sc.nextDouble();
                    if (weight <= 0) {
                        System.out.println("❌ Weight must be positive. Please re-enter.");
                    }
                } while (weight <= 0);

                // Validate height
                double height;
                do {
                    System.out.print("Enter height (in meters): ");
                    height = sc.nextDouble();
                    if (height <= 0) {
                        System.out.println("❌ Height must be positive. Please re-enter.");
                    }
                } while (height <= 0);

                personData[i][0] = weight;
                personData[i][1] = height;
            }

            // Step 4: Calculate BMI and determine weight status
            for (int i = 0; i < number; i++) {
                double weight = personData[i][0];
                double height = personData[i][1];

                double bmi = weight / (height * height);
                personData[i][2] = bmi;

                if (bmi <= 18.4)
                    weightStatus[i] = "Underweight";
                else if (bmi <= 24.9)
                    weightStatus[i] = "Normal";
                else if (bmi <= 39.9)
                    weightStatus[i] = "Overweight";
                else
                    weightStatus[i] = "Obese";
            }

            // Step 5: Display data
            System.out.println("\n------------------------------------------------------------");
            System.out.println("Person\tHeight(m)\tWeight(kg)\tBMI\t\tStatus");
            System.out.println("------------------------------------------------------------");

            for (int i = 0; i < number; i++) {
                System.out.printf("%d\t%.2f\t\t%.2f\t\t%.2f\t%s\n",
                        (i + 1),
                        personData[i][1], // height
                        personData[i][0], // weight
                        personData[i][2], // BMI
                        weightStatus[i]);
            }

            System.out.println("------------------------------------------------------------");
        }
    }


