class Task7A{
    static class Node{
        int val;
        Node left,right;
        Node(int v){val = v;}
    }
    int maxpath = 0;
    int dfs(Node root){
        if(root == null) return 0;
        int left = dfs(root.left), right = dfs(root.right);
        int leftpath = 0, rightpath = 0;
        if(root.left != null && root.left.val == root.val){
            leftpath = left + 1;
        }
        if(root.right != null && root.right.val == root.val){
            rightpath = right + 1;
        }
        maxpath = Math.max(maxpath,leftpath+rightpath);
        return Math.max(leftpath, rightpath);
    }
    int longestunivaluepath(Node root){
        dfs(root);
        return maxpath;
    }
    public static void main(String[] args){
        Task7A t = new Task7A();
        Node root = new Node(5);
        root.left = new Node(4);
        root.right = new Node(5);
        root.left.left = new Node(4);
        root.left.right = new Node(4);
        root.right.right = new Node(5);
        System.out.println(t.longestunivaluepath(root));
    }
}