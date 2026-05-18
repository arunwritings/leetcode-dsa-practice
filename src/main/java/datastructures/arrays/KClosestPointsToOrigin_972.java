package datastructures.arrays;

import java.util.Arrays;
import java.util.PriorityQueue;

public class KClosestPointsToOrigin_972 {

    public int[][] kClosest(int[][] points, int k) {
        /*Arrays.sort(points, (point1, point2) -> {
            double distance1 = Math.hypot(point1[0], point1[1]);
            double distance2 = Math.hypot(point2[0], point2[1]);

            if (distance1-distance2 > 0) return 1;
            else return -1;
        });
        return Arrays.copyOfRange(points, 0, k);*/

        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a,b) -> b[0]-a[0]);
        for (int[] point : points) {
            int x = point[0];
            int y = point[1];
            int dist = x*x + y*y;
            maxHeap.offer(new int[]{dist,x,y});
            if (maxHeap.size() > k) maxHeap.poll();
        }
        int[][] result = new int[k][2];
        int i=0;
        while (!maxHeap.isEmpty()) {
            int[] point = maxHeap.poll();
            result[i][0] = point[1];
            result[i][1] = point[2];
            i++;
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] points = {{1,3},{-2,2}};
        KClosestPointsToOrigin_972 k = new KClosestPointsToOrigin_972();
        System.out.println(Arrays.deepToString(k.kClosest(points, 1)));
    }
}
