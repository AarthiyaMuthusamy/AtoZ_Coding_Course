package Tree.TreeConstruction;

import java.util.HashMap;
import java.util.Map;

public class PreAndInOrder {

    public static void main(String[] args) {
        int[] preOrder = {1,2,4,5,3};
        int[] inOrder = {4,2,5,1,3};

        TreeNode root = buildTree(preOrder,inOrder);
        preOrder(root);
        inOrder(root);

    }

    static void preOrder(TreeNode root){
        if(root == null){
            return;
        }
        System.out.println(root.val);
        preOrder(root.left);
        preOrder(root.right);
    }

    static void inOrder(TreeNode root){
        if(root == null){
            return;
        }

        inOrder(root.left);
        System.out.println(root.val);
        inOrder(root.right);
    }



    static Map<Integer,Integer> inorderMap = new HashMap<>();
    static int preorderIndex = 0;
    public static TreeNode buildTree(int[] preOrder, int[] inOrder) {


        for (int i = 0; i < inOrder.length; i++) {
            inorderMap.put(inOrder[i],i);
        }
        return build(preOrder,0,inorderMap.size()-1,inorderMap);
    }

    public static TreeNode build(int[] preOrder,int left,int right,Map<Integer,Integer> inorderMap){

        if(left > right){
            return null;
        }
        int rootValue = preOrder[preorderIndex];
        preorderIndex++;
        TreeNode root = new TreeNode(rootValue);

        int mid = inorderMap.get(rootValue);

        root.left = build(preOrder,left,mid-1,inorderMap);
        root.right =  build(preOrder,mid+1,right,inorderMap);
        return root;

    }


}
