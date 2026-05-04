package datastructures.arrays;

import java.util.*;

public class TopKFrequentElements_347 {

    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0)+1);
        }
        List<Integer>[] buckets = new List[nums.length + 1];
        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new ArrayList<>();
        }
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            int num = entry.getKey();
            int freq = entry.getValue();
            buckets[freq].add(num);
        }
        int[] result = new int[k];
        int index=0;
        for (int i = buckets.length - 1; i >= 0; i--) {
            for (int num : buckets[i]) {
                result[index++] = num;
                k--;
                if (k == 0) return result;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};
        TopKFrequentElements_347 t = new TopKFrequentElements_347();
        System.out.println(Arrays.toString(t.topKFrequent(nums, 2)));
    }
}
