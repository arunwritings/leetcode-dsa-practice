package datastructures.arrays;

public class MajorityElement_169 {

    public int majorityElement(int[] nums) {
        int candidate = 0;
        int count = 0;
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }
        return candidate;
    }

    public static void main(String[] args) {
        MajorityElement_169 m = new MajorityElement_169();
        System.out.println(m.majorityElement(new int[]{2,2,1,1,1,2,2}));
    }
}
