
class Solution {
 // Definition for a binary tree node.
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
    public static boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) return false;

        if (root.left==null && root.right==null){
            return targetSum == root.val;
        }
        int res = targetSum - root.val;

        return hasPathSum(root.left, res) || hasPathSum(root.right, res);
    }

}