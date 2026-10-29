package Tree.TreeComparison;

public class SubTree {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);


        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);


        TreeNode subtree = new TreeNode(3);
        subtree.left = new TreeNode(5);
        subtree.right = new TreeNode(7);

        System.out.println(isSubTree(root,subtree));





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

        return isSame(p.left,q.left) && isSame(p.right,q.right);
    }

    public static boolean isSubTree(TreeNode root,TreeNode subTree){
        if(subTree == null){
            return true;
        }
        if(root == null){
            return false;
        }

        if(isSame(root,subTree)){
            return true;
        }

        //find its an either left or right
        return isSubTree(root.left,subTree) || isSubTree(root.right,subTree);
    }
}
