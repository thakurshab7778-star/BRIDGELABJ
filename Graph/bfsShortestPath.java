package Graph;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class bfsShortestPath {
    static void bfsShortestPath(Map<String, List<String>> graph,
                            String start, String end) {

    Queue<String> q = new LinkedList<>();
    Map<String, String> parent = new HashMap<>();
    Set<String> visited = new HashSet<>();

    q.add(start);
    visited.add(start);

    while (!q.isEmpty()) {
        String curr = q.poll();

        if (curr.equals(end)) break;

        for (String nei : graph.getOrDefault(curr, new ArrayList<>())) {
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

    System.out.println("Shortest Path: " + path);
}
    
}
