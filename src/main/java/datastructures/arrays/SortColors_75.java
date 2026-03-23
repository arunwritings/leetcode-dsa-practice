package datastructures.arrays;

public class SortColors_75 {

    public void sortColors(int[] nums) {
        int zeros=0, ones=0, twos=0;
        for (int num : nums) {
            if (num==0) zeros++;
            else if (num==1) {
                ones++;
            } else twos++;
        }

        int index=0;
        while (zeros!=0) {
            nums[index++]=0;
            zeros--;
        }
        while (ones!=0) {
            nums[index++]=1;
            ones--;
        }
        while (twos!=0) {
            nums[index++]=2;
            twos--;
        }
    }

    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
        SortColors_75 sortColors75 = new SortColors_75();
        sortColors75.sortColors(nums);
    }

}
