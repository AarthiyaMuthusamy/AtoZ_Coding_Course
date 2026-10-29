package Tree.TreeProperties;

public class FullBinaryTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);


        root.right.left = new TreeNode(6);


        System.out.println(isFull(root));


    }

    public static boolean isFull(TreeNode root){

        if(root == null){
            return true;
        }
        //leaf

        if(root.left == null && root.right == null){
            return true;
        }
        //one child
        if(root.left == null || root.right == null){
            return false;
        }
        //two child
        return isFull(root.left) && isFull(root.right);
    }
}
