package Bridgelabz.first.controlflow.first.second;

import java.util.Scanner;

public class factorwhile {
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

                int i = 1;  // counter variable

                // Loop using while
                while (i <= number) {
                    if (number % i == 0) {
                        System.out.println(i);
                    }
                    i++; // increment counter
                }
            }

            sc.close();
        }

}
