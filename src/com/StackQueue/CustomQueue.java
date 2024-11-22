package com.StackQueue;

public class CustomQueue {
    private int[] data;
    private static final int DEFAULT_SIZE = 10;

    int end = 0;
    CustomQueue()
    {
        this(DEFAULT_SIZE);
    }
    CustomQueue(int size)
    {
        this.data = new int[size];
    }

    public boolean isFull()
    {
        return end == data.length;
    }
    public boolean isEmpty()
    {
        return end == 0;
    }

   public boolean insert(int value) throws Exception
   {
       if(isFull())
       {
           throw new Exception("Queue is full!!");
       }
       data[end] = value;
       end++;
       return true;
   }

   public int remove() throws Exception
   {
       if(isEmpty())
       {
           throw new Exception("already empty can't perform remove operation..");
       }
       int remove = data[0];
       for(int i = 1;i<end;i++)
       {
           data[i-1] = data[i];
       }
       end--;
       return remove;
   }
   public void display()
   {
       for(int i = 0;i<end;i++)
       {
           System.out.print(data[i] + "<-");
       }
       System.out.println("END");
   }

    public static void main(String[] args) throws Exception {
        CustomQueue queue = new CustomQueue(5);
        queue.insert(5);
        queue.insert(6);
        queue.insert(10);
        queue.insert(15);
        queue.insert(2);
       // queue.insert(3);
        queue.display();
        System.out.println(queue.remove());
        queue.display();
    }

}
