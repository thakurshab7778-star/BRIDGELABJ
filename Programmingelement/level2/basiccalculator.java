package Bridgelabz.first.Programmingelement.level2;

import java.util.Scanner;

class BasicCalculator {
    public static void main(String[] args) {
        double number1, number2;
        double addition, subtraction, multiplication, division;

        Scanner input = new Scanner(System.in); // Create Scanner object

        System.out.print("Enter first number: ");
        number1 = input.nextDouble();

        System.out.print("Enter second number: ");
        number2 = input.nextDouble();

        // Perform arithmetic operations
        addition = number1 + number2;
        subtraction = number1 - number2;
        multiplication = number1 * number2;
        division = number1 / number2;

        // Display all results in one statement
        System.out.println("The addition, subtraction, multiplication, and division value of 2 numbers "
                + number1 + " and " + number2 + " is "
                + addition + ", " + subtraction + ", " + multiplication + ", and " + division);

        input.close();
    }
}


