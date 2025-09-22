import java.util.LinkedList;
import java.util.Queue;

public class Task7C {
    static class Node{
        int val;
        Node left,right;
        Node(int v){val = v;}
    }
    void levelorder(Node root){
        if(root == null) return ;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node temp = q.poll();
            System.out.println(temp.val+" ");
            if(temp.left != null){
                q.add(temp.left);
            }
            if(temp.right != null){
                q.add(temp.right);
            }
        }
    }
    public static void main(String[] args){
        Task7C t = new Task7C();
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        t.levelorder(root);
    }
}
