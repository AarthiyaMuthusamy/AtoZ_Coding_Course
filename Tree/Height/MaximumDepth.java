package Tree.Height;



import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class MaximumDepth {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);


        root.right.left = new TreeNode(6);


        System.out.println(maxDepth(root));
        System.out.println(maxWithBfs(root));


    }
    public static int maxDepth(TreeNode root){
        if(root == null) return 0;

        int leftHeight = maxDepth(root.left);
        int rightHeight = maxDepth(root.right);
        return 1 + Math.max(leftHeight,rightHeight);
    }

    public static int maxWithBfs(TreeNode root){
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null){
            return 0;
        }


        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int depth = 0;

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
            depth++;

        }




        return depth;
    }
}
