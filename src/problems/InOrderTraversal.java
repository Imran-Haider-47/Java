package problems;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class InOrderTraversal {

    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5);
        InOrderTraversal inOrder = new InOrderTraversal();
        TreeNode root= inOrder.buildTree(list);
        inOrderTraversal(root, list);
    }
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(){}
        TreeNode(int val)
        {
            this.val = val;
        }
        TreeNode(int val, TreeNode left, TreeNode right){
            this.val = val;
            this.left = left;
            this. right = right;
        }


    }// TreeNode class ends here
    public TreeNode buildTree(List<Integer> values){
        Queue<TreeNode> queue = new LinkedList<>();
        int n = values.size();

        TreeNode root = new TreeNode(values.get(0));
        queue.add(root);

        int i=1;
        while(i<n && !queue.isEmpty()){
            TreeNode currentNode = queue.poll();
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
    public static void inOrderTraversal(TreeNode root,List<Integer> values)
    {
        if(root!=null){
            inOrderTraversal(root,values);
            values.add(root.val);
            inOrderTraversal(root, values);
        }
    }

}
