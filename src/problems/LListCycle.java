package problems;


public class LListCycle {


    public boolean solution() {
        ListNode node1 = new ListNode(3);
        ListNode node2 = new ListNode(2);
        node1.next = node2;
        ListNode node3 = new ListNode(0);
        node2.next = node3;
        ListNode node4 = new ListNode(-4, node2);
        node3.next =node4;


        ListNode head = node1;

        ListNode slow = head;
        ListNode fast = head;

        while(fast!=null && fast.next !=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast){
                System.out.println("True");
                return true;
            }
        }

        System.out.println("False");

        return false;

    }

}
