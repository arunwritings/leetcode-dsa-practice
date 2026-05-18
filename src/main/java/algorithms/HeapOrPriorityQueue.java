package algorithms;

import java.util.PriorityQueue;

public class HeapOrPriorityQueue {

    /*Algorithm used to find the kth Largest Element*/
    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int num : nums) {
            minHeap.offer(num);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }
        return minHeap.peek();
    }

    public static void main(String[] args) {
        int[] nums = {3,2,1,5,6,4};
        System.out.println(HeapOrPriorityQueue.findKthLargest(nums,2));
    }
}
