package Bridgelabz.first.Arrayss.firstt;

import java.util.Scanner;

public class oddevenarr {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // Step 1: Get integer input
            System.out.print("Enter a natural number: ");
            int number = sc.nextInt();

            // Step 2: Check if number is a natural number
            if (number <= 0) {
                System.out.println("Error: Please enter a natural number (greater than 0).");
                sc.close();
                return;
            }

            // Step 3: Create arrays for even and odd numbers
            int size = number / 2 + 1;
            int[] evenNumbers = new int[size];
            int[] oddNumbers = new int[size];

            // Step 4: Create index variables
            int evenIndex = 0;
            int oddIndex = 0;

            // Step 5: Loop from 1 to number and store in arrays
            for (int i = 1; i <= number; i++) {
                if (i % 2 == 0) {
                    evenNumbers[evenIndex] = i;
                    evenIndex++;
                } else {
                    oddNumbers[oddIndex] = i;
                    oddIndex++;
                }
            }

            // Step 6: Print odd and even arrays
            System.out.println("\nOdd Numbers:");
            for (int i = 0; i < oddIndex; i++) {
                System.out.print(oddNumbers[i] + " ");
            }

            System.out.println("\n\nEven Numbers:");
            for (int i = 0; i < evenIndex; i++) {
                System.out.print(evenNumbers[i] + " ");
            }

            sc.close();
        }
    }

