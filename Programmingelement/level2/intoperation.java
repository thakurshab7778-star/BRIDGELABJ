package Bridgelabz.first.Programmingelement.level2;

import java.util.Scanner;

public class intoperation {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // Taking integer inputs
            System.out.print("Enter value for a: ");
            int a = sc.nextInt();

            System.out.print("Enter value for b: ");
            int b = sc.nextInt();

            System.out.print("Enter value for c: ");
            int c = sc.nextInt();

            // Performing integer operations
            int result1 = a + b * c;     // Multiplication (*) has higher precedence than addition (+)
            int result2 = a * b + c;     // Multiplication (*) before addition (+)
            int result3 = c + a / b;     // Division (/) before addition (+)
            int result4 = a % b + c;     // Modulus (%) before addition (+)

            // Displaying results
            System.out.println("The results of Int Operations are " + result1 + ", " + result2 + ", " + result3 + ", and " + result4);

            sc.close();
        }
    }


