package trees;

import org.junit.Test;

public class MyBinaryTreeTest {

    @Test
    public void addNodeAndInOrderTraversal_Example1() {
        MyBinaryTree myBinaryTree = new MyBinaryTree();

        myBinaryTree.addNode(50);
        myBinaryTree.addNode(10);
        myBinaryTree.addNode(30);
        myBinaryTree.addNode(40);
        myBinaryTree.addNode(20);

        myBinaryTree.inOrderTraverse();

    }

    @Test
    public void addNodeAndInOrderTraversal_Example2() {
        MyBinaryTree myBinaryTree = new MyBinaryTree();

        myBinaryTree.addNode(500);
        myBinaryTree.addNode(100);
        myBinaryTree.addNode(30);
        myBinaryTree.addNode(40);
        myBinaryTree.addNode(50);
        myBinaryTree.addNode(250);
        myBinaryTree.addNode(300);
        myBinaryTree.addNode(1);
        myBinaryTree.addNode(210);

        myBinaryTree.inOrderTraverse();
    }

    @Test
    public void emptyTreeTraversal() {
        MyBinaryTree myBinaryTree = new MyBinaryTree();
        myBinaryTree.inOrderTraverse();

    }

    @Test
    public void onlyRootNode() {
        MyBinaryTree myBinaryTree = new MyBinaryTree();
        myBinaryTree.addNode(1);
        myBinaryTree.inOrderTraverse();
    }
}