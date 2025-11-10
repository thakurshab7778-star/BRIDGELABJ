package Bridgelabz.first.controlflow.first.third;

import java.util.Scanner;

public class DAyofweek {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Get user input for date
        System.out.print("Enter month (1-12): ");
        int m = sc.nextInt();

        System.out.print("Enter day (1-31): ");
        int d = sc.nextInt();

        System.out.print("Enter year (e.g., 2025): ");
        int y = sc.nextInt();

        // Step 2: Apply the given formulas
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + (31 * m0) / 12) % 7;

        // Step 3: Print result
        System.out.println("\n0 = Sunday, 1 = Monday, 2 = Tuesday, 3 = Wednesday, 4 = Thursday, 5 = Friday, 6 = Saturday");
        System.out.println("Day of the week: " + d0);

        sc.close();
    }
}

