package com.TreeQ;

public class BST_Again {
    private Node root;
    public BST_Again(){}

    public void insert(int value)
    {
        root = insert(root , value);
    }
    public Node insert(Node node , int value)
    {
       if(node == null)
       {
           node = new Node(value);
           return node;
       }
       if(value < node.value)
       {
           node.left = insert(node.left , value);
       }
       if(value> node.value)
       {
           node.right = insert(node.right, value);
       }
       return node;
    }

    public void display()
    {
        display(root,"Root node: ");
    }
    public void display(Node root , String details)
    {
        if(root == null)
        {
            return;
        }
        System.out.println(details + root.value);
        display(root.left , "Left child of " + root.value + ": ");
        display(root.right , "Right child of " + root.value + ": ");
    }

    public int min_Value(Node node)
    {
        Node temp = node;
        while(temp.left != null)
        {
            temp = temp.left;
        }
        return temp.value;
    }

    public int max_Value()
    {
        Node temp = root;
        while(temp.right != null)
        {
            temp = temp.right;
        }
        return temp.value;
    }
    public void pre_Order()  // SIMILAR AS POST ORDER AND INORDER...
    {
        pre_Order(root);
    }
    private void pre_Order(Node root)
    {
        if(root == null)
        {
            return;
        }
        System.out.print(root.value + " ");
        pre_Order(root.left);
        pre_Order(root.right);
    }

    public void delete(int val)
    {
        root = deleteFromBST(root,val);
    }

   public Node deleteFromBST(Node root , int val)
   {
       //BASE CASE..
       if(root == null) return null;

       if(root.value == val)
       {
           // 0 CHILD
           if(root.left == null && root.right == null)
           {
               return null;
           }

           // 1 CHILD.
           // Right child is present.
           if(root.left == null)
           {
               return root.right;
           }

           // Left child is present.
           if(root.right == null)
           {
               return root.left;
           }

           // 2 CHILD
           // Left se maximum value nikal lo ya right se minimum value nikal lo
           int mini = min_Value(root.right);
           root.value = mini;
           root.right = deleteFromBST(root.right,mini);

       } else if (root.value > val) {
           root.left = deleteFromBST(root.left , val);
           return root;
       }
       else {
           root.right = deleteFromBST(root.right,val);
           return root;
       }
       return root;
   }
}
