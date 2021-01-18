class Solution {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        // base cases
        if (t1 == null && t2 == null)
            return null;
        if (t1 == null)
            return t2;
        if (t2 == null)
            return t1;
        TreeNode newNode = new TreeNode(t1.val + t2.val);
        // recursion
        newNode.left = mergeTrees(t1.left, t2.left);
        newNode.right = mergeTrees(t1.right, t2.right);
        return newNode;

    }
}

// time: O(2^n) - total nodes in recursion tree
// space: O(n) - depth of recursion tree

// Note: ask yourself - How many calls to function were on the stack at any
// given time? This is space complexity
