import java.util.LinkedList;
import java.util.Queue;

import javax.swing.tree.TreeNode;

//time:O(n)
//space:O(n)
class Solution {
    //recusive
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) return res;
        helper(root,res,0);
        return res;
    }
    public void helper(TreeNode root,List<List<Integer>> res,int level){
        if(root == null) return;
        if(level>=res.size()){
            res.add(new Arraylist<>());
        }
        res.get(level).add(root.val);
        helper(root.left,res,level+1);
        helper(root.right, res, level+1);
    }

    //queue
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null) return res;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> list = new ArrayList<>();
            for(int i = 0; i < size;i++){
                TreeNode cur = queue.poll();
                if(cur.left!=null) queue.offer(cur.left);
                if(cur.right!=null) queue.offer(cur.right);
                list.add(cur.val)l;
            }
            res.add(list);
        }
        return res;

    }
}