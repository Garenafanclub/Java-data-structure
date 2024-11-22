package com.TreeQ;

public class BST {
    private Node root;
    public class Node {
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }
    }
    public BST() {}

    public void insertNode(int value)
    {
        root = insertNode(root , value);
    }
    public Node insertNode(Node node , int value)
    {
        if(node == null)
        {
            node = new Node(value);
            return node;
        }

        if(value < node.value)
        {
            node.left = insertNode(node.left , value);
        }
        if(value > node.value)
        {
            node.right = insertNode(node.right , value);
        }
        return node;
    }
    public void display()
    {
        display(this.root , "Root Node: ");
    }
    public void display(Node node , String details)
    {
        if(node == null)
        {
            return;
        }
        System.out.println(details + node.value);
        display(node.left , "Left child of " + node.value + ": ");
        display(node.right , "Right child of " + node.value + ": ");
    }

    public void populate(int[] nums)
    {
        for (int num : nums) {
            this.insertNode(num);
        }
    }

    public void populateSorted(int[] nums)
    {
        populateSorted(nums , 0 , nums.length-1);
    }
    public void populateSorted(int[] nums , int start , int end)
    {
        if(start>end)
        {
            return;
        }
        int mid = start + (end - start)/2;
        this.insertNode(nums[mid]);
        populateSorted(nums , start , mid-1);
        populateSorted(nums , mid+1 , end);
    }
    public int min_Value() {
        Node temp = root;
        while (temp.left != null) {
            temp = temp.left;
        }
        return temp.value;
    }

    public int Max_Value()
    {
        Node temp = root;
        while(temp.right != null)
        {
            temp = temp.right;
        }
        return temp.value;
    }

    public void pre_Order()
    {
        pre_Order(root);
    }
    private void pre_Order(Node node)
    {
        if(node == null){
            return;
        }
        System.out.print(node.value + " ");
        pre_Order(node.left);
        pre_Order(node.right);
    }
    public void in_Order()
    {
        in_Order(root);
    }
    private void in_Order(Node node)
    {
        if(node == null){
            return;
        }
        in_Order(node.left);
        System.out.print(node.value + " ");
        in_Order(node.right);
    }

    public void post_Order()
    {
        post_Order(root);
    }
    private void post_Order(Node node)
    {
        if(node == null){
            return;
        }
        post_Order(node.left);
        post_Order(node.right);
        System.out.print(node.value + " ");
    }
}
