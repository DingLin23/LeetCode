public class solution{
//recusive
public List<Integer> preorderTraversal(TreeNode root) {
    List<Integer> res = new ArrayList<>();
    if(root == null) return res;
    helper(root, res);
    return res;
    
}

private void helper(TreeNode root, List<Integer> res){
    if (root == null) return;
    res.add(root.val);
    helper(root.left,res);
    helper(root.right, res);
}


// stack
//time : O(n);
//space : O(n);
public static List<Integer> preorderTraversal(TreeNode root) {
    List<Integer> res = new ArrayList<>();
    if (root == null) return res;
    helper(res, root);
    return res;
}

public static void helper(List<Integer> res, TreeNode root) {
    if (root == null) return;
    res.add(root.val);
    helper(res, root.left);
    helper(res, root.right);
}

public static List<Integer> preorderTraversal2(TreeNode root) {
    List<Integer> res = new ArrayList<>();
    if (root == null) return res;
    Stack<TreeNode> stack = new Stack<>();
    stack.push(root);
    while (!stack.isEmpty()) {
        TreeNode cur = stack.pop();
        if (cur.right != null) stack.push(cur.right);
        if (cur.left != null) stack.push(cur.left);
        res.add(cur.val);
    }
    return res;
}
}

