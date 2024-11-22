package com.StackQueue;

public class CustomStack {
    protected int[] data;
    public static final int DEFAULT_SIZE = 10;
    int ptr = -1;

    public CustomStack() {
        this(DEFAULT_SIZE);
    }
    public CustomStack(int size)
    {
        this.data = new int[size];
    }

    public boolean push(int value) throws Exception
    {
        if(this.isFull())
        {
            throw new Exception("Stack is full!!");
        }
        ptr++;
        data[ptr] = value;
        return true;
    }

    private boolean isFull() {
        return ptr == data.length-1;
    }

    public int pop() throws Exception
    {
        if(isEmpty())
        {
            throw new Exception("Stack is already Empty...");
        }
        int temp = data[ptr];
        ptr--;
        return temp;   // return data[ptr--]
    }

    public boolean isEmpty() {
        return ptr == -1;
    }

    public int peek() throws Exception
    {
        if(isEmpty())
        {
            throw new Exception("Stack is already Empty...");
        }
        return data[ptr];
    }

    public static void main(String[] args) throws Exception {
        CustomStack stack = new DynamicStack(5);
        stack.push(5);
        stack.push(4);
        stack.push(2);
        stack.push(10);
        stack.push(11);
        stack.push(12);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
    }
}
