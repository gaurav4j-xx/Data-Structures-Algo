package trees;

import lombok.Data;
import lombok.NonNull;

public class MyBinaryTree {
    private Node root;

    public void addNode(int data) {
        Node nodeToAdd = new Node(data);
        if (root == null) {
            root = nodeToAdd;
        } else {
            traverseAndAddNode(root, nodeToAdd);
        }
    }

    public void inOrderTraverse() {
        if (root == null) {
            System.out.println("Root is null");
        } else if (root != null && root.getLeftChild() == null && root.getRightChild() == null) {
            System.out.println(" Node Visited : " + root.getData());
        } else {
            inOrderTraverse(root);
        }
    }

    private void inOrderTraverse(Node node) {
        if (node.getLeftChild() != null) {
            inOrderTraverse(node.getLeftChild());
        }
        System.out.println(" Node Visited : " + node.getData());
        if (node.getRightChild() != null) {
            inOrderTraverse(node.getRightChild());
        }
    }

    public void preOrderTraverse() {
        if (root == null) {
            System.out.println("Root is null");
        } else if (root != null && root.getLeftChild() == null && root.getRightChild() == null) {
            System.out.println(" Node Visited : " + root.getData());
        } else {
            preOrderTraverse(root);
        }
    }

    private void preOrderTraverse(Node node) {
        System.out.println(" Node Visited : " + node.getData());
        if (node.getLeftChild() != null) {
            preOrderTraverse(node.getLeftChild());
        }

        if (node.getRightChild() != null) {
            preOrderTraverse(node.getRightChild());
        }
    }
    
    public void postOrderTraverse() {
        if (root == null) {
            System.out.println("Root is null");
        } else if (root != null && root.getLeftChild() == null && root.getRightChild() == null) {
            System.out.println(" Node Visited : " + root.getData());
        } else {
            postOrderTraverse(root);
        }
    }

    private void postOrderTraverse(Node node) {
        if (node.getLeftChild() != null) {
            postOrderTraverse(node.getLeftChild());
        }
        if (node.getRightChild() != null) {
            postOrderTraverse(node.getRightChild());
        }
        System.out.println(" Node Visited : " + node.getData());
    }

    private void traverseAndAddNode(Node node, Node nodeToAdd) {
        if (nodeToAdd.getData() < node.getData()) {
            if (node.getLeftChild() == null) {
                node.setLeftChild(nodeToAdd);
            } else {
                traverseAndAddNode(node.getLeftChild(), nodeToAdd);
            }
        } else {
            if (node.getRightChild() == null) {
                node.setRightChild(nodeToAdd);
            } else {
                traverseAndAddNode(node.getRightChild(), nodeToAdd);
            }
        }
    }
}

@Data
class Node {
    @NonNull
    private int data;

    private Node leftChild;
    private Node rightChild;
}
