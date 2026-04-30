import java.util.*;

class Hashpair {
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 9;
        System.out.println(hasPair(arr, target));
    }

    static boolean hasPair(int[] arr, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int diff = target - arr[i];

            if (map.containsKey(diff))
                return true;

            map.put(arr[i], i);
        }

        return false;
    }
}