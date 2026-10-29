package Tree.TreeConstruction;

import java.util.HashMap;
import java.util.Map;

public class InAndPostOrder {
    public static void main(String[] args) {

        int[] inOrder = {4,2,5,1,3};
        int[] postOrder = {4,5,2,3,1};

        TreeNode root = buildTree(postOrder,inOrder);
        inOrder(root);
        postOrder(root);


    }



    static void inOrder(TreeNode root){
        if(root == null){
            return;
        }

        inOrder(root.left);
        System.out.println(root.val);
        inOrder(root.right);
    }
    static void postOrder(TreeNode root){
        if(root == null){
            return;
        }

        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.val);
    }



    static Map<Integer,Integer> inorderMap = new HashMap<>();
    static int postorderIndex;
    public static TreeNode buildTree(int[] postOrder, int[] inOrder) {

        postorderIndex = postOrder.length-1;
        for (int i = 0; i < inOrder.length; i++) {
            inorderMap.put(inOrder[i],i);
        }
        return build(postOrder,0,inorderMap.size()-1);
    }

    public static TreeNode build(int[] postOrder,int left,int right){

        if(left > right){
            return null;
        }

        int rootValue = postOrder[postorderIndex--];

        TreeNode root = new TreeNode(rootValue);

        int mid = inorderMap.get(rootValue);

        root.right =  build(postOrder,mid+1,right);
        root.left = build(postOrder,left,mid-1);

        return root;

    }
}
