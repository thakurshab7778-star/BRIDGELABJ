package Bridgelabz.first.Arrayss.firstt;

import java.util.Scanner;

public class Sumofarray {
        public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);

            // Step 1: Create an array of 10 elements
            double[] numbers = new double[10];
            double total = 0.0; // to store sum
            int index = 0;      // to track current array position

            System.out.println("Enter up to 10 positive numbers (enter 0 or negative to stop):");

            // Step 2: Infinite loop for input
            while (true) {
                System.out.print("Enter number " + (index + 1) + ": ");
                double num = sc.nextDouble();

                // Step 3: Check for stop condition
                if (num <= 0) {
                    System.out.println("Input stopped (0 or negative number entered).");
                    break;
                }

                // Step 4: Check array limit
                if (index == 10) {
                    System.out.println("Maximum limit (10 numbers) reached.");
                    break;
                }

                // Step 5: Store the number in array and increment index
                numbers[index] = num;
                index++;
            }

            // Step 6: Display stored numbers and calculate total
            System.out.println("\n--- Numbers Entered ---");
            for (int i = 0; i < index; i++) {
                System.out.println("Number " + (i + 1) + ": " + numbers[i]);
                total += numbers[i];
            }

            // Step 7: Display total sum
            System.out.println("\nTotal of all numbers = " + total);

            sc.close();
        }
    }

