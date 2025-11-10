package Bridgelabz.first.Arrayss.firstt;

import java.util.Scanner;

public class Numbercheck {
        public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);

            // Step 1: Define an integer array of 5 elements
            int[] numbers = new int[5];

            // Step 2: Get user input for the array
            System.out.println("Enter 5 numbers:");
            for (int i = 0; i < numbers.length; i++) {
                System.out.print("Enter number " + (i + 1) + ": ");
                numbers[i] = sc.nextInt();
            }

            System.out.println("\n--- Number Analysis ---");

            // Step 3: Loop through array and check for conditions
            for (int i = 0; i < numbers.length; i++) {
                int num = numbers[i];

                if (num > 0) {
                    // Positive number
                    if (num % 2 == 0) {
                        System.out.println("Number " + num + " is Positive and Even");
                    } else {
                        System.out.println("Number " + num + " is Positive and Odd");
                    }
                }
                else if (num < 0) {
                    // Negative number
                    System.out.println("Number " + num + " is Negative");
                }
                else {
                    // Zero
                    System.out.println("Number " + num + " is Zero");
                }
            }

            // Step 4: Compare first and last elements
            int first = numbers[0];
            int last = numbers[numbers.length - 1];

            System.out.println("\n--- Comparison of First and Last Elements ---");
            if (first == last) {
                System.out.println("First element (" + first + ") and Last element (" + last + ") are Equal");
            }
            else if (first > last) {
                System.out.println("First element (" + first + ") is Greater than Last element (" + last + ")");
            }
            else {
                System.out.println("First element (" + first + ") is Less than Last element (" + last + ")");
            }

            sc.close();
        }

}
