package JavaString.Level2;
import java.util.Scanner;

public class LengthOfString {

    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.next();
        int lengthWithoutLengthMethod = findLength(input);
        int lengthWithLengthMethod = input.length();
        System.out.println("Length found without using length(): " + lengthWithoutLengthMethod);
        System.out.println("Length found using length(): " + lengthWithLengthMethod);
        scanner.close();
    }
}
