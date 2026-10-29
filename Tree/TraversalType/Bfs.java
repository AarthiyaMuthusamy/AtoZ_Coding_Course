package Tree.TraversalType;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Bfs {

//    public static void main(String[] args) {
//        TreeNode root = new TreeNode(1);
//
//        root.left = new TreeNode(2);
//        root.right = new TreeNode(3);
//
//        root.left.left = new TreeNode(4);
//        root.left.right = new TreeNode(5);
//
//        root.right.left = new TreeNode(6);
//        root.right.right = new TreeNode(7);
//        System.out.println(levelOrder(root));
//        System.out.println(levelOrderList(root));
//
//
//    }
    public static List<Integer> levelOrder(TreeNode root){
        List<Integer> ans = new ArrayList<>();
        if(root == null){
            return ans;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            TreeNode node = queue.poll();
            ans.add(node.val);
            if(node.left != null){
                queue.offer(node.left);
            }
            if(node.right != null){
                queue.offer(node.right);
            }

        }
        return ans;

    }

    public static List<List<Integer>> levelOrderList(TreeNode root){
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null){
            return ans;
        }


        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);


            while (!queue.isEmpty()){
                int size = queue.size();
                List<Integer> list = new ArrayList<>();
                for (int i = 0; i < size ; i++) {
                    TreeNode node = queue.poll();
                    list.add(node.val);
                    if (node.left != null) {
                        queue.offer(node.left);
                    }
                    if (node.right != null) {
                        queue.offer(node.right);
                    }
                }
                ans.add(list);

            }




        return ans;

    }
}
