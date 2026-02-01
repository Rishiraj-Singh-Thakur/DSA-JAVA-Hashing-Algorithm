import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeMap;

public class BottomView {

    static class Node{
        int data;
        Node left, right;
        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class pair{
        Node node;
        int x;

        public pair(Node node,int x){
            this.node = node;
            this.x = x;
        }
    }

    public static ArrayList<Integer> BottomAns(Node root){
        ArrayList<Integer> ans = new ArrayList<>();
        if(root==null){
            return ans;
        }

        TreeMap<Integer,Integer> mp = new TreeMap<>();
        Queue<pair> q = new LinkedList<>();
        q.add(new pair(root ,0));

        while (!q.isEmpty()) {
            pair p = q.remove();
            Node curr = p.node;
            int x = p.x;

            mp.put(x, curr.data);

            if(curr.left != null){
                q.add(new pair(curr.left, x-1));
            }
            if(curr.right != null){
                q.add(new pair(curr.right, x+1));
            }
        }

        for(int val : mp.values()){
            ans.add(val);
        }
        return ans;
    }

    public static void main(String[] args) {
        Node root = new Node(2);
        root.left = new Node(3);
        root.right = new Node(4);
        root.left.left = new Node(5);
        root.left.right = new Node(6);
        root.right.left = new Node(7);
        root.right.right = new Node(8);

        System.out.println(BottomAns(root));
    }
}
