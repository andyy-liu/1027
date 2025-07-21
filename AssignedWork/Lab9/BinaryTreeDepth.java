class TreeNode {
    int value;
    TreeNode left;
    TreeNode right;

    TreeNode(int value) {
        this.value = value;
        left = null;
        right = null;
    }
}

public class BinaryTreeDepth {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(6);

        int depth = calculateDepth(root);
        System.out.println("The depth of the tree is: " + depth);
    }

    public static int calculateDepth(TreeNode node) {
        if (node == null) {
            return 1;
        } else {
            int leftDepth = calculateDepth(node.left);
            int rightDepth = calculateDepth(node.right);

            return Math.min(leftDepth, rightDepth) + 1;
        }
    }
}
