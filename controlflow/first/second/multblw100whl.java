package Bridgelabz.first.controlflow.first.second;

import java.util.Scanner;

public class multblw100whl {
        public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);

            // Taking input
            System.out.print("Enter a positive integer less than 100: ");
            int number = sc.nextInt();

            // Check for valid input
            if (number <= 0 || number >= 100) {
                System.out.println("Please enter a positive integer less than 100.");
            } else {
                System.out.println("Multiples of " + number + " below 100 are:");

                int counter = 100; // Start from 100

                // Loop backward using while
                while (counter > 1) {
                    if (counter % number == 0) {
                        System.out.println(counter);
                    }
                    counter--; // Decrement counter
                }
            }

            sc.close();
        }


}
