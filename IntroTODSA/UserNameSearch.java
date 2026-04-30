import java.util.*;

public class UserNameSearch {

    public static void main(String[] args) {
        String[] users = {"alice", "bob", "charlie", "david", "emma"};

        System.out.println(linearSearch(users, "charlie"));

        Arrays.sort(users);
        System.out.println(binarySearch(users, "charlie"));

        HashSet<String> userSet = new HashSet<>(Arrays.asList(users));
        System.out.println(hashSearch(userSet, "charlie"));
    }

    public static boolean linearSearch(String[] userList, String target) {
        for (String user : userList) {
            if (user.equals(target)) {
                return true;
            }
        }
        return false;
    }

    public static boolean binarySearch(String[] sortedList, String target) {
        int left = 0, right = sortedList.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int cmp = sortedList[mid].compareTo(target);

            if (cmp == 0) return true;
            else if (cmp < 0) left = mid + 1;
            else right = mid - 1;
        }
        return false;
    }

    public static boolean hashSearch(HashSet<String> userSet, String target) {
        return userSet.contains(target);
    }
}