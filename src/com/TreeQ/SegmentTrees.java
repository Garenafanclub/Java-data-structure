package com.TreeQ;

public class SegmentTrees {

    SegmentNode root;
    public void insertNode(int[] arr)
    {
       root = insertNode(arr , 0, arr.length-1);
    }

    private SegmentNode insertNode(int[] arr, int leftIdx, int rightIdx) {

        if(leftIdx == rightIdx)
        {
            SegmentNode leaf = new SegmentNode(leftIdx,rightIdx);
            leaf.data = arr[leftIdx];
            return leaf;
        }

        // create a new node with current index you are at...
        SegmentNode node = new SegmentNode(leftIdx , rightIdx);

        int mid = leftIdx + (rightIdx - leftIdx)/2;
        node.left = insertNode(arr,leftIdx,mid);
        node.right = insertNode(arr,mid+1,rightIdx);

        node.data = node.left.data + node.right.data;
        return node;
    }

    public void display()
    {
        display(this.root);
    }

    private void display(SegmentNode node) {
        String str = "";

        if(node.left != null) {
            str = str + "Interval=[" + node.left.LeftInterval + "-" + node.left.RightInterval + "] and data: " + node.left.data + " => ";
        } else {
            str = str + "No left child ";
        }

        // for current node
        str = str + "Interval=[" + node.LeftInterval + "-" + node.RightInterval + "] and data: " + node.data;

        if(node.right != null) {
            str = str +  " <== " + "Interval=[" + node.right.LeftInterval + "-" + node.right.RightInterval + "] and data: " + node.right.data;
        } else {
            str = str + " No right child";
        }

        System.out.println(str);

        // call recursion
        if(node.left != null) {
            display(node.left);
        }

        if(node.right != null) {
            display(node.right);
        }
    }


    public void Updation(int value , int Index)
    {
        this.root.data = Updation(root , value , Index);
    }

    public int Updation(SegmentNode root , int value , int Index)
    {
        // BASE CASE: IF THE CURRENT NODE IS LEAF NODE..
       if(root.LeftInterval == root.RightInterval)
       {
           root.data = value;
           return root.data;
       }

       int mid = root.LeftInterval + (root.RightInterval - root.LeftInterval)/2;
       if(Index <= mid)
       {
           Updation(root.left , value , Index);
       }
       else{
           Updation(root.right,value,Index);
       }
       root.data = root.left.data + root.right.data;
       return root.data;
    }

    public int Query(int qsi , int qei)
    {
        return this.Query(this.root , qsi , qei);
    }
    public int Query(SegmentNode root , int qsi , int qei)
    {
        // a segment tree node completely lie within range of query
        if(root.LeftInterval >= qsi && root.RightInterval <= qei)
        {
            return root.data;
        }
        // if not lie...
        if(root.LeftInterval > qei || root.RightInterval < qsi)
        {
            return 0;
        }

        // If overlapping partially....
        return Query(root.left , qsi , qei) + Query(root.right , qsi , qei);
    }

}
