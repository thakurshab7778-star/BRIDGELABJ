package Bridgelabz.first.Arrayss.second;

import java.util.Scanner;

public class dynamic {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // Step 1: Take user input
            System.out.print("Enter a number: ");
            int number = sc.nextInt();

            // Step 2: Define initial array and variables
            int maxDigit = 10;
            int[] digits = new int[maxDigit];
            int index = 0;

            // Step 3: Extract digits and store in array
            while (number != 0) {
                int digit = number % 10;

                // Step 4: If index == maxDigit, increase array size by 10
                if (index == maxDigit) {
                    maxDigit += 10;
                    int[] temp = new int[maxDigit];

                    // Copy existing digits into new array
                    for (int i = 0; i < index; i++) {
                        temp[i] = digits[i];
                    }

                    // Assign new array to digits
                    digits = temp;
                }

                digits[index] = digit;
                index++;
                number = number / 10;
            }

            // Step 5: Initialize largest and second largest
            int largest = -1;
            int secondLargest = -1;

            // Step 6: Find largest and second largest digit
            for (int i = 0; i < index; i++) {
                int current = digits[i];
                if (current > largest) {
                    secondLargest = largest;
                    largest = current;
                } else if (current > secondLargest && current != largest) {
                    secondLargest = current;
                }
            }

            // Step 7: Display results
            System.out.println("Largest digit: " + largest);
            if (secondLargest == -1)
                System.out.println("Second largest digit: Not available (all digits same or only one digit)");
            else
                System.out.println("Second largest digit: " + secondLargest);
        }
    }


