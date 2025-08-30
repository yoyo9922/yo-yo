class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) return null;

        if (key < root.val) {
            root.left = deleteNode(root.left, key);
        } else if (key > root.val) {
            root.right = deleteNode(root.right, key);
        } else {
            // Case 1 & 2: Node with 0 or 1 child
            if (root.left == null) return root.right;
            if (root.right == null) return root.left;

            // Case 3: Node with 2 children
            TreeNode successor = findMin(root.right);
            root.val = successor.val; // replace value
            root.right = deleteNode(root.right, successor.val); // delete successor
        }
        return root;
    }

    private TreeNode findMin(TreeNode node) {
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }
}
