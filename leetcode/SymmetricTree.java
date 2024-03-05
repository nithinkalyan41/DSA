class Solution {
    public boolean isSymmetric(TreeNode root) {
        return root==null || symmetricHelper(root.left,root.right);
    }
    private static boolean symmetricHelper(TreeNode left, TreeNode right){
        if(left==null || right==null){
            return left==right;
        }
        if(left.val!=right.val){
            return false;
        }
        return symmetricHelper(left.left, right.right) && symmetricHelper(left.right,right.left);
    }
}
