package datastructures.graphs;

import java.util.Arrays;

public class RedundantConnection_684 {

    private int[] parent;
    private int[] rank;

    public int[] findRedundantConnection(int[][] edges) {
        int n = edges.length;
        parent = new int[n + 1];
        rank = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            parent[i] = i;
        }

        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            if (find(u)==find(v)){
                return edge;
            }
            union(u,v);
        }
        return new int[]{-1,-1};
    }

    public int find(int p) {
        if (parent[p]!=p) {
            parent[p] = find(parent[p]);
        }
        return parent[p];
    }

    public void union(int u, int v) {
        int rootU = find(u);
        int rootV = find(v);

        if (rootU==rootV) return;
        if (rank[rootU]<rank[rootV]) {
            parent[rootU] = rootV;
        } else if (rank[rootU]>rank[rootV]) {
            parent[rootV] = rootU;
        } else {
            parent[rootV] = rootU;
            rank[rootU]++;
        }
    }

    public static void main(String[] args) {
        int[][] edges = {{1,2},{1,3},{2,3}};
        RedundantConnection_684 r = new RedundantConnection_684();
        System.out.println(Arrays.toString(r.findRedundantConnection(edges)));
    }
}
