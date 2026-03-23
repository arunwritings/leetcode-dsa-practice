package datastructures.trees;

public class ValidateBinarySearchTree_98 {

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
    private TreeNode previousNode;

    public boolean isValidBST(TreeNode root) {
        return inOrderTraversal(root);
    }

    private boolean inOrderTraversal(TreeNode root) {
        if (root==null) return true;
        if (!inOrderTraversal(root.left)) return false;
        if (previousNode!=null && previousNode.val> root.val) {
            return false;
        }
        previousNode = root;
        return inOrderTraversal(root.right);
    }

    public static void main(String[] args) {
        ValidateBinarySearchTree_98 validateBinarySearchTree98 = new ValidateBinarySearchTree_98();
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);
        System.out.println(validateBinarySearchTree98.isValidBST(root));
    }

}
