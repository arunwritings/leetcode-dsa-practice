package datastructures.arrays;

import java.util.HashMap;
import java.util.Map;

public class FruitIntoBaskets_904 {

    public int totalFruit(int[] fruits) {
        int left=0, maxLength=0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int right=0;right<fruits.length;right++) {
            map.put(fruits[right], map.getOrDefault(fruits[right],0)+1);
            while (map.size()>2) {
                map.put(fruits[left], map.get(fruits[left])-1);
                if (map.get(fruits[left])==0) {
                    map.remove(fruits[left]);
                }
                left++;
            }
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        int[] fruits = {0,1,2,2};
        FruitIntoBaskets_904 f = new FruitIntoBaskets_904();
        System.out.println(f.totalFruit(fruits));
    }
}
