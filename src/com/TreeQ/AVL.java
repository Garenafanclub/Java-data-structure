package com.TreeQ;

public class AVL {
    private Node root;

    public AVL(){}

    public int height()
    {
        return height(root);
    }

    public int height(Node root)
    {
        if(root == null) return -1;
        return root.height;
    }
    public void insert(int value)
    {
        root = insert(root , value);
    }
    private Node insert(Node root, int insert_value) {
        if (root == null) {
            return new Node(insert_value);
        }

        if (insert_value < root.value) {
            root.left = insert(root.left, insert_value);
        } else if (insert_value > root.value) {
            root.right = insert(root.right, insert_value);
        } else {
            // Duplicate values are not allowed
            return root;
        }

        root.height = 1 + Math.max(height(root.left), height(root.right));
        System.out.println("Inserted " + insert_value + ", Node " + root.value + " height: " + root.height);
        return rotate(root);
    }


    private Node rotate(Node root) {
        int balanceFactor = height(root.left) - height(root.right);

        // Left heavy
        if (balanceFactor > 1) {
            if (height(root.left.left) >= height(root.left.right)) {
                return rightRotate(root);
            } else {
                root.left = leftRotation(root.left);
                return rightRotate(root);
            }
        }

        // Right heavy
        if (balanceFactor < -1) {
            if (height(root.right.right) >= height(root.right.left)) {
                return leftRotation(root);
            } else {
                root.right = rightRotate(root.right);
                return leftRotation(root);
            }
        }

        return root;
    }


    public Node rightRotate(Node p) {
        Node c = p.left;
        Node t = c.right;

        c.right = p;
        p.left = t;

        p.height = Math.max(height(p.left), height(p.right)) + 1;
        c.height = Math.max(height(c.left), height(c.right)) + 1;

        return c;
    }

    public Node leftRotation(Node c) {
        Node p = c.right;
        Node t = p.left;

        p.left = c;
        c.right = t;

        p.height = Math.max(height(p.left), height(p.right)) + 1;
        c.height = Math.max(height(c.left), height(c.right)) + 1;

        return p;
    }


    public void display()
    {
        display(root , "Root Node: ");
    }

    public void display(Node root , String str)
    {
        if(root == null)
        {
            return;
        }
        System.out.println(str + root.value);
        display(root.left , "Left child of " + root.value + ": ");
        display(root.right , "Right child of: " + root.value + ": ");
    }

    public void populate(int[] nums)
    {
        for(int i = 0;i< nums.length;i++)
        {
            this.insert(nums[i]);
        }
    }
}
