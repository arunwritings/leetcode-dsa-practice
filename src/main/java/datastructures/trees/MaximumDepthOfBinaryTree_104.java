package datastructures.trees;

public class MaximumDepthOfBinaryTree_104 {

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

    public int maxDepth(TreeNode root) {
        return height(root);
    }

    private int height(TreeNode root) {
        if (root==null) return 0;
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        return 1+Math.max(leftHeight, rightHeight);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        MaximumDepthOfBinaryTree_104 maximumDepthOfBinaryTree104 = new MaximumDepthOfBinaryTree_104();
        System.out.println(maximumDepthOfBinaryTree104.maxDepth(root));
    }
}
