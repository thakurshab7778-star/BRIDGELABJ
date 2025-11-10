package Bridgelabz.first.Arrayss.second;

import java.util.Scanner;

public class Youngtall {
        public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);

            String[] names = {"Amar", "Akbar", "Anthony"};
            double[] ages = new double[3];
            double[] heights = new double[3];

            // Taking input for ages and heights
            for (int i = 0; i < 3; i++) {
                System.out.print("Enter age of " + names[i] + ": ");
                ages[i] = sc.nextDouble();
                System.out.print("Enter height (in cm) of " + names[i] + ": ");
                heights[i] = sc.nextDouble();
                System.out.println();
            }

            // Initialize with first friend’s values
            int youngestIndex = 0;
            int tallestIndex = 0;

            // Find youngest and tallest
            for (int i = 1; i < 3; i++) {
                if (ages[i] < ages[youngestIndex]) {
                    youngestIndex = i;
                }
                if (heights[i] > heights[tallestIndex]) {
                    tallestIndex = i;
                }
            }

            // Display results
            System.out.println("The youngest friend is " + names[youngestIndex] + " with age " + ages[youngestIndex] + " years.");
            System.out.println("The tallest friend is " + names[tallestIndex] + " with height " + heights[tallestIndex] + " cm.");

            sc.close();
        }
    }

