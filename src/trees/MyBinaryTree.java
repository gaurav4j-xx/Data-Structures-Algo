package trees;

import lombok.Data;
import lombok.NonNull;

import java.util.Collections;
import java.util.List;

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

    public void traverse() {
        if (root == null) {
            System.out.println("Root is null");
        } else if (root != null && root.getLeftChild() == null && root.getRightChild() == null) {
            System.out.println(" Node Visited : " + root.getData());
        } else {
            if (root.getLeftChild() != null) {
                traverse(root.getLeftChild());
            }
            if (root.getRightChild() != null) {
                traverse(root.getRightChild());
            }
            System.out.println(" Node Visited : " + root.getData());
        }
    }

    private void traverse(Node node) {
        if (node.getLeftChild() != null) {
            traverse(node.getLeftChild());
        }
        System.out.println(" Node Visited : " + node.getData());
        if (node.getRightChild() != null) {
            traverse(node.getRightChild());
        }
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
