package datastructures.graphs;

import java.util.Arrays;

public class CheapestFlightsWithinKStops_787 {

    private static final int INFINITY = 0x3f3f3f3f;

    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        int[] distances = new int[n];
        int[] previousDistances = new int[n];
        Arrays.fill(distances, INFINITY);
        distances[src] = 0;

        for (int i=0;i<k+1;i++) {
            System.arraycopy(distances,0,previousDistances,0,n);

            for (int[] flight : flights) {
                int from = flight[0];
                int to = flight[1];
                int cost = flight[2];

                distances[to] = Math.min(distances[to], previousDistances[from]+cost);
            }
        }
        return distances[dst]==INFINITY ? -1 : distances[dst];
    }

    public static void main(String[] args) {
        int[][] flights = {{0,1,100},{1,2,100},{2,0,100},{1,3,600},{2,3,200}};
        CheapestFlightsWithinKStops_787 c = new CheapestFlightsWithinKStops_787();
        System.out.println(c.findCheapestPrice(4, flights, 0,3,1));
    }
}
