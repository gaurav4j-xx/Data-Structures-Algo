package trees.impl;

import trees.api.Tree;
import trees.model.Node;

public class MyBinaryTree implements Tree {
    private Node root;

    public void addNode(Node nodeToAdd) {
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

    /**
     * This method finds the provided node in the BST.
     * Returns node if found, null otherwise.
     *
     * @param node
     */
    @Override
    public Node find(Node node) {
        if (root != null && node != null) {
            return findNode(root, node);
        }
        return null;
    }

    private Node findNode(Node search, Node nodeToSearch) {
        if (search != null && nodeToSearch != null) {
            if (search.getData() == nodeToSearch.getData()) {
                return search;
            } else if (nodeToSearch.getData() < search.getData()) {
                return findNode(search.getLeftChild(), nodeToSearch);
            } else {
                return findNode(search.getRightChild(), nodeToSearch);
            }
        }
        return null;
    }

    /**
     * This method deletes the passed node from the tree.
     * Returns true if node was found and deleted,
     * false otherwise.
     *
     * @param node
     * @return
     */
    @Override
    public boolean deleteNode(Node node) {
        return false;
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

