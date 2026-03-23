package datastructures.trees;

import java.util.LinkedList;

public class FlattenBinaryTreeToLinkedList_114 {

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

      private final LinkedList<Integer> result = new LinkedList<>();

    public void flatten(TreeNode root) {
        if (root==null) return;
    }

    private void preOrder(TreeNode root) {
          if (root==null) return;

    }
}
