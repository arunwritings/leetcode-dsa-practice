package datastructures.trees;

import java.util.Stack;

public class ConstructBinarySearchTreeFromPreorderTraversal_1008 {

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

    public TreeNode bstFromPreorder(int[] preorder) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode root = new TreeNode(preorder[0]);
        stack.push(root);
        for (int i=1;i<preorder.length;i++) {
            TreeNode current = null;
            while (!stack.isEmpty() && stack.peek().val < preorder[i]) {
                current = stack.pop();
            }
            if (current!=null) {
                current.right = new TreeNode(preorder[i]);
                stack.push(current.right);
            } else {
                current = stack.peek();
                current.left = new TreeNode(preorder[i]);
                stack.push(current.left);
            }
        }
        return root;
    }

    public TreeNode bstFromPreorder1(int[] preorder) {
          return bst(preorder, Integer.MAX_VALUE);
    }

    int index =0;

    private TreeNode bst(int[] preorder, int maxValue) {
          if (index ==preorder.length || preorder[index]>maxValue) return null;
          TreeNode root = new TreeNode(preorder[index++]);
          root.left = bst(preorder, root.val);
          root.right = bst(preorder, maxValue);
          return root;
    }

    public static void main(String[] args) {
        int[] preorder = {8,5,1,7,10,12};
        ConstructBinarySearchTreeFromPreorderTraversal_1008 c = new ConstructBinarySearchTreeFromPreorderTraversal_1008();
        System.out.println(c.bstFromPreorder(preorder));
    }
}
