
class Solution4 {
    
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
 
    public static int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(maxDepth(root.left),maxDepth(root.right));
    }


    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null || q == null) return p == q;
        if (p.val != q.val) return false;

        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

    public TreeNode invertTree(TreeNode root) {

        if (root == null) {
            return root;
        }

        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp; 

        invertTree(root.left);
        invertTree(root.right);
        return root;
    }

    // public boolean isSymmetric(TreeNode root) {
        
    // }
    


    public static void main(String[] args) {
        TreeNode root = new TreeNode(3, 
        new TreeNode(9, new TreeNode(), new TreeNode()), 
        new TreeNode(20, new TreeNode(15), new TreeNode(7)));

        int result = maxDepth(root);
        System.out.println(result);
    }
    // [3,9,20,null,null,15,7]


}