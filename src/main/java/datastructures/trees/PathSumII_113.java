package datastructures.trees;

import java.util.ArrayList;
import java.util.List;

public class PathSumII_113 {

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

    private final List<List<Integer>> result = new ArrayList<>();
    private final List<Integer> currentPath = new ArrayList<>();

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        dfs(root, targetSum);
        return result;
    }

    private void dfs(TreeNode root, int targetSum) {
        if (root==null) return;

        targetSum -= root.val;
        currentPath.add(root.val);
        if (root.left==null && root.right==null && targetSum ==0) {
            result.add(new ArrayList<>(currentPath));
        }
        dfs(root.left, targetSum);
        dfs(root.right, targetSum);
        currentPath.remove(currentPath.size()-1);
    }
}
