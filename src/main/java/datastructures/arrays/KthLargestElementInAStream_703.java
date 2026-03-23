package datastructures.arrays;

import java.util.PriorityQueue;

public class KthLargestElementInAStream_703 {

    private final PriorityQueue<Integer> minHeap;
    private final int k;

    public KthLargestElementInAStream_703(int k, int[] nums) {
        this.k=k;
        minHeap = new PriorityQueue<>();

        for (int num : nums) {
            add(num);
        }
    }

    public int add(int val) {
        minHeap.offer(val);
        if (minHeap.size() > k) {
            minHeap.poll();
        }
        return minHeap.peek();
    }

    public static void main(String[] args) {
        int[] nums = {4, 5, 8, 2};
        KthLargestElementInAStream_703 kthLargest = new KthLargestElementInAStream_703(3, nums);
        System.out.println(kthLargest.add(3));
        System.out.println(kthLargest.add(5));
        System.out.println(kthLargest.add(10));
        System.out.println(kthLargest.add(9));
        System.out.println(kthLargest.add(4));
    }
}
