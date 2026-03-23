package algorithms;

public class UnionFind {

        private final int[] parent;
        private final int[] rank;

        public UnionFind(int size) {
            parent = new int[size];
            rank = new int[size];

            for (int i=0;i<size;i++) {
                parent[i] = i;
                rank[i] = 0;
            }
        }

        public int find(int p){
            if (parent[p]!=p) {
                parent[p] = find(parent[p]);
            }
            return parent[p];
        }

        public void union(int p, int q) {
            int rootP = find(p);
            int rootQ = find(q);

            if (rootP == rootQ) return;
            if (rank[rootP]<rank[rootQ]) {
                parent[rootP] = rootQ;
            } else if (rank[rootP]>rank[rootQ]) {
                parent[rootQ] = rootP;
            } else {
                parent[rootQ] = rootP;
                rank[rootP]++;
            }
        }

        public boolean isConnected(int p, int q) {
            return find(p) == find(q);
        }

    public static void main(String[] args) {
        UnionFind unionFind = new UnionFind(5);
        unionFind.union(0,1);
        unionFind.union(1,2);
        unionFind.union(3,4);

        System.out.println("Are 0 and 2 connected "+ unionFind.isConnected(0,2));
        System.out.println("Are 1 and 4 connected "+ unionFind.isConnected(1,4));
    }
}
