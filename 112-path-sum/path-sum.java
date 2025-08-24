import java.util.*;

class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) return false;

        Queue<TreeNode> qNode = new LinkedList<>();
        Queue<Integer> qSum = new LinkedList<>();

        qNode.add(root);
        qSum.add(root.val);

        while (!qNode.isEmpty()) {
            TreeNode node = qNode.poll();
            int currSum = qSum.poll();

            // Check leaf
            if (node.left == null && node.right == null && currSum == targetSum) {
                return true;
            }

            if (node.left != null) {
                qNode.add(node.left);
                qSum.add(currSum + node.left.val);
            }
            if (node.right != null) {
                qNode.add(node.right);
                qSum.add(currSum + node.right.val);
            }
        }
        return false;
    }
}
