package datastructures.trees;

import java.util.*;

public class BinaryTreeRightSideView_199 {

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

    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root==null) return result;
        Deque<TreeNode> deque = new ArrayDeque<>();
        deque.offer(root);
        while (!deque.isEmpty()) {
            result.add(deque.peekFirst().val);
            int queueSize = deque.size();
            for (int i=0;i<queueSize;i++) {
                TreeNode current = deque.poll();
                if (current.right!=null) {
                    deque.offer(current.right);
                }
                if (current.left!=null) {
                    deque.offer(current.left);
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.left.left = new TreeNode(5);
        BinaryTreeRightSideView_199 b = new BinaryTreeRightSideView_199();
        System.out.println(b.rightSideView(root));
    }
}
