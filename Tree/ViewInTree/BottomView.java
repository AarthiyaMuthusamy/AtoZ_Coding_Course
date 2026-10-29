package Tree.ViewInTree;



import java.util.*;
class Pair1{
    TreeNode node;
    int hd;
    public Pair1(int hd,TreeNode node){
        this.node = node;
        this.hd = hd;
    }
}
public class BottomView {

        public static void main(String[] args) {
        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        System.out.println(bottomViewTree(root));


    }
    public static List<Integer> bottomViewTree(TreeNode root){
        List<Integer> ans = new ArrayList<>();
        if(root == null){
            return ans;
        }
        TreeMap<Integer,Integer> map = new TreeMap<>();
        Queue<Pair1> queue = new LinkedList<>();
        queue.offer(new Pair1(0,root));
        while (!queue.isEmpty()){
            Pair1 current = queue.poll();
            TreeNode node = current.node;
            int hd = current.hd;

            //just override the last value we need for bottom
            map.put(hd,node.val);

            if(node.left != null){
                queue.offer(new Pair1(hd-1,node.left));
            }
            if(node.right != null){
                queue.offer(new Pair1(hd+1,node.right));
            }

        }
        ans.addAll(map.values());
        return ans;

    }
}
