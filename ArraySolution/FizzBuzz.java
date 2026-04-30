package ArraySolution;

import java.util.Scanner;

public class FizzBuzz {
    
   
   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.print("Enter a positive number: ");
      int var2 = var1.nextInt();
      if (var2 <= 0) {
         System.out.println("Invalid input! Please enter a positive integer.");
      } else {
         String[] var3 = new String[var2 + 1];

         for(int var4 = 0; var4 <= var2; ++var4) {
            if (var4 == 0) {
               var3[var4] = "0";
            } else if (var4 % 3 == 0 && var4 % 5 == 0) {
               var3[var4] = "FizzBuzz";
            } else if (var4 % 3 == 0) {
               var3[var4] = "Fizz";
            } else if (var4 % 5 == 0) {
               var3[var4] = "Buzz";
            } else {
               var3[var4] = String.valueOf(var4);
            }
         }

         System.out.println("\nFizzBuzz Results:");

         for(int var5 = 1; var5 <= var2; ++var5) {
            System.out.println("Position " + var5 + " = " + var3[var5]);
         }

         var1.close();
      }
   }
}

    

