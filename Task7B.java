public class Task7B {
    static class Node{
        int val;
        Node left,right;
        Node(int v){val = v;}
    }
    int countpaths(Node root){
        if(root == null) return 0;
        if(root.left == null && root.right == null) return 1;
        return countpaths(root.left)+countpaths(root.right);
    }
    public static void main(String[] args){
        Task7B t = new Task7B();
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        System.out.println(t.countpaths(root));
    }
}
