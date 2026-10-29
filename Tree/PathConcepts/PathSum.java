package Tree.PathConcepts;



public class PathSum {
        public static void main(String[] args) {
        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        System.out.println(hasPath(root,13));


    }
    public static boolean hasPath(TreeNode root, int targetSum){
        if(root == null){
            return false;
        }

        //leaf means target values is equal to the root.val then this is the path have the sum value
        if(root.left == null && root.right == null){
            return targetSum == root.val;
        }
        targetSum -= root.val;

        return hasPath(root.left,targetSum) || hasPath(root.right,targetSum);


    }
}
