package JavaString.Level2;
import java.util.Scanner;

public class SplitText {

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
    public static String[] splitText(String text) {
        int length = findLength(text);
        int wordCount = 1;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }
        int[] spaceIndexes = new int[wordCount - 1];
        int spaceIndexCounter = 0;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndexes[spaceIndexCounter++] = i;
            }
        }
        String[] words = new String[wordCount];
        int start = 0;
        for (int i = 0; i < wordCount; i++) {
            int end = (i < wordCount - 1) ? spaceIndexes[i] : length;
            StringBuilder word = new StringBuilder();
            for (int j = start; j < end; j++) {
                word.append(text.charAt(j));
            }
            words[i] = word.toString();
            start = end + 1;
        }
        return words;
    }

    public static boolean compareStringArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a line of text: ");
        String input = scanner.nextLine();

        String[] splitByMethod = input.split(" ");
        String[] splitByCustomMethod = splitText(input);

        System.out.println("Split using built-in split():");
        for (String word : splitByMethod) {
            System.out.println(word);
        }

        System.out.println("Split using custom method:");
        for (String word : splitByCustomMethod) {
            System.out.println(word);
        }

        boolean isEqual = compareStringArrays(splitByMethod, splitByCustomMethod);
        System.out.println("Are both splits equal? " + isEqual);

        scanner.close();
    }
}
