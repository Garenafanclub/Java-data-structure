package com.LinkedListQ;
public class SinglyLLPrac {
    private Node head;
    private Node tail;
    public int size;
    SinglyLLPrac(){ this.size = 0; }
    private class Node
    {
       private int data;
       private Node next;

       Node(int data)
       {
           this.data = data;
           //this.next = null;
       }
       Node(int data , Node next)
       {
           this.data = data;
           this.next = next;
       }
    }
    public void insertAtHead(int val)
    {
        Node node = new Node(val);
        node.next = head;
        head = node;
        if(tail == null)
        {
            tail = head;
        }
        size+= 1;
    }
    public void insertAtTail(int val)
    {
        Node node = new Node(val);
        if(tail == null)
        {
            insertAtHead(val);
            return;
        }
        tail.next = node;
        tail = node;
        size += 1;
    }
    public void insertATAnyPos(int index , int val)
    {
        if(index == 0)
        {
            insertAtHead(val);
            return;
        }
        if(index == size)
        {
            insertAtTail(val);
            return;
        }
        Node temp = head;
        int count = 1;
        while(count<index)
        {
            temp = temp.next;
            count++;
        }
        Node node = new Node(val);
        node.next = temp.next;
        temp.next = node;
        size+= 1;
    }
    public int deleteNodeAtHead()
    {
//        Node temp = head;
//        head = head.next;
//        temp.next = null;
//        size--;
        int val = head.data;
        head = head.next;
        if(tail == null)
        {
            tail = head;
        }
        size--;
        return val;
    }
    public int deleteNodeATTail()
    {
//        Node temp = head;
//        while(temp.next != tail)
//        {
//            temp = temp.next;
//        }
//        tail = temp.next;
//        temp.next = null;
//        size--;
        Node secondLast = getIndex(size - 2);
        int val = tail.data;
        tail = secondLast;
        secondLast.next = null;
        size--;
        return val;
    }
    public Node getIndex(int index)
    {
        Node temp = head;
        for(int i = 0;i<index;i++)
        {
            temp = temp.next;
        }
        return temp;
    }
    public int deleteAtAnyPos(int position)
    {
         if(position == 1)
         {
             return deleteNodeAtHead();
         }
         if(position == size)
         {
            return deleteNodeATTail();
         }
         Node previous = getIndex(position-2);
         int val = previous.next.data;
         previous.next = previous.next.next;
         size--;
         return val;
    }
    public void DisplayLL()
    {
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public static void main(String[] args)
    {
        SinglyLLPrac obj = new SinglyLLPrac();
        obj.insertAtHead(12);
        obj.insertAtHead(11);
        obj.DisplayLL();

        obj.insertAtTail(13);
        obj.DisplayLL();
        obj.insertAtTail(14);
        obj.DisplayLL();

        obj.insertATAnyPos(4,15);
        obj.DisplayLL();
        obj.insertATAnyPos(3,20);
        obj.DisplayLL();

        System.out.println(obj.deleteNodeAtHead());
        obj.DisplayLL();

        System.out.println(obj.deleteNodeATTail());
        obj.DisplayLL();
        System.out.println(obj.size);

        System.out.println(obj.deleteAtAnyPos(1));
        obj.DisplayLL();
        System.out.println(obj.size);
    }
}
