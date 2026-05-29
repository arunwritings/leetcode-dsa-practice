package datastructures.graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindIfPathExistsInGraph_1921 {

    private int dest;
    private boolean[] visited;
    private List<Integer>[] adj;

    public boolean validPath(int n, int[][] edges, int source, int destination) {
        this.dest = destination;
        visited = new boolean[n];
        adj = new List[n];
        Arrays.setAll(adj, index -> new ArrayList<>());
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            adj[u].add(v);
            adj[v].add(u);
        }
        return dfs(source);
    }

    private boolean dfs(int source) {
        if (source==dest) return true;
        visited[source] = true;
        for (int neighbour : adj[source]) {
            if (!visited[neighbour] && dfs(neighbour)) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] graph = {{0,1},{1,2},{0,2}};
        FindIfPathExistsInGraph_1921 f = new FindIfPathExistsInGraph_1921();
        System.out.println(f.validPath(3,graph,0,2));
    }
}
