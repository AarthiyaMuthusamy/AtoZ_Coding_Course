package Tree.BoundaryTraversalTree;

import java.util.ArrayList;
import java.util.List;

public class Boundary {

        public static void main(String[] args) {
        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        root.left.left.left = new TreeNode(8);
        root.left.right.right = new TreeNode(9);

        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        System.out.println(boundaryTraversal(root));


    }

    public static List<Integer> boundaryTraversal(TreeNode root){
       List<Integer> list = new ArrayList<>();
        if(root == null){
            return list;
        }

        //add root
        if(!isLeaf(root)){
            list.add(root.val);
        }
        else{
            list.add(root.val);
            return list;
        }


        //add left most
        TreeNode curr = root.left;
        while (curr != null){
            if(!isLeaf(curr)){
                list.add(curr.val);
            }
            if(curr.left != null){
                curr = curr.left;
            }
            else{
                curr = curr.right;
            }
        }

        //all leaf nodes
        allLeaves(root,list);


        //add right most
        List<Integer> boundaryRight = new ArrayList<>();
        curr = root.right;
        while (curr != null){
            if(!isLeaf(curr)){
                boundaryRight.add(curr.val);
            }
            if(curr.right != null){
                curr = curr.right;
            }
            else{
                curr = curr.left;
            }
        }

        for (int i = boundaryRight.size()-1; i >= 0 ; i--) {
            list.add(boundaryRight.get(i));
        }
        return list;

    }


    public static boolean isLeaf(TreeNode root){
        return root.left == null && root.right == null;
    }
    public static void allLeaves(TreeNode root,List<Integer> list){

        if (root == null){
            return;
        }
        if(isLeaf(root)){
            list.add(root.val);
            return;
        }
        allLeaves(root.left, list);
        allLeaves(root.right, list);

    }
}
