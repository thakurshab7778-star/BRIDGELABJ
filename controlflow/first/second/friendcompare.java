package Bridgelabz.first.controlflow.first.second;

import java.util.Scanner;

public class friendcompare {
        public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);

            // Taking age and height inputs for Amar
            System.out.print("Enter Amar's age: ");
            int ageAmar = sc.nextInt();
            System.out.print("Enter Amar's height (in cm): ");
            int heightAmar = sc.nextInt();

            // Taking age and height inputs for Akbar
            System.out.print("Enter Akbar's age: ");
            int ageAkbar = sc.nextInt();
            System.out.print("Enter Akbar's height (in cm): ");
            int heightAkbar = sc.nextInt();

            // Taking age and height inputs for Anthony
            System.out.print("Enter Anthony's age: ");
            int ageAnthony = sc.nextInt();
            System.out.print("Enter Anthony's height (in cm): ");
            int heightAnthony = sc.nextInt();

            // Finding the youngest friend
            if (ageAmar < ageAkbar && ageAmar < ageAnthony) {
                System.out.println("The youngest friend is Amar.");
            } else if (ageAkbar < ageAmar && ageAkbar < ageAnthony) {
                System.out.println("The youngest friend is Akbar.");
            } else if (ageAnthony < ageAmar && ageAnthony < ageAkbar) {
                System.out.println("The youngest friend is Anthony.");
            } else {
                System.out.println("Two or more friends have the same youngest age.");
            }

            // Finding the tallest friend
            if (heightAmar > heightAkbar && heightAmar > heightAnthony) {
                System.out.println("The tallest friend is Amar.");
            } else if (heightAkbar > heightAmar && heightAkbar > heightAnthony) {
                System.out.println("The tallest friend is Akbar.");
            } else if (heightAnthony > heightAmar && heightAnthony > heightAkbar) {
                System.out.println("The tallest friend is Anthony.");
            } else {
                System.out.println("Two or more friends have the same tallest height.");
            }

            sc.close();
        }
    }


