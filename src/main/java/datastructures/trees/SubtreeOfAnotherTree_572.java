package datastructures.trees;

public class SubtreeOfAnotherTree_572 {

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

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (root==null) return false;
        if (isSameTree(root, subRoot)) return true;
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
     }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p==null && q==null) return true;
        if (p==null || q==null) return false;
        return (p.val==q.val) && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(4);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(2);

        TreeNode subtree = new TreeNode(4);
        subtree.left  = new TreeNode(1);
        subtree.right = new TreeNode(2);

        SubtreeOfAnotherTree_572 subtreeOfAnotherTree572 = new SubtreeOfAnotherTree_572();
        System.out.println(subtreeOfAnotherTree572.isSubtree(root, subtree));
    }
}
