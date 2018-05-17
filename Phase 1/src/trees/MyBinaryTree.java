package trees;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

public class MyBinaryTree {
    public static void main(String args[]) {

    }
}

class BinaryTree {
    Node root;

    public void addNode(Node node) {
        // If root node is not present, make the current node as root
        if (root == null) {
            root = node;
            return;
        }
        // Else
        Node temp = root;
        while (true) {
            // Left Child
            if (root.nodeData > node.nodeData) {

            } else { // Right Child

            }
        }
    }
}

@Data
@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
class Node {
    @NonNull
    int nodeData;

    Node leftChild;
    Node rightChild;


}
