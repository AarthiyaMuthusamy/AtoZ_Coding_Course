package Tree.SerializeAndDeserialize;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class SerializeDeserialize {

        public static void main(String[] args) {
        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
       // System.out.println(serialize(root));

        String str = serialize(root);
        System.out.println(str);
        TreeNode node = deserialize(str);
        System.out.println(levelOrder(node));



    }
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

    public static String serialize(TreeNode root){
        if(root == null) return "N";

        StringBuilder result = new StringBuilder();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            TreeNode node = queue.poll();
            if(node == null){
                result.append("N,");
                continue;
            }
            result.append(node.val).append(",");
            queue.offer(node.left);
            queue.offer(node.right);
        }

        return result.toString();
    }

    public static TreeNode deserialize(String data){
        if(data.equals("N")) return null;
        String[] values = data.split(",");
        TreeNode root = new TreeNode(Integer.parseInt(values[0]));

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int i =1;
        while (!queue.isEmpty() && i < values.length){
            TreeNode node = queue.poll();

            //left
            if(!values[i].equals("N")){
                node.left = new TreeNode(Integer.parseInt(values[i]));
                queue.offer(node.left);
            }
            i++;

            if(i < values.length && !values[i].equals("N")){
                node.right = new TreeNode(Integer.parseInt(values[i]));
                queue.offer(node.right);
            }
            i++;


        }
        return root;
    }
}
