package Bridgelabz.first.Arrayss.second;

import java.util.Scanner;

public class Digitfreq {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // Step 1: Take input for a number
            System.out.print("Enter a number: ");
            long number = sc.nextLong();

            // Step 2: Handle negative numbers
            if (number < 0) {
                number = -number;
            }

            // Step 3: Find count of digits
            String numStr = Long.toString(number);
            int count = numStr.length();

            // Step 4: Store digits in an array
            int[] digits = new int[count];
            for (int i = 0; i < count; i++) {
                digits[i] = numStr.charAt(i) - '0';  // convert char to int
            }

            // Step 5: Define frequency array and calculate frequency
            int[] frequency = new int[10]; // For digits 0 to 9

            for (int i = 0; i < count; i++) {
                frequency[digits[i]]++;
            }

            // Step 6: Display frequency of each digit
            System.out.println("\nDigit\tFrequency");
            System.out.println("-----------------");

            for (int i = 0; i < 10; i++) {
                if (frequency[i] > 0) { // Only display digits that appear
                    System.out.println(i + "\t" + frequency[i]);
                }
            }
        }
    }


