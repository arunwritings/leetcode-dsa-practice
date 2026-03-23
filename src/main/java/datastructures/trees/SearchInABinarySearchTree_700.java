package datastructures.trees;

public class SearchInABinarySearchTree_700 {

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

    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null ||root.val==val) {
            return root;
        } else if (val< root.val)  {
            return searchBST(root.left, val);
        } else {
            return searchBST(root.right, val);
        }
    }

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(4);
        treeNode.left = new TreeNode(2);
        treeNode.right = new TreeNode(7);
        treeNode.left.left = new TreeNode(1);
        treeNode.left.right = new TreeNode(3);

        SearchInABinarySearchTree_700 s = new SearchInABinarySearchTree_700();
        System.out.println(s.searchBST(treeNode,2));
    }
}
