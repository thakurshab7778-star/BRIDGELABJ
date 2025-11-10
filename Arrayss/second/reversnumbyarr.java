package Bridgelabz.first.Arrayss.second;

import java.util.Scanner;

public class reversnumbyarr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            // Step 1: Take user input
            System.out.print("Enter a number: ");
            int number = sc.nextInt();

            // Step 2: Find count of digits
            int temp = number;
            int count = 0;
            while (temp != 0) {
                count++;
                temp = temp / 10;
            }

            // Step 3: Store digits in an array
            int[] digits = new int[count];
            temp = number;
            for (int i = 0; i < count; i++) {
                digits[i] = temp % 10;
                temp = temp / 10;
            }

            // Step 4: Create another array to store reverse of digits
            int[] reversedDigits = new int[count];
            for (int i = 0; i < count; i++) {
                reversedDigits[i] = digits[count - 1 - i];
            }

            // Step 5: Display reversed array (reversed number)
            System.out.print("Reversed number: ");
            for (int i = 0; i < count; i++) {
                System.out.print(reversedDigits[i]);
            }

            System.out.println();
        }

}
