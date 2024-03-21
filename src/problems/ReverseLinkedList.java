package problems;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class ReverseLinkedList {

    public ListNode reverse(ListNode head){
        if(head == null || head.next == null){
            return  head;
        }

        ListNode last = reverse(head.next);
        head.next.next = head;
        head.next = null;

        return last;
    }
    public ListNode solution(){

        ListNode node4 = new ListNode(4,null);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode head = new ListNode(1, node2);

        LinkedList<ListNode> list = new LinkedList<>();
        list.add(head);
        ListNode last = reverse(head);
        ListNode temp = last;
        while(temp!=null){
            System.out.println(temp.val);
            temp = temp.next;
        }

        return head;
    }

}
