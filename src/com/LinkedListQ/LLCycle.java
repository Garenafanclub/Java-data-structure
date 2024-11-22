package com.LinkedListQ;

public class LLCycle {
    ListNode head;
    ListNode tail;
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    public void insertNode(int val)
    {
       ListNode node = new ListNode(val);
        if(head == null)
        {
            head = node;
            tail = node;
            return;
        }
        tail.next = node;
        tail = node;
    }

    public void Display()
    {
        ListNode temp = head;
        while(temp != null)
        {
            System.out.print(temp.val + "->");
            temp = temp.next;
        }
//        System.out.print("Last");
        ListNode last = tail;
        ListNode cycle = head;
        int count = 2;
        while(count>0)
        {
            cycle = cycle.next;
            count--;
        }
        last.next = cycle;
    }
    public boolean hasCycle(ListNode head)
    {
       ListNode fast = head;
       ListNode slow = head;
       while(fast != null && fast.next != null)
       {
           fast = fast.next.next;
           slow = slow.next;
           if(fast == slow)
           {
               return true;
           }
       }
       return false;
    }
    public int hasLengthCycle(ListNode head)
    {
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null)
        {
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow)
            {
                ListNode temp = slow;
                int length = 0;
                do
                {
                    temp = temp.next;
                    length++;
                }while(temp != slow);
                return length;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        LLCycle obj = new LLCycle();
        obj.insertNode(9);
        obj.insertNode(10);
        obj.insertNode(11);
        obj.insertNode(12);
        obj.insertNode(13);
        obj.insertNode(14);
        obj.insertNode(15);
        obj.Display();
        System.out.println();
        System.out.println(obj.hasCycle(obj.head));
        System.out.println(obj.hasLengthCycle(obj.head));
    }
}

