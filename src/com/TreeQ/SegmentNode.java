package com.TreeQ;

public class SegmentNode {
    public int data;
    SegmentNode left;
    SegmentNode right;
    int LeftInterval;
    int RightInterval;

    public SegmentNode(int LeftInterval , int RightInterval)
    {
        this.LeftInterval = LeftInterval;
        this.RightInterval = RightInterval;
    }

}
