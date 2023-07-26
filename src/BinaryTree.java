import java.util.ArrayList;
import java.util.List;

class BinaryTree {
    private List<Integer> tree;

    public BinaryTree() {
        tree = new ArrayList<>();
        tree.add(null);
    }

    public void insert(int value) {
        tree.add(value);
    }

    public boolean search(int value) {
        return tree.contains(value);
    }

    public void inorder() {
        inorder(1);
    }

    private void inorder(int index) {
        if (index < tree.size() && tree.get(index) != null) {
            inorder(index * 2);
            System.out.print(tree.get(index) + " ");
            inorder(index * 2 + 1);
        }
    }

    public void preorder() {
        preorder(1);
    }

    private void preorder(int index) {
        if (index < tree.size() && tree.get(index) != null) {
            System.out.print(tree.get(index) + " ");
            preorder(index * 2);
            preorder(index * 2 + 1);
        }
    }

    public void postorder() {
        postorder(1);
    }

    private void postorder(int index) {
        if (index < tree.size() && tree.get(index) != null) {
            postorder(index * 2);
            postorder(index * 2 + 1);
            System.out.print(tree.get(index) + " ");
        }
    }

    public int height() {
        return height(1);
    }

    private int height(int index) {
        if (index >= tree.size() || tree.get(index) == null) {
            return 0;
        } else {
            int leftHeight = height(index * 2);
            int rightHeight = height(index * 2 + 1);
            return 1 + Math.max(leftHeight, rightHeight);
        }
    }

    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();

        binaryTree.insert(5);
        binaryTree.insert(3);
        binaryTree.insert(7);
        binaryTree.insert(2);
        binaryTree.insert(4);
        binaryTree.insert(6);
        binaryTree.insert(8);

        System.out.print("Inorder :");
        binaryTree.inorder();
        System.out.println();

        System.out.print("Preorder : ");
        binaryTree.preorder();
        System.out.println();

        System.out.print("Postorder : ");
        binaryTree.postorder();
        System.out.println();

        int searchValue = 4;
        System.out.println("Element " + searchValue + " found: " + binaryTree.search(searchValue));

        System.out.println("Height of the binary tree: " + binaryTree.height());
    }
}