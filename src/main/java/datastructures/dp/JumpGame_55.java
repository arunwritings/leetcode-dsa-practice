package datastructures.dp;

public class JumpGame_55 {

    public boolean canJump(int[] nums) {
        int n = nums.length;
        int target = n-1;
        for (int i=n-2;i>=0;i--) {
            if (i+nums[i]>=target) {
                target = i;
            }
        }
        return target==0;
    }

    public static void main(String[] args) {
        JumpGame_55 j = new JumpGame_55();
        System.out.println(j.canJump(new int[]{2,3,1,1,4}));
    }
}
