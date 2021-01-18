public class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

}

/*
 * Binary Tree Methods: search, insert, remove, print(pre/post/in-order), full,
 * complete. All method runtimes are O(n) in average and worst case Best case:
 * see BST
 * 
 */

/*
 * Binary Search Tree Methods: search, minimum, maximum, successor, predecessor,
 * insert, delete. Time complexity for all operations is O(h) = O(logn). If
 * unbalanced, runtime is O(n)
 */
