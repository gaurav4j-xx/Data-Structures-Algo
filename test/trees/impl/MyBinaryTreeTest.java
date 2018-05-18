package trees.impl;

import org.junit.Test;
import trees.model.Node;

public class MyBinaryTreeTest {

    @Test
    public void addNodeAndInOrderTraversal_Example1() {
        MyBinaryTree myBinaryTree = new MyBinaryTree();

        myBinaryTree.addNode(new Node(50));
        myBinaryTree.addNode(new Node(10));
        myBinaryTree.addNode(new Node(30));
        myBinaryTree.addNode(new Node(40));
        myBinaryTree.addNode(new Node(20));

        myBinaryTree.inOrderTraverse();

    }

    @Test
    public void addNodeAndInOrderTraversal_Example2() {
        MyBinaryTree myBinaryTree = new MyBinaryTree();

        myBinaryTree.addNode(new Node(500));
        myBinaryTree.addNode(new Node(160));
        myBinaryTree.addNode(new Node(350));
        myBinaryTree.addNode(new Node(460));
        myBinaryTree.addNode(new Node(770));
        myBinaryTree.addNode(new Node(890));
        myBinaryTree.addNode(new Node(430));
        myBinaryTree.addNode(new Node(10));
        myBinaryTree.addNode(new Node(755));
        myBinaryTree.addNode(new Node(420));

        myBinaryTree.inOrderTraverse();
    }

    @Test
    public void emptyTreeTraversal() {
        MyBinaryTree myBinaryTree = new MyBinaryTree();
        myBinaryTree.inOrderTraverse();
        myBinaryTree.preOrderTraverse();
        myBinaryTree.postOrderTraverse();
    }

    @Test
    public void onlyRootNode() {
        MyBinaryTree myBinaryTree = new MyBinaryTree();
        myBinaryTree.addNode(new Node(1));
        myBinaryTree.inOrderTraverse();
        myBinaryTree.preOrderTraverse();
        myBinaryTree.postOrderTraverse();
    }

    @Test
    public void addNodeAndPreOrderTraversal_Example2() {
        MyBinaryTree myBinaryTree = new MyBinaryTree();

        myBinaryTree.addNode(new Node(500));
        myBinaryTree.addNode(new Node(160));
        myBinaryTree.addNode(new Node(350));
        myBinaryTree.addNode(new Node(460));
        myBinaryTree.addNode(new Node(770));
        myBinaryTree.addNode(new Node(890));
        myBinaryTree.addNode(new Node(430));
        myBinaryTree.addNode(new Node(10));
        myBinaryTree.addNode(new Node(755));
        myBinaryTree.addNode(new Node(420));


        myBinaryTree.preOrderTraverse();
    }

    @Test
    public void addNodeAndPostOrderTraversal_Example2() {
        MyBinaryTree myBinaryTree = new MyBinaryTree();

        Node node460 = new Node(460);
        Node node1000 = new Node(1000);

        myBinaryTree.addNode(new Node(500));
        myBinaryTree.addNode(new Node(160));
        myBinaryTree.addNode(new Node(350));
        myBinaryTree.addNode(node460);
        myBinaryTree.addNode(new Node(770));
        myBinaryTree.addNode(new Node(890));
        myBinaryTree.addNode(new Node(430));
        myBinaryTree.addNode(new Node(10));
        myBinaryTree.addNode(new Node(755));
        myBinaryTree.addNode(new Node(420));


        myBinaryTree.postOrderTraverse();
        Node nodeFound = myBinaryTree.find(node460);

        if (nodeFound == null) {
            System.out.println("Node :" + node460.getData() + " not found in the tree");
        } else {
            System.out.println("Node :" + node460.getData() + " found in the tree");
        }

        Node node1000Test = myBinaryTree.find(node1000);
        if (node1000Test == null) {
            System.out.println("Node :" + node1000.getData() + " not found in the tree");
        } else {
            System.out.println("Node :" + node1000.getData() + " found in the tree");
        }
    }
}