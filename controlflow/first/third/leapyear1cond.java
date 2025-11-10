package Bridgelabz.first.controlflow.first.third;

import java.util.Scanner;

public class leapyear1cond {
        public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);

            System.out.print("Enter a year: ");
            int year = sc.nextInt();

            // Check for Gregorian calendar and leap year using one if condition
            if (year >= 1582 && ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))) {
                System.out.println(year + " is a Leap Year");
            } else if (year >= 1582) {
                System.out.println(year + " is not a Leap Year");
            } else {
                System.out.println("Leap Year program works only for year >= 1582");
            }

            sc.close();
        }
    }


