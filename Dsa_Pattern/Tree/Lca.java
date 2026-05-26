package Dsa_Pattern.Tree;

import com.sun.source.tree.Tree;

class TreeNode{
    int val;
    TreeNode left, right;

    TreeNode(int val){
        this.val = val;
    }
}
public class Lca {


   public static TreeNode LowestCommonAncestor(TreeNode root, TreeNode p , TreeNode q){
       if(root == null) return null;
       if(root == p || root == q) return root;

       TreeNode left = LowestCommonAncestor(root.left,p,q);
       TreeNode right = LowestCommonAncestor(root.right,p,q);

       if(left!= null && right != null){
           return root;
       }

       return (left != null) ? left : right;

    }

    public static void main(String[] args) {

    }


}
