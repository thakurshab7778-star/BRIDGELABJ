import java.util.HashSet;

public class CompletedAll {
    

public static boolean hasCompletedAllPrerequisitesB(
        int[] completedCourses, int[] prerequisites) {

    HashSet<Integer> completedSet = new HashSet<>();

    for (int course : completedCourses) {
        completedSet.add(course);
    }

    for (int prereq : prerequisites) {
        if (!completedSet.contains(prereq)) {
            return false;
        }
    }

    return true;
}
    
}
