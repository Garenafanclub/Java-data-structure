package com.LinkedListQ;

public class InsertUsingRecur {
    private Node head;
    private Node tail;
    public int size;

    InsertUsingRecur(int size)
    {
        this.size = 0;
    }
    public class Node {
        private int data;
        private Node next;

        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }
    public void insertAtHead(int val)
    {
        Node node = new Node(val);
        node.next  = head;
        head = node;
        if(tail == null)
        {
            tail = head;
        }
        size++;
    }
    public void insertAtLast(int val)
    {
        Node node = new Node(val);
        if(tail == null)
        {
            insertAtHead(val);
            return;
        }
        tail.next = node;
        tail = node;
        size++;
    }
    public void Display()
    {
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("END");
    }

    public void RemoveDuplicateFromSortedList()
    {
        Node node = head;
        while(node.next != null)
        {
            if(node.data == node.next.data)
            {
                node.next = node.next.next;
                size--;
            }
            else
            {
                node = node.next;
            }
        }
        tail = node;
        tail.next = null;
    }

    public static void main(String[] args)
    {
        InsertUsingRecur obj = new InsertUsingRecur(0);
        obj.insertAtHead(1);
        obj.insertAtLast(1);
        obj.insertAtLast(2);
        obj.insertAtLast(3);
        obj.insertAtLast(3);
        obj.insertAtLast(3);
        obj.Display();
        System.out.println();
        obj.RemoveDuplicateFromSortedList();
        obj.Display();

    }
}
