class Solution8 {
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

    public static int countNodes(TreeNode root) {
        if(root == null) return 0;
        int deep = countComplDeep(root);
        if (deep == 1) return 1;

        int nodes = (int)Math.pow(2,deep-1) - 1;

        int leaves = check(root, deep);
        return nodes + leaves;
    }
    
    public static int check(TreeNode node, int deep){
        if (deep == 1) return 1;

        if (deep == 2) {
            if (node.left == null) return 0;
            if (node.right == null) return 1;
            return 2;
        }
        
        return check(node.left, deep - 1) + check(node.right, deep - 1);
    }
    public static int countComplDeep(TreeNode root){
        int depth = 0;
        while (root != null) {
            depth += 1;
            root = root.left;
        }
        return depth;
    }

    public static int countLevels(TreeNode root){
        if (root == null) return 0;
        return Math.max(1 + countLevels(root.left), 1 + countLevels(root.right));
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3, 
        new TreeNode(9, new TreeNode(7), new TreeNode(8)), 
        new TreeNode(20, new TreeNode(15),null));

        int result = countNodes(root);
        // int levels = countLevels(root);
        // int deep = countComplDeep(root);
        System.out.println(result);
        // System.out.println(levels);
        // System.out.println(deep);
    }
}