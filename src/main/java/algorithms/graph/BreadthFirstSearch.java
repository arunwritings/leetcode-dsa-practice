package algorithms.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BreadthFirstSearch {

    public static void bfs(int start, List<List<Integer>> graph, int vertices) {
        boolean[] visited = new boolean[vertices];
        Queue<Integer> queue = new LinkedList<>();
        visited[start] = true;
        queue.offer(start);
        while (!queue.isEmpty()) {
            int node = queue.poll();
            System.out.println(node+" ");
            for (int neighbour : graph.get(node)) {
                if (visited[neighbour]) {
                    visited[neighbour] = true;
                    queue.offer(neighbour);
                }
            }
        }
    }

    public static void main(String[] args) {
        int vertices = 5;
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < vertices; i++) {
            graph.add(new ArrayList<>());
        }
        graph.get(0).add(1);
        graph.get(0).add(2);
        graph.get(1).add(3);
        graph.get(1).add(4);
        bfs(0, graph, vertices);
    }
}
