import java.util.*;

public class SocielNetwork {

    Map<String, List<String>> graph = new HashMap<>();

    
    void addFriendship(String u, String v) {
        graph.putIfAbsent(u, new ArrayList<>());
        graph.putIfAbsent(v, new ArrayList<>());

        graph.get(u).add(v);
        graph.get(v).add(u);
    }


    void getFriends(String user) {
        System.out.println("Friends of " + user + ": " + graph.get(user));
    }
    boolean isDirectFriend(String u, String v) {
        return graph.get(u).contains(v);
    }
    void shortestPath(String start, String end) {

        Queue<String> queue = new LinkedList<>();
        Map<String, String> parent = new HashMap<>();
        Set<String> visited = new HashSet<>();

        queue.add(start);
        visited.add(start);

        while (!queue.isEmpty()) {
            String curr = queue.poll();

            if (curr.equals(end)) break;

            for (String neighbor : graph.get(curr)) {
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    parent.put(neighbor, curr);
                    queue.add(neighbor);
                }
            }
        }

        List<String> path = new ArrayList<>();
        String curr = end;

        while (curr != null) {
            path.add(curr);
            curr = parent.get(curr);
        }

        Collections.reverse(path);

        System.out.println("Shortest Path: " + path);
        System.out.println("Degree of Separation: " + (path.size() - 1));
    }

    public static void main(String[] args) {

        SocielNetwork sn = new SocielNetwork();

        sn.addFriendship("Alice", "Bob");
        sn.addFriendship("Alice", "Charlie");
        sn.addFriendship("Bob", "David");
        sn.addFriendship("Charlie", "Eve");
        sn.addFriendship("David", "Eve");

        sn.getFriends("Alice");

        System.out.println("Bob & Eve directly connected? " +
                sn.isDirectFriend("Bob", "Eve"));

        sn.shortestPath("Alice", "Eve");
    }
}