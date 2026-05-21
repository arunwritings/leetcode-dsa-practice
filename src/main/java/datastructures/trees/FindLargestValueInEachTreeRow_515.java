package datastructures.trees;

import java.util.*;

public class FindLargestValueInEachTreeRow_515 {

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

    public List<Integer> largestValues(TreeNode root) {
          List<Integer> result = new ArrayList<>();
          if (root==null) return result;
          Queue<TreeNode> queue = new LinkedList<>();
          queue.offer(root);
          while (!queue.isEmpty()) {
              int size = queue.size();
             int largest = Integer.MIN_VALUE;
              for (int i=0;i<size;i++) {
                  TreeNode node = queue.poll();
                  largest = Math.max(largest, node.val);
                  if (node.left!=null) queue.offer(node.left);
                  if (node.right!=null) queue.offer(node.right);
              }
              result.add(largest);
          }
          return result;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        FindLargestValueInEachTreeRow_515 f = new FindLargestValueInEachTreeRow_515();
        System.out.println(f.largestValues(root));
    }
}
