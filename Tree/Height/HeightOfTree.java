package Tree.Height;


public class HeightOfTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);


        root.right.left = new TreeNode(6);


        System.out.println(heightTree(root));


    }
    public static int heightTree(TreeNode root){
        if(root == null) return 0;

        int leftHeight = heightTree(root.left);
        int rightHeight = heightTree(root.right);
        return 1 + Math.max(leftHeight,rightHeight);

    }
}
