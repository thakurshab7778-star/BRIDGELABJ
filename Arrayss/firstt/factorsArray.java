package Bridgelabz.first.Arrayss.firstt;

import java.util.Scanner;

public class factorsArray {
        public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);

            // Step 1: Take input from user
            System.out.print("Enter a number: ");
            int number = sc.nextInt();

            // Step 2: Check for natural number
            if (number <= 0) {
                System.out.println("Error: Please enter a natural number (greater than 0).");
                return;
            }

            // Step 3: Initialize variables
            int maxFactor = 10;
            int[] factors = new int[maxFactor];
            int index = 0;

            // Step 4: Find factors
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    // Resize array if needed
                    if (index == maxFactor) {
                        // Double the array size
                        maxFactor = maxFactor * 2;
                        int[] temp = new int[maxFactor];

                        // Copy old factors to temp
                        for (int j = 0; j < factors.length; j++) {
                            temp[j] = factors[j];
                        }
                        factors = temp; // Assign new larger array
                    }
                    // Add factor to array
                    factors[index] = i;
                    index++;
                }
            }

            // Step 5: Display the factors
            System.out.print("Factors of " + number + " are: ");
            for (int i = 0; i < index; i++) {
                System.out.print(factors[i] + " ");
            }

            sc.close();
        }

}
