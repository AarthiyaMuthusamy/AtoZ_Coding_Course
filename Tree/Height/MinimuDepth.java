package Tree.Height;



public class MinimuDepth {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
       root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.left.left = new TreeNode(7);
//        root.left.right = new TreeNode(5);





        System.out.println(minDepth(root));


    }
    public static int minDepth(TreeNode root){
        if(root == null) {
            return 0;
        }
        if(root.left == null){
            return  1 + minDepth(root.right);
        }
        if(root.right == null){
            return 1 + minDepth(root.left);
        }
        int left = minDepth(root.left);
        int right = minDepth(root.right);
        return 1 + Math.min(left,right);
    }
}
