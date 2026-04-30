 package RecurssionBacktracking.java;

import java.io.File {
    
public class DirectorySizeCalculator {

    public static long getDirectorySize(File file) {
        if (file.isFile()) {
            return file.length();
        }

        long totalSize = 0;

        File[] files = file.listFiles();
        if (files != null) {
            for (File f : files) {
                totalSize += getDirectorySize(f);
            }
        }

        return totalSize;
    }

    public static void main(String[] args) {
        File directory = new File("path_to_project_folder");
        long size = getDirectorySize(directory);
        System.out.println("Total size: " + size + " bytes");
    }
}
    
}
