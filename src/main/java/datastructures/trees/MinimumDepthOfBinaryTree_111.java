package datastructures.trees;

public class MinimumDepthOfBinaryTree_111 {

      public static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;

      TreeNode(int val) { this.val = val; }
          TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

    public int minDepth(TreeNode root) {
        if (root==null) return 0;
        int leftHeight = minDepth(root.left);
        int rightHeight = minDepth(root.right);
        if (root.left==null) return 1+rightHeight;
        if (root.right==null) return 1+leftHeight;
        return 1+Math.min(leftHeight,rightHeight);
    }


    public static void main(String[] args) {
        TreeNode node = new TreeNode(3);
        node.left = new TreeNode(9);
        node.right = new TreeNode(20);
        node.right.left = new TreeNode(15);
        node.right.right = new TreeNode(7);
        MinimumDepthOfBinaryTree_111 m = new MinimumDepthOfBinaryTree_111();
        System.out.println(m.minDepth(node));
    }
}
