package datastructures;

import java.util.Collections;
import java.util.PriorityQueue;

public class LastStoneWeight_1046 {

    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for (int stone : stones) {
            maxHeap.add(stone);
        }

        while (maxHeap.size()>1) {
            int largest = maxHeap.poll();
            int secondLargest = maxHeap.poll();

            if (largest!=secondLargest) {
                maxHeap.add(largest-secondLargest);
            }
        }
        return maxHeap.isEmpty() ? 0 : maxHeap.poll();
    }

    public static void main(String[] args) {
        LastStoneWeight_1046 l = new LastStoneWeight_1046();
        System.out.println(l.lastStoneWeight(new int[]{2,7,4,1,8,1}));
    }
}
