package problems;

class PathSum {
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
    public boolean hasPathSum(TreeNode root, int targetSum) {

        return this.helper(root, targetSum);
    }
    public boolean helper(TreeNode root, int targetSum) {

        if(root!=null ){

            if(root.left==null && root.right==null)
            {
                if(targetSum==0){
                    return true;
                }
                else{
                    return false;
                }
            }

            targetSum = targetSum - root.val;
            boolean leftResult;
            leftResult = helper(root.left, targetSum);
            boolean rightResult;

            rightResult = helper(root.right, targetSum);
            if(leftResult || rightResult){
                return true;
            }
            else{
                return false;
            }

        }

        return false;
    }

}