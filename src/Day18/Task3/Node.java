package Day18.Task3;

import java.util.ArrayList;
import java.util.List;

public class Node {
    int value;
    Node left;
    Node right;

    public Node(int value, Node left, Node right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public Node(int value) {
        this.value = value;

    }

    public static void addTree(int i, Node node) {
        Node next = node;
        Node current = null;

        while (next != null) {
            current = next;
            if (i < current.value) {
                next = current.left;
            } else {
                next = current.right;
            }
        }

        if (i < current.value) {
            current.left = new Node(i);
        } else {
            current.right = new Node(i);
        }
    }

    public static void dfs(Node node) {
        if(node==null){
            return;
        }

        dfs(node.left);
        System.out.print(node.value+" ");
        dfs(node.right);
    }
}
