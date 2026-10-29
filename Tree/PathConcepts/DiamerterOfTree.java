package Tree.PathConcepts;

public class DiamerterOfTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(-10);

        root.left = new TreeNode(9);
        root.right = new TreeNode(20);

        root.left.left = new TreeNode(12);
        root.left.right = new TreeNode(3);

//        root.right.left = new TreeNode(15);
//        root.right.right = new TreeNode(7);
        System.out.println(diamerterPath(root));


    }

    public static int diamerterPath(TreeNode root){
        if(root == null){
            return 0;
        }
        int diameter = Integer.MIN_VALUE;
        return highDiameter(root,diameter);
    }

    public static int highDiameter(TreeNode root,int diameter){
        if(root == null){
            return 0;
        }

        int leftHeight = highDiameter(root.left,diameter);
        int rightHeight = highDiameter(root.right,diameter);
        diameter = Math.max(diameter,leftHeight + rightHeight);

        return 1 + Math.max(leftHeight,rightHeight);
    }
}
