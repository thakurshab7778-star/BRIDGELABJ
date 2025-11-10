package Bridgelabz.first.Arrayss.second;

import java.util.Scanner;

public class largestandsecondlargest {
        public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

            // Step 1: Take user input
            System.out.print("Enter a number: ");
            int number = sc.nextInt();

            // Step 2: Define array to store digits
            int maxDigit = 10;
            int[] digits = new int[maxDigit];
            int index = 0;

            // Step 3: Extract digits and store in array
            while (number != 0) {
                int digit = number % 10;
                digits[index] = digit;
                index++;
                number = number / 10;

                if (index == maxDigit) {
                    System.out.println("Maximum digit limit reached! Remaining digits are ignored.");
                    break;
                }
            }

            // Step 4: Initialize largest and second largest variables
            int largest = -1;
            int secondLargest = -1;

            // Step 5: Loop through digits to find largest and second largest
            for (int i = 0; i < index; i++) {
                int current = digits[i];
                if (current > largest) {
                    secondLargest = largest;
                    largest = current;
                } else if (current > secondLargest && current != largest) {
                    secondLargest = current;
                }
            }

            // Step 6: Display the results
            System.out.println("Largest digit: " + largest);
            if (secondLargest == -1)
                System.out.println("Second largest digit: Not available (all digits same or only one digit)");
            else
                System.out.println("Second largest digit: " + secondLargest);
        }
    }


