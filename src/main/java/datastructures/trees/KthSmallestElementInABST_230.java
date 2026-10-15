package datastructures.trees;

public class KthSmallestElementInABST_230 {

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

    private int count=0;
    private int answer=-1;

    public int kthSmallest(TreeNode root, int k) {
        inorder(root,k);
        return answer;
    }

    private void inorder(TreeNode root, int k) {
        if (root == null || count >= k) {
            return;
        }
        inorder(root.left, k);
        if (count >= k) {
            return;
        }
        count++;
        if (count==k) {
            answer = root.val;
            return;
        }
        inorder(root.right,k);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.left.right = new TreeNode(2);
        root.right = new TreeNode(4);
        KthSmallestElementInABST_230 k = new KthSmallestElementInABST_230();
        System.out.println(k.kthSmallest(root,2));
    }
}
