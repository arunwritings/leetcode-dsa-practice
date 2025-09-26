package datastructures;

public class CheckIfArrayIsSortedAndRotated_1752 {

    public boolean check(int[] nums) {
        int breakPoints = 0;
        int len = nums.length;
        for (int i=0;i<len;i++) {
            if (nums[i]>nums[(i+1)%len]) {
                breakPoints++;
            }
        }
        return breakPoints<=1;
    }

    public static void main(String[] args) {
        CheckIfArrayIsSortedAndRotated_1752 checkIfArrayIsSortedAndRotated1752 = new CheckIfArrayIsSortedAndRotated_1752();
        boolean result = checkIfArrayIsSortedAndRotated1752.check(new int[]{3,4,5,1,2});
        System.out.println(result);
    }
}
