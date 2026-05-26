package Dsa_Pattern.Tree;
import Dsa_Pattern.Tree.TreeNode;

import java.awt.event.MouseWheelEvent;

public class DiameterOfTree {
    public static void main(String[] args) {

    }
    int diameter = 0;
    public  int diameterofBinaryTree(TreeNode root){
        height(root);
        return diameter;

    }

    private int height(TreeNode root){
        if(root == null) return 0;

        int leftHeight  = height(root.left);
        int rightHeight = height(root.right);

        diameter = Math.max(diameter, leftHeight+rightHeight);


        return Math.max(leftHeight,rightHeight)+1;


    }
}
