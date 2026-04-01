package datastructures.arrays;

public class ContainerWithMostWater_11 {

    public int maxArea(int[] height) {
        int left=0, right=height.length-1;
        int currentMax;
        int totalMaxArea = 0;
        while (left<=right) {
            currentMax = Math.min(height[left], height[right]) * (right-left);
            totalMaxArea = Math.max(totalMaxArea, currentMax);
            if (height[left]<height[right]) left++;
            else right--;
        }
        return totalMaxArea;
    }

    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        ContainerWithMostWater_11 c = new ContainerWithMostWater_11();
        System.out.println(c.maxArea(height));
    }
}
