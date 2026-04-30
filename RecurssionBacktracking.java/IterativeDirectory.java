package RecurssionBacktracking.java;
import java.io.File;
import java.util.Stack;
public class IterativeDirectory {
    

    public static long getDirectorySize(File root) {
        long totalSize = 0;
        Stack<File> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            File current = stack.pop();

            if (current.isFile()) {
                totalSize += current.length();
            } else {
                File[] files = current.listFiles();
                if (files != null) {
                    for (File f : files) {
                        stack.push(f);
                    }
                }
            }
        }

        return totalSize;
    }

}
