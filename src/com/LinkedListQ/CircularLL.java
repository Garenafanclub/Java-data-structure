package com.LinkedListQ;

public class CircularLL {
    private Node head;
    private Node tail;
    public int size;

    private class Node
    {
        private int data;
        private Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    };

    public void insertNode(int val)
    {
        Node node = new Node(val);
        if(head == null)
        {
            head = node;
            tail = node;
            return;
        }
        tail.next = node;
        tail = node;
        node.next = head;
    }

    public void deletionList(int value)
    {
        Node temp = head;
        if(temp == null){
            return;
        }
        if(temp.data != value)
        {
           temp = temp.next;
        }
        Node curr = null;
        Node prev = curr.next;
    }

    public void Display()
    {
       Node temp = head;
       if(head != null)
       {
           do{
               System.out.print(temp.data + "->");
               temp = temp.next;
           }while(temp != head);
       }
        System.out.println("HEAD");
    }

    public static void main(String[] args)
    {
        CircularLL obj = new CircularLL();
        obj.insertNode(10);
        obj.insertNode(9);
        obj.insertNode(8);
        obj.insertNode(7);
        obj.insertNode(6);
        obj.Display();
    }
}
