package algorithms.graph;

import java.util.Arrays;

public class Dijkstra {

    public static void dijkstra(int[][] graph, int source) {
        int n = graph.length;
        boolean[] visited = new boolean[n];
        int[] distance = new int[n];
        Arrays.fill(distance, Integer.MAX_VALUE);
        distance[source] = 0;
        for (int i=0;i<n;i++) {
            int u = minDistance(distance, visited);
            visited[u] = true;
            for (int v=0;v<n;v++) {
                if (!visited[v] && graph[u][v]!=0 && (distance[u]+graph[u][v]<distance[v])) {
                    distance[v] = distance[u]+graph[u][v];
                }
            }
        }
        for (int i=0;i<distance.length;i++) {
            System.out.printf("Distance from %s to %s is %s %n", source, i, distance[i]);
        }
    }

    private static int minDistance(int[] distance, boolean[] visited) {
        int minDistance = Integer.MAX_VALUE;
        int minVertex = -1;
        for (int i=0;i<distance.length;i++) {
            if (!visited[i] && distance[i]<minDistance) {
                minDistance = distance[i];
                minVertex = i;
            }
        }
        return minVertex;
    }

    public static void main(String[] args) {
        int[][] graph = {
                {0, 4, 0, 0, 0, 0, 0, 8, 0},
                {4, 0, 8, 0, 0, 0, 0, 11, 0},
                {0, 8, 0, 7, 0, 4, 0, 0, 2},
                {0, 0, 7, 0, 9, 14, 0, 0, 0},
                {0, 0, 0, 9, 0, 10, 0, 0, 0},
                {0, 0, 4, 14, 10, 0, 2, 0, 0},
                {0, 0, 0, 0, 0, 2, 0, 1, 6},
                {8, 11, 0, 0, 0, 0, 1, 0, 7},
                {0, 0, 2, 0, 0, 0, 6, 7, 0}
        };
        int source = 0;
        dijkstra(graph, source);
    }
}