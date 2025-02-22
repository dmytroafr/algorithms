
public class Solution25 {
    public boolean isValidBST(Solution12.TreeNode root) {
        return isValidUtil(root, Integer.MIN_VALUE, Integer.MAX_VALUE);

    }
    public boolean isValidUtil(Solution12.TreeNode node, int min, int max){
        if(node == null) return true;
        if (node.val < min || node.val > max){
            return false;
        }
        return isValidUtil(node.left, min, node.val) && isValidUtil(node.right, node.val, max);    
    }
}
