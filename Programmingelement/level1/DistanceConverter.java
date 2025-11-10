package Bridgelabz.first.Programmingelement.level1;

public class DistanceConverter {
    public static void main(String[] args) {
        double kilometers = 10.8;
        double milesPerKm = 1.6;   // 1 km = 1.6 miles
        double miles = kilometers * milesPerKm;

        System.out.println("The distance " + kilometers + " km in miles is " + miles);
    }
}

