import java.util.*;

public class CourseGraph {

    Map<String, List<String>> graph = new HashMap<>();

    void addEdge(String u, String v) {
        graph.putIfAbsent(u, new ArrayList<>());
        graph.putIfAbsent(v, new ArrayList<>());
        graph.get(u).add(v);
    }
    boolean hasCycleUtil(String node, Set<String> visited, Set<String> stack) {
        if (stack.contains(node)) return true;
        if (visited.contains(node)) return false;

        visited.add(node);
        stack.add(node);

        for (String neighbor : graph.get(node)) {
            if (hasCycleUtil(neighbor, visited, stack))
                return true;
        }

        stack.remove(node);
        return false;
    }

    boolean hasCycle() {
        Set<String> visited = new HashSet<>();
        Set<String> stack = new HashSet<>();

        for (String node : graph.keySet()) {
            if (hasCycleUtil(node, visited, stack))
                return true;
        }
        return false;
    }
    void findPrerequisites(String target) {
        Set<String> result = new HashSet<>();

        for (String node : graph.keySet()) {
            dfsCheck(node, target, result, new HashSet<>());
        }

        System.out.println("Courses before " + target + ": " + result);
    }

    boolean dfsCheck(String curr, String target, Set<String> result, Set<String> visited) {
        if (curr.equals(target)) return true;

        visited.add(curr);

        for (String neighbor : graph.get(curr)) {
            if (!visited.contains(neighbor)) {
                if (dfsCheck(neighbor, target, result, visited)) {
                    result.add(curr);
                    return true;
                }
            }
        }
        return false;
    }

    void topologicalSort() {
        Map<String, Integer> indegree = new HashMap<>();

        for (String node : graph.keySet()) {
            indegree.put(node, 0);
        }

        for (String node : graph.keySet()) {
            for (String neighbor : graph.get(node)) {
                indegree.put(neighbor, indegree.get(neighbor) + 1);
            }
        }

        Queue<String> queue = new LinkedList<>();

        for (String node : indegree.keySet()) {
            if (indegree.get(node) == 0)
                queue.add(node);
        }

        List<String> order = new ArrayList<>();

        while (!queue.isEmpty()) {
            String curr = queue.poll();
            order.add(curr);

            for (String neighbor : graph.get(curr)) {
                indegree.put(neighbor, indegree.get(neighbor) - 1);
                if (indegree.get(neighbor) == 0)
                    queue.add(neighbor);
            }
        }

        System.out.println("Topological Order: " + order);
    }

    public static void main(String[] args) {

        CourseGraph cg = new CourseGraph();

        cg.addEdge("CS101", "CS102");
        cg.addEdge("CS101", "CS201");
        cg.addEdge("CS102", "CS202");
        cg.addEdge("MATH101", "CS201");

        System.out.println("Cycle present? " + cg.hasCycle());

        cg.findPrerequisites("CS202");

        cg.topologicalSort();
    }
}