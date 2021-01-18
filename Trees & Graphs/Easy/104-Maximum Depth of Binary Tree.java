class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null)
            return 0;
        int maxdepth = 1;
        maxdepth += Math.max(maxDepth(root.left), maxDepth(root.right));
        return maxdepth;
    }
}
// time: O(n) - recursion touches every node
// space: O(logn) (verify) - height of tree