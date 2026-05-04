package algorithms.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BucketSort {

    public void bucketSort(int[] nums, int bucketCount) {
        int n= nums.length;
        if (n==0) return;
        int maxValue = Arrays.stream(nums).max().getAsInt();
        int minValue = Arrays.stream(nums).min().getAsInt();
        //// Calculate range of each bucket
        int range = (maxValue-minValue)/bucketCount+1;

        List<List<Integer>> buckets = new ArrayList<>();
        for (int i=0;i<range;i++) {
            buckets.add(new ArrayList<>());
        }
        //// Scatter: Place elements into respective buckets
        for (int num : nums) {
            int bucketIndex = (num-minValue)/range;
            buckets.get(bucketIndex).add(num);
        }
        //// Sort each bucket and gather elements back into the array
        int index = 0;
        for (List<Integer> bucket : buckets) {
            Collections.sort(bucket);
            for (int num : bucket) {
                nums[index++] = num;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,23,4,56,7,9,21,10};
        BucketSort bucketSort = new BucketSort();
        bucketSort.bucketSort(nums, 4);
        for (int num : nums) {
            System.out.print(num +" ");
        }
    }
}
