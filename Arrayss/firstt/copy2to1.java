package Bridgelabz.first.Arrayss.firstt;

import java.util.Scanner;

public class copy2to1 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            // Step 1: Take input for rows and columns
            System.out.print("Enter number of rows: ");
            int rows = sc.nextInt();
            System.out.print("Enter number of columns: ");
            int cols = sc.nextInt();

            // Step 2: Create a 2D array (Matrix)
            int[][] matrix = new int[rows][cols];

            // Step 3: Take user input for matrix elements
            System.out.println("Enter elements of the matrix:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    System.out.print("Element [" + i + "][" + j + "]: ");
                    matrix[i][j] = sc.nextInt();
                }
            }

            // Step 4: Create a 1D array to store elements of 2D array
            int[] array = new int[rows * cols];
            int index = 0;

            // Step 5: Copy elements from 2D array to 1D array
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    array[index] = matrix[i][j];
                    index++;
                }
            }

            // Step 6: Display the 2D array
            System.out.println("\nThe 2D Array (Matrix):");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }

            // Step 7: Display the copied 1D array
            System.out.println("\nThe Copied 1D Array:");
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }

            sc.close();
        }

}
