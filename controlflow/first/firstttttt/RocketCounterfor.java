package Bridgelabz.first.controlflow.first.firstttttt;

import java.util.Scanner;

public class RocketCounterfor {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // Take user input
            System.out.print("Enter the starting number for countdown: ");
            int counter = sc.nextInt();

            // Countdown using for loop
            for (int i = counter; i >= 1; i--) {
                System.out.println(i);
            }

            System.out.println("Liftoff! 🚀");
            sc.close();
        }
    }


