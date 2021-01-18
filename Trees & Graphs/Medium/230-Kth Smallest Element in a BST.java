class Solution {
    public int kthSmallest(TreeNode root, int k) {
        int[] elements = new int[2];
        inorderBST(elements, k, root);
        return elements[1];
    }

    public void inorderBST(int[] array, int k, TreeNode root) {
        if (root == null)
            return;
        inorderBST(array, k, root.left);
        // actual work
        if (++array[0] == k) {
            array[1] = root.val;
            return;
        }
        inorderBST(array, k, root.right);
    }
}
// time: O(n) to build traversal
// space: O(n) to keep inorder traversal