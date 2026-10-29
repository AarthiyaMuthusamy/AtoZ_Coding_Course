package Tree.ViewInTree;



import java.util.*;
class Pair{
    TreeNode node;
    int hd;
    public Pair(int hd,TreeNode node){
        this.node = node;
        this.hd = hd;
    }
}
public class TopView {

        public static void main(String[] args) {
        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
            System.out.println(topViewTree(root));


    }
    public static List<Integer> topViewTree(TreeNode root){
        List<Integer> ans = new ArrayList<>();
        if(root == null){
            return ans;
        }
        TreeMap<Integer,Integer> map = new TreeMap<>();
        Queue<Pair> queue = new LinkedList<>();
        queue.offer(new Pair(0,root));
        while (!queue.isEmpty()){
            Pair current = queue.poll();
            TreeNode node = current.node;
            int hd = current.hd;
            if(!map.containsKey(hd)){
                map.put(hd,node.val);
            }
            if(node.left != null){
                queue.offer(new Pair(hd-1,node.left));
            }
            if(node.right != null){
                queue.offer(new Pair(hd+1,node.right));
            }

        }
        ans.addAll(map.values());
        return ans;

    }
}
