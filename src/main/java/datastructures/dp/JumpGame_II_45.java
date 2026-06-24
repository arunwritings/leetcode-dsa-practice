package datastructures.dp;

public class JumpGame_II_45 {

    public int jump(int[] nums) {
        int result = 0, left=0, right=0;
        while (right<nums.length-1) {
            int farthest = 0;
            for (int i=left;i<=right;i++) {
                farthest = Math.max(farthest, i+nums[i]);
            }
            left = right+1;
            right=farthest;
            result++;
        }
        return result;
    }

    public static void main(String[] args) {
        JumpGame_II_45 j = new JumpGame_II_45();
        System.out.println(j.jump(new int[]{2,3,1,1,4}));
    }
}
