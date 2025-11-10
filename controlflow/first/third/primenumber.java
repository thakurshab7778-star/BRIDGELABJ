package Bridgelabz.first.controlflow.first.third;

import java.util.Scanner;

public class primenumber {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // Input from user
            System.out.print("Enter a number: ");
            int number = sc.nextInt();

            boolean isPrime = true; // Assume number is prime initially

            // Prime numbers are greater than 1
            if (number > 1) {
                // Loop from 2 to number-1
                for (int i = 2; i < number; i++) {
                    if (number % i == 0) {
                        isPrime = false; // Not a prime number
                        break; // Exit loop once divisible
                    }
                }

                // Display result
                if (isPrime) {
                    System.out.println(number + " is a Prime Number");
                } else {
                    System.out.println(number + " is not a Prime Number");
                }

            } else {
                System.out.println("Prime numbers are greater than 1");
            }

            sc.close();
        }

}
