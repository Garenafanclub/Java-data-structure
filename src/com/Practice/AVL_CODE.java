package com.Practice;

public class AVL_CODE {
    public class Node{
        int data;
        Node left;
        Node right;
        int height;

        Node(int data)
        {
            this.data = data;
            this.left = null;
            this.right = null;
            this.height = 0;
        }
    }
    private Node root;
    AVL_CODE() {}

    public int height()
    {
        return height(root);
    }
    public int height(Node node)
    {
        if(node == null) return -1;
        return node.height;
    }
    public void insert_Node(int value)
    {
        root = insert_Node(root , value);
    }

    public Node insert_Node(Node node , int value)
    {
        if(node == null)
        {
            return new Node(value);
        }

        if(node.data > value)
        {
            node.left = insert_Node(node.left , value);
        } else if (node.data < value) {
            node.right = insert_Node(node.right , value);
        }else {
            return node;   // DUPLICATE VALUES ARE NOT ALLOWED...
        }
        node.height = 1 + Math.max(height(node.left) , height(node.right));
        return rotate(node);
    }

    private Node rotate(Node node) {
        int BalanceFactor = height(node.left) - height(node.right);

        // LEFT HEAVY...
        if(BalanceFactor > 1) {
            if (height(node.left.left) < height(node.left.right)) {
                node.left = leftRotate(node.left);
            }
            return rightRotate(node);
        }
        // RIGHT HEAVY...
        else if (BalanceFactor < -1) {
            if(height(node.right.left) > height(node.right.right))
            {
                node.right = rightRotate(node.right);
            }
            return leftRotate(node);
        }
        return node;
    }

    private Node leftRotate(Node c) {
       Node p = c.right;
       Node t = p.left;

        p.left = c;
        c.right = t;

        p.height = Math.max(height(p.left), height(p.right)) + 1;
        c.height = Math.max(height(c.left), height(c.right)) + 1;

        return p;
    }

    private Node rightRotate(Node node) {
        Node c = node.left;
        Node t = c.right;

        c.right = node;
        node.left = t;

        node.height = Math.max(height(node.left), height(node.right)) + 1;
        c.height = Math.max(height(node.left), height(node.right)) +1;
        return c;
    }

    public void display()
    {
        display(root , "Root node: ");
    }
    public void display(Node root , String str)
    {
        if(root == null)
        {
            return;
        }
        System.out.println(str + root.data);
        display(root.left , "Left child of " + root.data + ": ");
        display(root.right , "Right child of: " + root.data + ": ");
    }

    public void populateSorted(int[] arr) {
        populateSorted(arr , 0 , arr.length-1);
    }

    public void populateSorted(int[] arr , int start , int end)
    {
        // BASE CASE
        if(start > end){return;}
        int mid = start + (end - start)/2;
        this.insert_Node(arr[mid]);
        populateSorted(arr , start , mid -1);
        populateSorted(arr , mid + 1 , end);
    }


    public static void main(String[] args)
    {
        AVL_CODE avl = new AVL_CODE();
        System.out.println(avl.height());
//        avl.insert_Node(7);
//        avl.insert_Node(6);
//        avl.insert_Node(3);
//        avl.insert_Node(2);
//        avl.insert_Node(4);
//        avl.insert_Node(9);
         int[] arr = {1,2,3,4,5,6,7,8,9};
//         avl.populateSorted(arr);
        for(int nums : arr)
        {
            avl.insert_Node(nums);
        }
        avl.display();
        System.out.println(avl.height());
    }
}
