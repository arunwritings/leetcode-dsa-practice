package datastructures.graphs;

public class IsGraphBipartite_785 {

    private int[] colors;
    private int[][] adjList;

    public boolean isBipartite(int[][] graph) {
        int nodes = graph.length;
        colors = new int[nodes];
        adjList = graph;

        for (int node=0;node<nodes;node++) {
            if (colors[node]==0 && !dfsColoring(node, 1)) {
                return false;
            }
        }
        return true;
    }

    private boolean dfsColoring(int node, int color) {
        colors[node] = color;
        for (int neighbour : adjList[node]) {
            if (colors[neighbour]==color) return false;
            if (colors[neighbour]==0 && !dfsColoring(neighbour, -color)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] graph = {{1,2,3},{0,2},{0,1,3},{0,2}};
        IsGraphBipartite_785 isGraphBipartite785 = new IsGraphBipartite_785();
        System.out.println(isGraphBipartite785.isBipartite(graph));
    }
}
