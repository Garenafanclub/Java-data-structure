package com.Practice;

import java.util.Arrays;
import java.util.Scanner;

public class BST_CODE {

    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data)
        {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    private Node root;

    BST_CODE() {}

    public void insert(int value)
    {
        this.root = insert(root , value);
    }

    public Node insert(Node root , int value)
    {
        // BASE CASE...
        if(root == null)
        {
            return new Node(value);
        }

        if(root.data > value) {
            root.left = insert(root.left , value);
        }
        else if(root.data < value) {
            root.right = insert(root.right, value);
        }
        return root;
    }

    public void populateSort(int[] arr)
    {
        populateSort(arr, 0, arr.length-1);
    }

    // WANT TO INSERT TREE NODES IN LESS COMPLEXITY WAY IF WE HAVE SORTED ARRAY...
    public void populateSort(int[] arr , int start , int end)
    {
        // BASE CONDITION...
        if(start>end) return;
            int mid = start + (end-start)/2;
            this.insert(arr[mid]);
            populateSort(arr,start,mid-1);
            populateSort(arr,mid+1,end);
    }

    public void display()
    {
         this.display(root,"Root element: ");
    }
    public void display(Node root, String str)
    {
        if(root == null) return;
        System.out.println(str + root.data);
        display(root.left , "Left child of " + root.data + ": ");
        display(root.right , "Right child of " + root.data + ": ");
    }

    public int Max_Node_DATA()
    {
        if(root == null) throw new IllegalStateException("Tree is empty");
        Node temp = root;
        while(temp.right != null)
        {
            temp = temp.right;
        }
        return temp.data;
    }

    public void in_Order()
    {
         in_Order(root);
    }
    public void in_Order(Node node)
    {
        // BASE CONDITION...
        if(node == null) return;

        in_Order(node.left);
        System.out.print(" " + node.data + " ");
        in_Order(node.right);
    }
    public void post_Order()
    {
        post_Order(root);
    }
    public void post_Order(Node node)
    {
        if(node == null) return;
        post_Order(node.left);
        post_Order(node.right);
        System.out.print(" " + node.data + " ");
    }

    public int Min_Node_Data(Node node)
    {
        Node temp = node;
        while(temp.left != null)
        {
            temp = temp.left;
        }
        return temp.data;
    }
    public void delete_node(int value)
    {
       root = delete_node(root,value);
    }

    public Node delete_node(Node root , int value)
    {
        if(root == null) return null;

        if(root.data == value)
        {
            // 0 CHILD CASE... MEANS THAT NODE YOU WANT TO DELETE HAVE NO CHILD...
            if(root.left == null && root.right == null)
            {
                return null;
            }

            // 1 CHILD CASE...
            // LEFT CHILD CASE...
            if(root.right == null)
            {
                return root.left;
            }

            // RIGHT CHILD CASE...
            if(root.left == null)
            {
                return root.right;
            }

            // 2 CHILD CASE...
            // YOU HAVE 2 OPTION FIRST YOU CAN TAKE OUT THE MAXIMUM VALUE FROM LEFT OR YOU CAN TAKE OUT MINIMUM VALUE FROM RIGHT...
//            int maxi = Max_Node_DATA(root.left);
//            root.data = maxi;
//            root.left = delete_node(root.left , maxi);
            int mini = Min_Node_Data(root.right);
            root.data = mini;
            root.right = delete_node(root.right , mini);
        }
        else if (root.data > value) {
            root.left = delete_node(root.left , value);
            return root;
        }
        else {
            root.right = delete_node(root.right , value);
            return root;
        }
        return root;
    }

    public static void main(String[] args)
    {
        BST_CODE tree = new BST_CODE();
        Scanner cin = new Scanner(System.in);
//        tree.insert(12);
//        tree.insert(13);
//        tree.insert(10);
//        tree.insert(14);
//        tree.insert(16);
        int[] arr = {1,2,3,4,5,6,7,8,9};
//        for(int i = 0;i<arr.length;i++)
//        {
//            tree.insert(arr[i]);
//        }
        Arrays.sort(arr);
        tree.populateSort(arr);
        tree.display();
        System.out.println("Maximum Node data: " + tree.Max_Node_DATA());
        System.out.print("IN_ORDER TRAVERSAL: ");
        System.out.print("[");
        tree.in_Order();
        System.out.print("]" + "\n");

        System.out.print("POST_ORDER TRAVERSAL: ");
        System.out.print("[");
        tree.post_Order();
        System.out.print("]");

        tree.delete_node(7);
        System.out.println();
        tree.display();
    }
}
