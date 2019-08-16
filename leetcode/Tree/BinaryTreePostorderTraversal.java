import java.util.Stack;

import javax.swing.tree.TreeNode;

class Solution {
    //recusive
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if(root == null) return res;
        helper(root, res);
        return res;
    }
    public void helper(TreeNode root, List<Integer> res){
        if(root == null) return;
        helper(root.left,res);
        helper(root.right,res);
        res.add(root.val);
    }
    //stack
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if(root == null) return res;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode cur = stack.pop();
            res.addFirst(cur.val);
            if(cur.left!= null) stack.push(cur.left);
            if(cur.right!= null) stack.push(cur.right);
        }
        return res;
    }
}