
public class AverageTemperature {

        public static double calculateAverage(int[] temperature, int n) {
            // Edge case handling
            if (n == 0) {
                throw new IllegalArgumentException("Number of days (n) cannot be zero.");
            }
    
            double total = 0;
    
            for (int i = 0; i < n; i++) {
                total += temperature[i];
            }
    
            return total / n;
        }
    
        public static void main(String[] args) {
            int[] temperatures = {20, 25, 22, 24, 21};
            int n = temperatures.length;
    
            double average = calculateAverage(temperatures, n);
            System.out.println("Average Temperature: " + average);
        }
    }

