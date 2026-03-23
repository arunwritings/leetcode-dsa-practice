package algorithms.graph;

import java.util.*;

public class DepthFirstSearch {

    private final Map<Integer, List<Integer>> graph = new HashMap<>();
    private final Set<Integer> visited = new HashSet<>();

    public void addEdge(int u, int v) {
        graph.computeIfAbsent(u, k -> new ArrayList<>()).add(v);
    }

    public void dfs(int node) {
        if (visited.contains(node)) return;

        visited.add(node);
        System.out.println(node);
        for (int neighbour : graph.getOrDefault(node, new ArrayList<>())) {
            dfs(neighbour);
        }
    }

    public static void main(String[] args) {
        DepthFirstSearch d = new DepthFirstSearch();
        d.addEdge(1,2);
        d.addEdge(1,3);
        d.addEdge(2,4);
        d.addEdge(3,4);

        d.dfs(1);
    }
}
