package Tree.TreeProperties;

public class BalancedBinaryTree {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);


        root.right.left = new TreeNode(6);


        System.out.println(isbalanced(root));


    }
    public static boolean isbalanced(TreeNode root){
        return heightofTree(root) != -1;
    }
    public static int heightofTree(TreeNode root){
        if(root == null)
        {
            return  0;
        }
        int left = heightofTree(root.left);
        if(left == -1){
            return -1;
        }
        int right = heightofTree(root.right);
        if(right == -1){
            return -1;
        }

        if(Math.abs(left-right) > 1){
            return -1;
        }

        return 1 + Math.max(left,right);
    }
}
