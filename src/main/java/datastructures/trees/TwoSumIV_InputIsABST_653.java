package datastructures.trees;

import java.util.HashSet;
import java.util.Set;

public class TwoSumIV_InputIsABST_653 {

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

      private final Set<Integer> differences = new HashSet<>();

      private int sum;

    public boolean findTarget(TreeNode root, int k) {
        this.sum=k;
        return dfs(root);
    }

    private boolean dfs(TreeNode root) {
        if (root==null) return false;

        if (differences.contains(sum-root.val)) return true;
        differences.add(root.val);
        return dfs(root.left) || dfs(root.right);
    }

    public static void main(String[] args) {
        TwoSumIV_InputIsABST_653 twoSumIVInputIsABST653 = new TwoSumIV_InputIsABST_653();
        TreeNode treeNode = new TreeNode(5);
        treeNode.left = new TreeNode(3);
        treeNode.right = new TreeNode(6);
        treeNode.left.left = new TreeNode(2);
        treeNode.left.right = new TreeNode(4);
        treeNode.right.right = new TreeNode(7);
        System.out.println(twoSumIVInputIsABST653.findTarget(treeNode, 9));
    }
    
}
