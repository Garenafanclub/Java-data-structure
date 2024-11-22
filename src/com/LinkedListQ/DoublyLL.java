package com.LinkedListQ;
public class DoublyLL {
    private Node head;
    private Node tail;
    public int size;
    DoublyLL(int size) {this.size = 0;}
    private class Node {
        private int data;
        private Node next;
        private Node prev;

       public Node(int data)
        {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
        public Node(int data , Node next , Node prev)
        {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }
    };
    public void insertAtHead(int data) {
        Node node = new Node(data);
        node.next = head;
        node.prev = null;
        if(head != null) head.prev = node;
        head = node;
        size+= 1;
    }
    public void insertAtLast(int val) {
        Node node = new Node(val);
        Node temp = head;
        if(head == null)
        {
            node.prev = null;
            head = node;
        }
        while(temp.next != null)
        {
            temp = temp.next;
        }
        temp.next = node;
        node.prev = temp;
        node.next = null;
        size+=1;
    }
    public void insertAtAnyPos(int index , int val) {
        if(index == 0)
        {
            insertAtHead(val);
            return;
        }
        Node node = new Node(val);
        Node temp = head;
        int count = 1;
        while(count < size-1)
        {
            temp = temp.next;
            count++;
        }
        if(temp.next == null)
        {
            insertAtLast(val);
            return;
        }
        node.next = temp.next;
        temp.next.prev = node;
        temp.next = node;
        node.prev = temp;
        size+=1;
    }
    public void Display() {
        Node temp = head;
        Node temp1 = null;
        while(temp != null)
        {
            System.out.print(temp.data + "->");
            temp1 = temp;
            temp = temp.next;
        }
        System.out.println("END");
        System.out.println("REVERSE THE LINKED LIST: ");
        while(temp1 != null)
        {
            System.out.print(temp1.data + "->");
            temp1 = temp1.prev;
        }
        System.out.println("START");
    }
    public void insertAfterValue(int afterVal , int val)
    {
        Node node = new Node(val);
        Node temp = findValue(afterVal);
        if(temp == null)
        {
            System.out.println("Does not exists..");
            return;
        }
        node.next = temp.next;
       if(node.next != null)
       {
           temp.next.prev = node;
       }
        temp.next = node;
        node.prev = temp;
    }

    public Node findValue(int value)
    {
        Node node = head;
        while(node != null)
        {
            if(node.data == value)
            {
                return node;   // return address of this node....
            }
            node = node.next;
        }
        return null;
    }

    public static void main(String[] args){
        DoublyLL obj = new DoublyLL(0);
        obj.insertAtHead(10);
        obj.insertAtHead(9);
        obj.insertAtHead(8);
        obj.insertAtHead(7);
        obj.insertAtHead(6);
        obj.insertAtLast(11);
        obj.insertAtAnyPos(5,20);
        obj.Display();
        System.out.println("Size of Current list: " + obj.size);
        System.out.println(obj.findValue(21));
        System.out.println(obj.findValue(8));
        obj.insertAfterValue(7,22);
        obj.insertAfterValue(11,23);
        obj.Display();
    }
}
