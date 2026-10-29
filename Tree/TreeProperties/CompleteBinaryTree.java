package Tree.TreeProperties;

import java.util.LinkedList;
import java.util.Queue;

public class CompleteBinaryTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
//        root.left.right = new TreeNode(5);


        root.right.left = new TreeNode(6);


        System.out.println(completeBinary(root));


    }

    public static boolean completeBinary(TreeNode root){

        if(root == null){
            return true;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        boolean nodeFull = false;
        while (!queue.isEmpty()){
            TreeNode node = queue.poll();
            //if node becomes null then
            if(node == null){
                nodeFull = true;
                continue;
            }

            //node value present
            if(nodeFull){
                return false;
            }

                queue.offer(node.left);
                queue.offer(node.right);


        }
        return true;

    }
}
