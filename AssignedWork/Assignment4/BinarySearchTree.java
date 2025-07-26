import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {
    public TreeNode root;

    public void addNode(int value) {
        // start recursive insertion from root
        root = addRecursive(root, value);
    }

    // helper method
    private TreeNode addRecursive(TreeNode root, int value) {
        if (root == null) {
            // create new node if we reach empty spot
            return new TreeNode(value);
        }
        if (root.value < value) {
            // go right if value is larger
            root.right = addRecursive(root.right, value);
        } else if (root.value > value) {
            // go left if value is smaller
            root.left = addRecursive(root.left, value);
        }
        // return unchanged node if value already exists
        return root;
    }

    public int getNodeCount() {
        // start counting from root
        return countNodes(root);
    }

    // helper method
    private int countNodes(TreeNode node) {
        if (node == null) {
            // empty subtree has 0 nodes
            return 0;
        }
        // count current node + left subtree + right subtree
        return 1 + countNodes(node.left) + countNodes(node.right);
    }

    public boolean containsNode(int value) {
        // start search from root
        return containsRecursive(root, value);
    }

    // helper method
    private boolean containsRecursive(TreeNode node, int value) {
        if (node == null) {
            // value not found if we reach null node
            return false;
        }

        if (value == node.value) {
            // found the value
            return true;
        } else if (value < node.value) {
            // search left subtree if value is smaller
            return containsRecursive(node.left, value);
        } else {
            // search right subtree if value is larger
            return containsRecursive(node.right, value);
        }
    }

    public ArrayList<Integer> bfsTraversal() {
        if (root == null)
            // return empty list for empty tree
            return new ArrayList<>();

        ArrayList<Integer> result = new ArrayList<>();
        // use queue for level-by-level processing
        Queue<TreeNode> queue = new LinkedList<>();

        // start with root node
        queue.add(root);

        while (!queue.isEmpty()) {
            // process next node from queue
            TreeNode current = queue.poll();
            result.add(current.value);

            // add children to queue for next level processing
            if (current.left != null) {
                queue.add(current.left);
            }
            if (current.right != null) {
                queue.add(current.right);
            }
        }

        return result;
    }

    public int getHeight() {
        // start height calculation from root
        return getHeightRecursive(root);
    }

    // helper method
    private int getHeightRecursive(TreeNode node) {
        if (node == null) {
            // height of empty tree is -1
            return -1;
        }

        // get height of left and right subtrees
        int leftHeight = getHeightRecursive(node.left);
        int rightHeight = getHeightRecursive(node.right);

        // height is max of subtrees plus 1 for current level
        return Math.max(leftHeight, rightHeight) + 1;
    }
}