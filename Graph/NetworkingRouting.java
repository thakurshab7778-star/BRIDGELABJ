import java.util.*;

public class NetworkingRouting {

    static void bfs(Map<String, List<String>> graph, String start, String end) {

        Queue<String> q = new LinkedList<>();
        Map<String, String> parent = new HashMap<>();
        Set<String> visited = new HashSet<>();

        q.add(start);
        visited.add(start);

        while (!q.isEmpty()) {
            String curr = q.poll();

            if (curr.equals(end)) break;

            for (String nei : graph.get(curr)) {
                if (!visited.contains(nei)) {
                    visited.add(nei);
                    parent.put(nei, curr);
                    q.add(nei);
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

        System.out.println("Path: " + path);
        System.out.println("Hops: " + (path.size() - 1));
    }

    public static void main(String[] args) {

        Map<String, List<String>> graph = new HashMap<>();

        graph.put("R1", Arrays.asList("R2", "R3"));
        graph.put("R2", Arrays.asList("R1", "R4"));
        graph.put("R3", Arrays.asList("R1", "R4"));
        graph.put("R4", Arrays.asList("R2", "R3", "R5"));
        graph.put("R5", Arrays.asList("R4", "R6"));
        graph.put("R6", Arrays.asList("R5"));

        bfs(graph, "R1", "R6");
    }
}