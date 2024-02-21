
package problems;

import com.sun.source.tree.Tree;

import java.util.*;

class PathSum {


    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5);
        PathSum pathsum = new PathSum();
        TreeNode treeNode = pathsum.buildTree(list);

        List<Integer> result = new ArrayList<>();
        pathsum.preorderTraversal(treeNode, result);

        System.out.println(result);


    }
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
    public TreeNode buildTree(List<Integer> values){
        int n = values.size();
        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode root = new TreeNode(values.get(0));
        queue.add(root);
        int i=1;
        while(i<n && !queue.isEmpty()){
            TreeNode currentNode  = queue.poll();
            currentNode.left = new TreeNode(values.get(i));
            queue.add(currentNode.left);
            i=i+1;
            if(i>=n){
                break;
            }
            currentNode.right = new TreeNode(values.get(i));
            queue.add(currentNode.right);

            i=i+1;

        }

        return root;
    }


    public void preorderTraversal(TreeNode root, List<Integer> values) {

        if(root!=null) {

            preorderTraversal(root.left, values);
            preorderTraversal(root.right, values);
            values.add(root.val);
        }
    }
}