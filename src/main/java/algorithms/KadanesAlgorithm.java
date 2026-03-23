package algorithms;

public class KadanesAlgorithm {

/*This algo is used to find Maximum Sub-array of an array*/

    public static int maxSubArray(int[] arr) {
        int currMAx = arr[0], maxSum = arr[0];
        for (int i=1;i<arr.length;i++) {
            currMAx = Math.max(arr[i], currMAx+arr[i]);
            maxSum = Math.max(maxSum, currMAx);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }
}
