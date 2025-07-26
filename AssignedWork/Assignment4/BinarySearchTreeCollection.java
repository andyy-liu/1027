import java.util.ArrayList;

public class BinarySearchTreeCollection {
    private ArrayList<BinarySearchTree> trees;

    public BinarySearchTreeCollection() {
        trees = new ArrayList<>();
    }

    public void addTree(BinarySearchTree tree) {
        trees.add(tree);
    }

    public BinarySearchTree getTree(int index) {
        if (index < 0 || index >= trees.size()) {
            throw new IllegalArgumentException("Invalid argument!");
        }
        return trees.get(index);
    }

    public void deleteTree(int index) {
        if (index < 0 || index >= trees.size()) {
            throw new IllegalArgumentException("Invalid argument!");
        }
        trees.remove(index);
    }

    public int getNumberOfTrees() {
        return trees.size();
    }

    public boolean areStructurallyEquivalent(int[] indices) {
        // there must be at least two indices in the int array passed as an argument
        if (indices.length < 2) {
            throw new IllegalArgumentException("Invalid argument!");
        }

        // if an int in indices represents a non-existent index, throw
        // IllegalArgumentException
        for (int index : indices) {
            if (index < 0 || index >= trees.size()) {
                throw new IllegalArgumentException("Invalid argument!");
            }
        }

        // compare structure of first tree with all others
        BinarySearchTree firstTree = trees.get(indices[0]);
        for (int i = 1; i < indices.length; i++) {
            BinarySearchTree currentTree = trees.get(indices[i]);
            if (!areStructurallyEqual(firstTree.root, currentTree.root)) {
                return false;
            }
        }

        return true;
    }

    // helper method
    private boolean areStructurallyEqual(TreeNode node1, TreeNode node2) {
        if (node1 == null && node2 == null) {
            return true;
        }
        if (node1 == null || node2 == null) {
            return false;
        }
        // check both structure AND values
        return node1.value == node2.value &&
                areStructurallyEqual(node1.left, node2.left) &&
                areStructurallyEqual(node1.right, node2.right);
    }

    public void merge(int[] indices) {
        // there must be at least two indices in the int array passed as an argument
        if (indices.length < 2) {
            throw new IllegalArgumentException("Invalid argument!");
        }

        // validate all indices first - if any index is invalid, throw exception
        for (int index : indices) {
            if (index < 0 || index >= trees.size()) {
                throw new IllegalArgumentException("Invalid argument!");
            }
        }

        // create new merged tree
        BinarySearchTree mergedTree = new BinarySearchTree();

        // collect all values from specified trees, remove duplicates, and sort them
        ArrayList<Integer> allValues = new ArrayList<>();
        for (int index : indices) {
            ArrayList<Integer> treeValues = trees.get(index).bfsTraversal();
            for (Integer value : treeValues) {
                if (!allValues.contains(value)) {
                    allValues.add(value);
                }
            }
        }

        // sort values to ensure consistent order for insertion
        java.util.Collections.sort(allValues);

        // add sorted unique values to merged tree
        for (Integer value : allValues) {
            mergedTree.addNode(value);
        }

        // remove original trees (sort indices in descending order to avoid index
        // shifting)
        java.util.Arrays.sort(indices);
        for (int i = indices.length - 1; i >= 0; i--) {
            trees.remove(indices[i]);
        }

        // add merged tree to collection
        trees.add(mergedTree);
    }

    public int getTotalNodes() {
        // sum and return the number of TreeNodes in all BinarySearchTree objects
        int total = 0;
        for (BinarySearchTree tree : trees) {
            total += tree.getNodeCount();
        }
        return total;
    }

}
