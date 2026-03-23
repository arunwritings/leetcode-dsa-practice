package datastructures;

public class MoveZeroes_283 {

    public void moveZeroes(int[] nums) {
        int start=0;
        for (int i=0;i< nums.length;i++) {
            if (nums[i]!=0){
                int temp = nums[i];
                nums[i] = nums[start];
                nums[start] = temp;
                start++;
            }
        }
        //Below solution is a bit faster
        int left=0;
        for (int i=0;i< nums.length;i++) {
            if (nums[i]!=0) {
                nums[left++] = nums[i];
            }
        }
        for (int i=left;i< nums.length;i++) {
            nums[i]=0;
        }
    }

    public static void main(String[] args) {
        MoveZeroes_283 moveZeroes283 = new MoveZeroes_283();
        moveZeroes283.moveZeroes(new int[]{0,1,0,3,12});
    }
}
