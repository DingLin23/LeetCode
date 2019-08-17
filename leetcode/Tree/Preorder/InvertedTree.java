class Solution {
    // queue
    public TreeNode invertTree(TreeNode root) {
        if(root == null) return null;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            TreeNode cur = queue.poll();
            TreeNode temp = cur.left;
            cur.left = cur.right;
            cur.right = temp;
            if(cur.left!= null) queue.offer(cur.left);
            if(cur.right!=null) queue.offer(cur.right);
        }
        return root;
}
//recusive
public TreeNode invertTree(TreeNode root) {
    if(root == null) return null;
    TreeNode right = invertTree(root.right);
    TreeNode left = invertTree(root.left);
    root.right = left;
    root.left = right;
    return root;
}
}