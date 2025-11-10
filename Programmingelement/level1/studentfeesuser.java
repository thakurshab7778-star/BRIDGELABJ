package Bridgelabz.first.Programmingelement.level1;

import java.util.Scanner;

public class studentfeesuser {


    public static void main(String[] args) {
        double km, miles;

        Scanner input = new Scanner(System.in); // Create Scanner object
        System.out.print("Enter distance in kilometers: ");
        km = input.nextDouble(); // Take user input

        miles = km / 1.6; // 1 mile = 1.6 km

        System.out.println("The total miles is " + miles + " mile for the given " + km + " km");

        input.close();
    }
}


