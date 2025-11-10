package Bridgelabz.first.controlflow.first.firstttttt;
import java.util.Scanner;
public class Sammlesetof3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking inputs
        System.out.print("Enter the first number: ");
        int number1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = sc.nextInt();

        System.out.print("Enter the third number: ");
        int number3 = sc.nextInt();

        // Check if the first number is the smallest
        boolean isSmallest = (number1 < number2) && (number1 < number3);

        // Display result
        System.out.println("Is the first number the smallest? " + isSmallest);

        sc.close();
    }
}
