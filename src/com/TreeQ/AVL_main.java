package com.TreeQ;

public class AVL_main {
    public static void main(String[] args)
    {
        AVL tree = new AVL();
/*
        tree.insert(10);
        tree.insert(15);
        tree.insert(9);
*/
        int[] nums = {10,11,12,13,14,15,16};      //{11,10,15,13,3,1,12};
        tree.populate(nums);
        tree.display();
        System.out.println(tree.height());


//        for(int i=0; i < 1000; i++) {
//            tree.insert(i);
//        }
//
//        System.out.println(tree.height());
    }
}
