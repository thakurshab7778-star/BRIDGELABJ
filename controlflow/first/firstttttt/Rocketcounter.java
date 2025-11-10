package Bridgelabz.first.controlflow.first.firstttttt;

import java.util.Scanner;

public class Rocketcounter {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // Taking user input for countdown start number
            System.out.print("Enter the starting number for countdown: ");
            int counter = sc.nextInt();

            // Countdown loop
            while (counter >= 1) {
                System.out.println(counter);
                counter--;  // Decrement the counter
            }

            // After countdown finishes
            System.out.println("Liftoff! 🚀");

            sc.close();
        }
    }
