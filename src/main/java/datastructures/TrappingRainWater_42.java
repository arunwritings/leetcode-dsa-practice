package datastructures;

public class TrappingRainWater_42 {
    //Approach 1: Dynamic Programming
    public int trap(int[] height) {
        int n = height.length;
        int[] leftMax = new int[n];
        int[] rightMax = new int[n];

        leftMax[0] = height[0];
        rightMax[n-1] = height[n-1];

        for (int i=1;i<n;i++) {
            leftMax[i] = Math.max(leftMax[i-1], height[i]);
            rightMax[n-i-1] = Math.max(rightMax[n-i], height[n-i-1]);
        }

        int totalWaterTrapped = 0;
        for (int i=0;i<n;i++) {
            totalWaterTrapped += Math.min(leftMax[i], rightMax[i])-height[i];
        }
        return totalWaterTrapped;
    }

    //Approach 2: Two Pointers
    public int trapWater(int[] height){
        int left=0, right= height.length-1;
        int leftMax = height[left];
        int rightMax = height[right];

        int totalWaterTrapped=0;
        while (left < right) {
            if (leftMax<rightMax) {
                left++;
                leftMax = Math.max(leftMax, height[left]);
                totalWaterTrapped += leftMax - height[left];
            } else {
                right--;
                rightMax = Math.max(rightMax, height[right]);
                totalWaterTrapped += rightMax - height[right];
            }
        }
        return totalWaterTrapped;
    }

    public static void main(String[] args) {
        TrappingRainWater_42 trappingRainWater42 = new TrappingRainWater_42();
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        //System.out.println(trappingRainWater42.trap(height));
        System.out.println(trappingRainWater42.trapWater(height));
    }
}
