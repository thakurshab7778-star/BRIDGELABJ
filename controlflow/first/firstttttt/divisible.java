package Bridgelabz.first.controlflow.first.firstttttt;

import java.util.Scanner;

public class divisible {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // Taking input
            System.out.print("Enter a number: ");
            int number = sc.nextInt();

            // Checking divisibility by 5
            boolean isDivisible = (number % 5 == 0);

            // Displaying result
            System.out.println("Is the number " + number + " divisible by 5? " + isDivisible);

            sc.close();
        }
    }


