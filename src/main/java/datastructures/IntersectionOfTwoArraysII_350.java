package datastructures;

import java.util.*;

public class IntersectionOfTwoArraysII_350 {

    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (int num : nums2) {
            if (map.containsKey(num) && map.get(num)>0) {
                list.add(num);
                map.put(num, map.get(num) - 1);
            }
        }
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }

    public static void main(String[] args) {
        IntersectionOfTwoArraysII_350 intersectionOfTwoArraysII350 = new IntersectionOfTwoArraysII_350();
        System.out.println(Arrays.toString(intersectionOfTwoArraysII350.intersect(new int[]{1,2,2,1}, new int[]{2,2})));
    }
}
