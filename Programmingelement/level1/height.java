package Bridgelabz.first.Programmingelement.level1;

import java.util.Scanner;

public class height {


        public static void main(String[] args) {
            double heightCm, totalInches, feet, inches;
            Scanner input = new Scanner(System.in); // Create Scanner object
            System.out.print("Enter your height in centimeters: ");
            heightCm = input.nextDouble(); // Take user input

            // 1 inch = 2.54 cm → convert cm to inches
            totalInches = heightCm / 2.54;

            // 1 foot = 12 inches
            feet = (int)(totalInches / 12); // Get whole feet
            inches = totalInches % 12;      // Remaining inches

            System.out.println("Your Height in cm is " + heightCm +
                    " while in feet is " + feet +
                    " and inches is " + String.format("%.2f", inches));

            input.close();
        }
    }


