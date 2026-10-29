package Tree.ViewInTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class RightView {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

//        root.left.right.left = new TreeNode(7);

//        root.right.left = new TreeNode(6);
//        root.right.right = new TreeNode(7);
        System.out.println(rightViewOfTree(root));


    }
    public static List<Integer> rightViewOfTree(TreeNode root){
        List<Integer> list = new ArrayList<>();

        if(root == null){
            return list;
        }


        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);


        while (!queue.isEmpty()){
            int size = queue.size();

            for (int i = 0; i < size ; i++) {
                TreeNode node = queue.poll();
                //only the first element in each level
                if(i == size - 1){
                    list.add(node.val);
                }

                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }


        }

        return list;
    }
}
