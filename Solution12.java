
public class Solution12 {
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
    public TreeNode sortedArrayToBST(int[] nums) {
        return sort(nums, 0, nums.length - 1);
    }
    public TreeNode sort(int[] nums, int left, int right){
        if (left > right) return null;

        int middle = left + (right - left)/2;
        TreeNode node = new TreeNode(nums[middle]);

        node.left = sort(nums, left, middle - 1);
        node.right = sort(nums, middle + 1, right);
        return node;
    }
}
