package Bridgelabz.first.controlflow.first.second;

import java.util.Scanner;

public class multblw100 {
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

                // Loop backward from 100 to 1
                for (int i = 100; i >= 1; i--) {
                    if (i % number == 0) {
                        System.out.println(i);
                    }
                }
            }

            sc.close();
        }


}
