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
        MyBinaryTree myBinaryTree2 = new MyBinaryTree();

        myBinaryTree2.addNode(500);
        myBinaryTree2.addNode(100);
        myBinaryTree2.addNode(30);
        myBinaryTree2.addNode(40);
        myBinaryTree2.addNode(50);
        myBinaryTree2.addNode(250);
        myBinaryTree2.addNode(300);
        myBinaryTree2.addNode(1);
        myBinaryTree2.addNode(210);

        myBinaryTree2.inOrderTraverse();
    }
}