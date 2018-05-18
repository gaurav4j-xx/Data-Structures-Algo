package trees.model;

import lombok.Data;
import lombok.NonNull;

@Data
public class Node {
    @NonNull
    private int data;

    private Node leftChild;
    private Node rightChild;
}
