package datastructures.trees;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversal_94 {

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

    List<Integer> result = new ArrayList<>();

    public List<Integer> inorderTraversal(TreeNode root) {
        if (root==null) return result;
        dfs(root, result);
        return result;
    }

    private void dfs(TreeNode root, List<Integer> result) {
        if (root==null) return;
        dfs(root.left, result);
        result.add(root.val);
        dfs(root.right, result);
    }


    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1);
        treeNode.left = new TreeNode(2);
        treeNode.right = new TreeNode(3);
        BinaryTreeInorderTraversal_94 binaryTreeInorderTraversal94 = new BinaryTreeInorderTraversal_94();
        List<Integer> result = binaryTreeInorderTraversal94.inorderTraversal(treeNode);
        System.out.println(result);
    }
}
