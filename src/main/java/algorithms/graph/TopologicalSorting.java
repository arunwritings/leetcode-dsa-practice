package algorithms.graph;

import java.util.LinkedList;
import java.util.Stack;

public class TopologicalSorting {

    private final int vertices;
    private final LinkedList<Integer>[] adj;

    public TopologicalSorting(int v) {
        this.vertices = v;
        adj = new LinkedList[v];
        for (int i=0;i<v;i++) {
            adj[i] = new LinkedList<>();
        }
    }

    void dfs(int v, boolean[] visited, Stack<Integer> stack) {
        visited[v] = true;
        for (int neighbour : adj[v]) {
            if (!visited[neighbour]) {
                dfs(neighbour, visited, stack);
            }
        }
        stack.push(v);
    }

    void addEdge(int u, int v) {
        adj[u].add(v);
    }

    void topologicalSort() {
        Stack<Integer> stack = new Stack<>();
        boolean[] visited = new boolean[vertices];
        for (int i=0;i<vertices;i++) {
            if (!visited[i]) {
                dfs(i, visited, stack);
            }
        }
        while (!stack.empty()) {
            System.out.print(stack.pop()+" ");
        }
    }

    public static void main(String[] args) {
        TopologicalSorting graph = new TopologicalSorting(6);
        graph.addEdge(5, 2);
        graph.addEdge(5, 0);
        graph.addEdge(4, 0);
        graph.addEdge(4, 1);
        graph.addEdge(2, 3);
        graph.addEdge(3, 1);

        System.out.print("Topological Sort: ");
        graph.topologicalSort();
    }
}
