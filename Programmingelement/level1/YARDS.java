package Bridgelabz.first.Programmingelement.level1;
import java.util.Scanner;

class Yards {
    public static void main(String[] args) {
        double distanceInFeet, distanceInYards, distanceInMiles;

        Scanner input = new Scanner(System.in); // Create Scanner object
        System.out.print("Enter the distance in feet: ");
        distanceInFeet = input.nextDouble(); // Take user input

        // 1 yard = 3 feet
        distanceInYards = distanceInFeet / 3;

        // 1 mile = 1760 yards
        distanceInMiles = distanceInYards / 1760;

        System.out.println("The distance in feet is " + distanceInFeet +
                ", which is equal to " + distanceInYards + " yards" +
                " and " + distanceInMiles + " miles.");

        input.close();
    }
}



