package datastructures.trees;

public class PathSum_112 {

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

    public boolean hasPathSum(TreeNode root, int targetSum) {
        return dfs(root, targetSum);
    }

    private boolean dfs(TreeNode root, int targetSum) {
          if (root==null) return false;

          targetSum -= root.val; //we subtract the value down the path, eventually reaching leaf node with remaining sum 0
          if (root.left==null && root.right==null && targetSum==0) return true;
          return dfs(root.left,targetSum) || dfs(root.right, targetSum);
    }


}
