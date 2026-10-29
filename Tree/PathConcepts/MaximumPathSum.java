package Tree.PathConcepts;

public class MaximumPathSum {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(-10);

        root.left = new TreeNode(9);
        root.right = new TreeNode(20);

//        root.left.left = new TreeNode(15);
//        root.left.right = new TreeNode(7);

        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        System.out.println(pathSumValue(root));


    }

    public static int pathSumValue(TreeNode root){
        if(root == null){
            return 0;
        }
        int maxSum = Integer.MIN_VALUE;
        return maxPathSum(root,maxSum);
    }

    public static int maxPathSum(TreeNode root,int maxSum){
        if(root == null){
            return 0;
        }

        int left = Math.max(0,maxPathSum(root.left,maxSum));
        int right = Math.max(0,maxPathSum(root.right,maxSum));
        maxSum = Math.max(maxSum,(root.val + left + right));

        return root.val + Math.max(left,right);
    }
}
