package Tree.PathConcepts;

import java.util.ArrayList;
import java.util.List;

public class RootToLeafPath {

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        List<Integer> paths = new ArrayList<>();
        path(root,paths);


    }



    public static void path(TreeNode root, List<Integer> paths){
        if(root == null){
            return;
        }
        paths.add(root.val);
        if(root.left == null && root.right == null){
            System.out.println(paths);
        }

        path(root.left,paths);
        path(root.right,paths);
        paths.removeLast();

    }
}
