package trees.api;

import trees.model.Node;

public interface Tree {
    /**
     * This method adds the provided node in the BST.
     * @param node
     */
    void addNode(Node node);

    /**
     * This method finds the provided node in the BST.
     * Returns node if found, null otherwise.
     * @param node
     */
    Node find(Node node);

    /**
     * This method deletes the passed node from the tree.
     * Returns true if node was found and deleted,
     * false otherwise.
     * @param node
     * @return
     */
    boolean deleteNode(Node node);

    /**
     * In order traverse the tree.
     */
    void inOrderTraverse();

    /**
     * Pre order traverse the tree.
     */
    void preOrderTraverse();

    /**
     * Post order traverse the tree.
     */
    void postOrderTraverse();
}
