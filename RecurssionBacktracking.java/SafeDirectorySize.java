import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class SafeDirectorySize {

    public static long getDirectorySize(File file, Set<String> visited) throws IOException {

        String canonicalPath = file.getCanonicalPath();
        if (visited.contains(canonicalPath)) {
            return 0;
        }

        visited.add(canonicalPath);

        if (file.isFile()) {
            return file.length();
        }

        long totalSize = 0;

        File[] files = file.listFiles();
        if (files != null) {
            for (File f : files) {
                totalSize += getDirectorySize(f, visited);
            }
        }

        return totalSize;
    }

    public static void main(String[] args) throws IOException {
        File dir = new File("path_to_project_folder");
        Set<String> visited = new HashSet<>();

        long size = getDirectorySize(dir, visited);
        System.out.println("Total size: " + size + " bytes");
    }
}