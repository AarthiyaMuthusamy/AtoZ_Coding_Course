package Tree.Counting;



public class CountOneOrTwoChildren {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);


        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        //System.out.println(countOneChild(root));
        System.out.println(countTwoChild(root));


    }
    public static int countOneChild(TreeNode root){
        if(root == null){
            return 0;
        }
        if((root.left == null && root.right != null) || (root.left != null && root.right ==null)){
            return 1;
        }

        return countOneChild(root.left) + countOneChild(root.right);
    }

    public static int countTwoChild(TreeNode root){
        if(root == null){
            return 0;
        }
        int count = 0;
        if(root.left != null && root.right != null){
            count = 1;
        }

        return count + countTwoChild(root.left) + countTwoChild(root.right);
    }
}
