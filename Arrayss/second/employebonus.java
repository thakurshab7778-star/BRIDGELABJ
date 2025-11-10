package Bridgelabz.first.Arrayss.second;

import java.util.Scanner;

public class employebonus {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            final int EMP_COUNT = 10; // total employees

            // Step 1: Define arrays
            double[] salary = new double[EMP_COUNT];
            double[] yearsOfService = new double[EMP_COUNT];
            double[] bonus = new double[EMP_COUNT];
            double[] newSalary = new double[EMP_COUNT];

            // Step 2: Define totals
            double totalBonus = 0;
            double totalOldSalary = 0;
            double totalNewSalary = 0;

            // Step 3: Take input for each employee
            for (int i = 0; i < EMP_COUNT; i++) {
                System.out.println("\nEnter details for Employee " + (i + 1));

                // Input salary
                System.out.print("Enter salary: ");
                double sal = sc.nextDouble();

                // Input years of service
                System.out.print("Enter years of service: ");
                double years = sc.nextDouble();

                // Validate input
                if (sal <= 0 || years < 0) {
                    System.out.println("Invalid input! Salary must be > 0 and years >= 0. Please re-enter.");
                    i--; // Decrement to re-enter this employee’s data
                    continue;
                }

                // Store valid input
                salary[i] = sal;
                yearsOfService[i] = years;
            }

            // Step 4: Calculate bonus and new salary
            for (int i = 0; i < EMP_COUNT; i++) {
                if (yearsOfService[i] > 5) {
                    bonus[i] = salary[i] * 0.05; // 5% bonus
                } else {
                    bonus[i] = salary[i] * 0.02; // 2% bonus
                }

                newSalary[i] = salary[i] + bonus[i];

                // Update totals
                totalBonus += bonus[i];
                totalOldSalary += salary[i];
                totalNewSalary += newSalary[i];
            }

            // Step 5: Display results
            System.out.println("\n=== Employee Bonus Details ===");
            for (int i = 0; i < EMP_COUNT; i++) {
                System.out.printf("Employee %d: Old Salary = %.2f, Bonus = %.2f, New Salary = %.2f%n",
                        (i + 1), salary[i], bonus[i], newSalary[i]);
            }

            System.out.println("\n=== Zara Company Summary ===");
            System.out.printf("Total Old Salary: %.2f%n", totalOldSalary);
            System.out.printf("Total Bonus Payout: %.2f%n", totalBonus);
            System.out.printf("Total New Salary: %.2f%n", totalNewSalary);

            sc.close();
        }
    }


