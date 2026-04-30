class Completed{
public static boolean hasCompletedAllPrerequisitesA(
    int[] completedCourses, int[] prerequisites) {

for (int i = 0; i < prerequisites.length; i++) {
    boolean found = false;

    for (int j = 0; j < completedCourses.length; j++) {
        if (prerequisites[i] == completedCourses[j]) {
            found = true;
            break;
        }
    }

    if (!found) {
        return false;
    }
}

return true;
}
}