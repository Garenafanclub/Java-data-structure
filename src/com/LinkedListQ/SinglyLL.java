package com.LinkedListQ;
public class SinglyLL {
    public  Node head;
    private Node tail;
    public int size;
    SinglyLL()
    {
        this.size = 0;
    }

    private  class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
        }
        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
    public void insertAtHead(int val){
          Node node = new Node(val);
          node.next = head;
          head = node;
          if(tail == null)
          {
              tail = head;
          }
          size+= 1;
    }
    public void insertAtTail(int val) {
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
    public void insertAtAnyPos(int index, int val) {
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
        while(count < index)
        {
            temp = temp.next;
            count++;
        }
        Node insertNode = new Node(val);
        insertNode.next = temp.next;
        temp.next = insertNode;
        size+= 1;
    }
    public void displayLL()
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
       SinglyLL list = new SinglyLL();

       list.insertAtHead(15);
       list.insertAtHead(14);
       list.displayLL();

       list.insertAtTail(16);
       list.insertAtTail(20);
       list.displayLL();

       list.insertAtAnyPos(3,13);
       list.displayLL();
       System.out.println(list.size);
    }
}
