package datastructures.trees;

public class ConvertSortedArrayToBinarySearchTree_108 {

      public static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums==null) return null;
        return buildBST(nums, 0, nums.length-1);
    }

    private TreeNode buildBST(int[] nums, int left, int right) {
          if (left>right) return null;
          int mid = left + (right-left)/2;
          TreeNode root = new TreeNode(nums[mid]);
          root.left = buildBST(nums, left, mid-1);
          root.right = buildBST(nums, mid+1, right);
          return root;
    }

    public static void main(String[] args) {
        ConvertSortedArrayToBinarySearchTree_108 convertSortedArrayToBinarySearchTree108 = new ConvertSortedArrayToBinarySearchTree_108();
        System.out.println(convertSortedArrayToBinarySearchTree108.sortedArrayToBST(new int[]{-10,-3,0,5,9}));
    }

}
