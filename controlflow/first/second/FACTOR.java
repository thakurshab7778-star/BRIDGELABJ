package Bridgelabz.first.controlflow.first.second;

import java.util.Scanner;

public class FACTOR {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // Taking input
            System.out.print("Enter a positive integer: ");
            int number = sc.nextInt();

            // Check for positive integer
            if (number <= 0) {
                System.out.println("Please enter a positive integer greater than 0.");
            } else {
                System.out.println("The factors of " + number + " are:");

                // Loop to find factors
                for (int i = 1; i <= number; i++) {
                    if (number % i == 0) {
                        System.out.println(i);
                    }
                }
            }

            sc.close();
        }
    }


