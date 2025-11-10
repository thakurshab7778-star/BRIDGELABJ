package Bridgelabz.first.controlflow.first.second;

import java.util.Scanner;

public class pwrwhlloop {
        public static void main(String[] args) {
            Scanner  sc = new Scanner(System.in);
            System.out.print("Enter the base number: ");
            int number = sc.nextInt();

            System.out.print("Enter the power (exponent): ");
            int power = sc.nextInt();
            int result = 1;
            int counter = 0;
            if (number < 0 || power < 0) {
                System.out.println("Please enter positive integers for both base and power.");
            } else {

                while (counter < power) {
                    result = result * number;
                    counter++; // Increment counter
                }
                System.out.println(number + " raised to the power " + power + " is: " + result);
            }

            sc.close();
        }


}
