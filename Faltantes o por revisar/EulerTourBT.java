// Java program to find euler tour of binary tree 

import java.util.*;

public class EulerTourBT {

    /* A tree node structure */
    static class Node {

        int data;
        Node left;
        Node right;
    };

    /* Utility function to create a new Binary Tree node */
    static Node newNode(int data) {
        Node temp = new Node();
        temp.data = data;
        temp.left = temp.right = null;
        return temp;
    }

    // Find Euler Tour 
    static Vector<Integer> eulerTree(Node root, Vector<Integer> Euler) {
        // store current node's data 
        Euler.add(root.data);

        // If left node exists 
        if (root.left != null) {
            // traverse left subtree 
            Euler = eulerTree(root.left, Euler);

            // store parent node's data 
            Euler.add(root.data);
        }

        // If right node exists 
        if (root.right != null) {
            // traverse right subtree 
            Euler = eulerTree(root.right, Euler);

            // store parent node's data 
            Euler.add(root.data);
        }
        return Euler;
    }

    // Function to print Euler Tour of tree 
    static void printEulerTour(Node root) {
        // Stores Euler Tour 
        Vector<Integer> Euler = new Vector<Integer>();

        Euler = eulerTree(root, Euler);

        for (int i = 0; i < Euler.size(); i++) {
            System.out.print(Euler.get(i) + " ");
        }
    }

    /* Driver function to test above functions */
    public static void main(String[] args) {
        // Constructing tree given in the above figure 
        Node root = newNode(1);
        root.left = newNode(2);
        root.right = newNode(3);
        root.left.left = newNode(4);
        root.left.right = newNode(5);
        root.right.left = newNode(6);
        root.right.right = newNode(7);
        root.right.left.right = newNode(8);

        // print Euler Tour 
        printEulerTour(root);

    }
}
