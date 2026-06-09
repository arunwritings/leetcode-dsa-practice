package algorithms.graph;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MinimumSpanningTree {

    static class Edge {
        int u, v, cost;

        Edge(int u, int v, int cost) {
            this.u = u;
            this.v = v;
            this.cost = cost;
        }
    }

    static class DSU {

        private final int[] parent;
        private final int[] rank;

        public DSU(int size) {
            parent = new int[size];
            rank = new int[size];
            for (int i=0;i<size;i++) {
                parent[i] = i;
            }
        }

        public int find(int p){
            if (parent[p]!=p) {
                parent[p] = find(parent[p]);
            }
            return parent[p];
        }

        public boolean union(int p, int q) {
            int rootP = find(p);
            int rootQ = find(q);
            if (rootP==rootQ) return false;
            if (rank[rootP]<rank[rootQ]) {
                parent[rootP] = rootQ;
            } else if (rank[rootP]>rank[rootQ]) {
                parent[rootQ] = rootP;
            } else {
                parent[rootQ] = rootP;
                rank[rootP]++;
            }
            return true;
        }
    }

    public int kruskalsMST(int[][] edges) {
        int n = edges.length;
        List<Edge> edgeList = new ArrayList<>();
        for (int i=0;i<n;i++) {
            for (int j=i+1;j<n;j++) {
                int cost = Math.abs(edges[i][0] - edges[j][0]) + Math.abs(edges[i][1] - edges[j][1]);
                edgeList.add(new Edge(i,j,cost));
            }
        }
        edgeList.sort(Comparator.comparingInt(a -> a.cost));
        DSU dsu = new DSU(n);
        int mstCost = 0;
        int edgesUsed = 0;
        for (Edge edge : edgeList) {
            if (dsu.union(edge.u, edge.v)) {
                mstCost += edge.cost;
                edgesUsed++;

                if (edgesUsed == n-1) break;
            }
        }
        return mstCost;
    }

    public static void main(String[] args) {
        int[][] points = {{0,0},{2,2},{3,10},{5,2},{7,0}};
        MinimumSpanningTree minimumSpanningTree = new MinimumSpanningTree();
        System.out.println(minimumSpanningTree.kruskalsMST(points));
    }
}
