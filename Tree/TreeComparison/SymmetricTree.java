package Tree.TreeComparison;

public class SymmetricTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(2);

        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);


        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(3);


        System.out.println(symmetricTree(root));


    }

    public static boolean symmetricTree(TreeNode root){
        if(root == null){
            return true;
        }
        return isSame(root.left,root.right);
    }
    public static boolean isSame(TreeNode p, TreeNode q){
        if(p == null && q == null){
            return true;
        }
        if(p == null || q == null){
            return false;
        }
        if(p.val != q.val){
            return false;
        }

        return isSame(p.left,q.right) && isSame(p.right,q.left);
    }
}
