class Solution100 {
    public class TreeNode {
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
    private int min = Integer.MAX_VALUE;
    private Integer prev = null;

    public int getMinimumDifference(TreeNode root) {
        check(root);
        return min;
    }
    private void check(TreeNode node){
        if (node == null) return;
        check(node.left);

        if (prev != null){
            min = Math.min(min, Math.abs(node.val - prev));
        }

        prev = node.val;
        check(node.right);
    }

}