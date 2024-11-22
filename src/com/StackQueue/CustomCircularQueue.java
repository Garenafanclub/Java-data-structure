package com.StackQueue;

public class CustomCircularQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    int end = 0;
    int front = 0;
    int size = 0;

    CustomCircularQueue()
    {
        this(DEFAULT_SIZE);
    }
    CustomCircularQueue(int size)
    {
        this.data = new int[size];
    }

    public boolean isFull()
    {
        return size == data.length;
    }
    public boolean isEmpty()
    {
        return size == 0;
    }

    public boolean enqueue(int value) throws Exception
    {
        if(isFull())
        {
            throw new Exception("Enqueue operation can't be done as queue is full!!");
        }
        data[end++] = value;
        size++;
        if(end == data.length)  end = end % data.length;  // circular nature of queue....
       return true;
    }

    public int dequeue() throws Exception
    {
       if(isEmpty())
       {
           throw new Exception("Can't perform remove operation as queue is already empty!!");
       }
       int value = data[front];
       front++;
       front = front % data.length;
       size--;
       return value;
    }

    public int front() throws Exception
    {
        if(isEmpty())
        {
            throw new Exception("Can't perform Front operation as queue is already empty!!");
        }
        return data[front];
    }

    public void display()
    {
        if(isEmpty())
        {
            System.out.println("IS Empty...");
        }
        int i = front;
        do{
            System.out.print(data[i] + "->");
            i = (i+1) % data.length;
        }while(i != end);
        System.out.println("END");
    }

    public static void main(String[] args) throws Exception {
        CustomCircularQueue customCircularQueue = new CustomCircularQueue(5);
        customCircularQueue.enqueue(5);
        customCircularQueue.enqueue(15);
        customCircularQueue.enqueue(2);
        customCircularQueue.enqueue(10);
        customCircularQueue.enqueue(13);

        customCircularQueue.display();

        System.out.println(customCircularQueue.dequeue());

        customCircularQueue.display();
        customCircularQueue.enqueue(12);
        customCircularQueue.display();
    }
}
