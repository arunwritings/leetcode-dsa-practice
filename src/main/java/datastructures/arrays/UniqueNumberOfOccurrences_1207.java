package datastructures.arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueNumberOfOccurrences_1207 {

    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int j : arr) {
            freqMap.put(j, freqMap.getOrDefault(j, 0) + 1);
        }
        Set<Integer> uniqueNums = new HashSet<>();
        for (Integer num : freqMap.values()) {
            if (uniqueNums.contains(num)) return false;
            else uniqueNums.add(num);
        }
        return true;
    }

    public static void main(String[] args) {
        UniqueNumberOfOccurrences_1207 u = new UniqueNumberOfOccurrences_1207();
        System.out.println(u.uniqueOccurrences(new int[]{1,2,2,3,3,3}));
    }
}
