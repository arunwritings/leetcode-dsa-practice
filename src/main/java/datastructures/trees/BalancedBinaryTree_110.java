package datastructures.trees;

public class BalancedBinaryTree_110 {

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

    public boolean isBalanced(TreeNode root) {
        return height(root) != -1;
    }

    private int height(TreeNode root) {
          if (root==null) return 0;

          int left = height(root.left);
          if (left==-1) return -1;

          int right = height(root.right);
          if (right==-1) return -1;

          if (Math.abs(left-right)>1) return -1;
          else return Math.max(left, right) +1;
    }

    public static void main(String[] args) {
        TreeNode node = new TreeNode(3);
        node.left = new TreeNode(9);
        node.right= new TreeNode(20);
        node.right.left = new TreeNode(15);
        node.right.right = new TreeNode(7);

        BalancedBinaryTree_110 balancedBinaryTree110 = new BalancedBinaryTree_110();
        System.out.println(balancedBinaryTree110.isBalanced(node));
    }
}
