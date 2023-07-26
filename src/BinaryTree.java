import java.util.ArrayList;
import java.util.List;

class BinaryTree {
    private List<Integer> tree;

    public BinaryTree() {
        tree = new ArrayList<>();
        tree.add(null); // Null element at index 0 for simplicity (not used).
    }

    // Function to insert a new element into the binary tree.
    public void insert(int value) {
        tree.add(value);
    }

    // Function to search for a value in the binary tree.
    public boolean search(int value) {
        return tree.contains(value);
    }

    // Function to perform an inorder traversal of the binary tree.
    public void inorderTraversal() {
        inorderTraversal(1); // Start from the root (index 1).
    }

    private void inorderTraversal(int index) {
        if (index < tree.size() && tree.get(index) != null) {
            inorderTraversal(index * 2); // Left child.
            System.out.print(tree.get(index) + " ");
            inorderTraversal(index * 2 + 1); // Right child.
        }
    }

    // Function to perform a preorder traversal of the binary tree.
    public void preorderTraversal() {
        preorderTraversal(1); // Start from the root (index 1).
    }

    private void preorderTraversal(int index) {
        if (index < tree.size() && tree.get(index) != null) {
            System.out.print(tree.get(index) + " ");
            preorderTraversal(index * 2); // Left child.
            preorderTraversal(index * 2 + 1); // Right child.
        }
    }

    // Function to perform a postorder traversal of the binary tree.
    public void postorderTraversal() {
        postorderTraversal(1); // Start from the root (index 1).
    }

    private void postorderTraversal(int index) {
        if (index < tree.size() && tree.get(index) != null) {
            postorderTraversal(index * 2); // Left child.
            postorderTraversal(index * 2 + 1); // Right child.
            System.out.print(tree.get(index) + " ");
        }
    }

    // Function to get the height of the binary tree.
    public int height() {
        return height(1); // Start from the root (index 1).
    }

    private int height(int index) {
        if (index >= tree.size() || tree.get(index) == null) {
            return 0;
        } else {
            int leftHeight = height(index * 2); // Left child.
            int rightHeight = height(index * 2 + 1); // Right child.
            return 1 + Math.max(leftHeight, rightHeight);
        }
    }

    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();

        // Insert elements into the binary tree.
        binaryTree.insert(5);
        binaryTree.insert(3);
        binaryTree.insert(7);
        binaryTree.insert(2);
        binaryTree.insert(4);
        binaryTree.insert(6);
        binaryTree.insert(8);

        // Inorder traversal.
        System.out.print("Inorder Traversal: ");
        binaryTree.inorderTraversal();
        System.out.println();

        // Preorder traversal.
        System.out.print("Preorder Traversal: ");
        binaryTree.preorderTraversal();
        System.out.println();

        // Postorder traversal.
        System.out.print("Postorder Traversal: ");
        binaryTree.postorderTraversal();
        System.out.println();

        // Search for an element.
        int searchValue = 4;
        System.out.println("Element " + searchValue + " found: " + binaryTree.search(searchValue));

        // Get the height of the binary tree.
        System.out.println("Height of the binary tree: " + binaryTree.height());
    }
}