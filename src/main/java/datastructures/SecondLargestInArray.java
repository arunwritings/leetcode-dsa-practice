package datastructures;

public class SecondLargestInArray {

    public int secondLargestElement(int[] nums) {
        int largest = -1;
        int secondLargest = -1;
        for (int num : nums) {
            if (num>secondLargest && num<largest) {
                secondLargest = num;
            } else if (num>largest) {
                secondLargest = largest;
                largest = num;
            }
        }
        return secondLargest;
    }

    public static void main(String[] args) {
        SecondLargestInArray secondLargestInArray = new SecondLargestInArray();
        int result = secondLargestInArray.secondLargestElement(new int[]{7, 7, 2, 2, 10, 10, 10});
        System.out.println(result);
    }
}
