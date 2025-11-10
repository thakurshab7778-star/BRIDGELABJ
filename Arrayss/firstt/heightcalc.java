package Bridgelabz.first.Arrayss.firstt;

import java.util.Scanner;

public class heightcalc {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // Step 1: Create a double array of size 11
            double[] heights = new double[11];
            double sum = 0.0;

            // Step 2: Get input values for each player's height
            System.out.println("Enter the height (in cm) of 11 football players:");
            for (int i = 0; i < heights.length; i++) {
                System.out.print("Enter height of player " + (i + 1) + ": ");
                heights[i] = sc.nextDouble();
                sum += heights[i]; // Add to total sum
            }

            // Step 3: Calculate mean height
            double mean = sum / heights.length;

            // Step 4: Display result
            System.out.println("\n--- Result ---");
            System.out.println("Sum of all heights = " + sum);
            System.out.println("Mean height of the football team = " + mean + " cm");

            sc.close();
        }
    }


