package datastructures.graphs;

public class NumberOfProvinces_547 {

    private boolean[] visited;
    private int n;
    private int[][] isConnected;

    public int findCircleNum(int[][] isConnected) {
        this.isConnected = isConnected;
        n = isConnected.length;
        visited = new boolean[n];
        int provinces = 0;
        for (int city=0;city<n;city++) {
            if (!visited[city]) {
                dfs(city);
                provinces++;
            }
        }
        return provinces;
    }

    private void dfs(int city) {
        visited[city] = true;
        for (int neighbour=0;neighbour<n;neighbour++) {
            if (isConnected[city][neighbour]==1 && !visited[neighbour]) {
                dfs(neighbour);
            }
        }
    }

    public static void main(String[] args) {
        int[][] isConnected = {{1,1,0}, {1,1,0},{0,0,1}};
        NumberOfProvinces_547 n = new NumberOfProvinces_547();
        System.out.println(n.findCircleNum(isConnected));
    }
}
