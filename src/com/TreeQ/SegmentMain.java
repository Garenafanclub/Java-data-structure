package com.TreeQ;

public class SegmentMain {
    public static void main(String[] args) {

        int[] arr = {3,8,7,6,-2,-8,4,9};
        SegmentTrees obj = new SegmentTrees();
        obj.insertNode(arr);
        obj.display();
        System.out.println();
        obj.Updation(20,5);
        obj.display();
        System.out.println(obj.Query(2,3));
    }
}
