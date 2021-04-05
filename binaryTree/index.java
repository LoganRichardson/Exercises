package binaryTree;

public class index {

    Node root;

    public static void main(String[] args) {
        index tree = new index();
        tree.addNode(2, "Bob");
        tree.addNode(5, "Sarah");
        tree.addNode(3, "Karl");
        tree.addNode(11, "Dan");
        tree.addNode(1, "Kyle");

        System.out.println("In Order: ");
        inOrder(tree.root);

        System.out.println("");
        System.out.println("Pre Order: ");
        preOrder(tree.root);

        System.out.println("");
        System.out.println("Post Order: ");
        postOrder(tree.root);
    }

    public void addNode(int key, String name) {
        Node newNode = new Node(key, name);
        if (root == null) {
            root = newNode;
        } else {
            Node focusNode = root;
            Node parent;
            while (true) {
                parent = focusNode;
                if (key < focusNode.key) {
                    focusNode = focusNode.leftChild;
                    if (focusNode == null) {
                        parent.leftChild = newNode;
                        return;
                    }
                }
                if (key > focusNode.key) {
                    focusNode = focusNode.rightChild;
                    if (focusNode == null) {
                        parent.rightChild = newNode;
                        return;
                    }
                }
            }
        }
    }

    public static void inOrder(Node focusNode) {
        if (focusNode != null) {
            inOrder(focusNode.leftChild);
            System.out.println(focusNode);
            inOrder(focusNode.rightChild);
        }
    }

    public static void preOrder(Node focusNode) {
        if (focusNode != null) {
            System.out.println(focusNode);
            preOrder(focusNode.leftChild);
            preOrder(focusNode.rightChild);
        }
    }

    public static void postOrder(Node focusNode) {
        if (focusNode != null) {
            postOrder(focusNode.leftChild);
            postOrder(focusNode.rightChild);
            System.out.println(focusNode);
        }
    }

    class Node {

        Node leftChild;
        Node rightChild;

        int key;
        String name;

        public Node(int key, String name) {
            this.key = key;
            this.name = name;
        }

        public String toString() {
            return name + " has a key " + key;
        }
    }
}
