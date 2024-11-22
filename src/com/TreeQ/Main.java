package com.TreeQ;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        BST obj = new BST();
        int[] nums = {15, 10, 20, 7, 11};
      //Arrays.sort(nums);
        obj.populate(nums);
        obj.display();
      //obj.populateSorted(nums);
      //obj.display();
        System.out.println(obj.min_Value());
        System.out.println(obj.Max_Value());
        obj.pre_Order();
        System.out.println();
        obj.in_Order();
        System.out.println();
        obj.post_Order();
    }
}
