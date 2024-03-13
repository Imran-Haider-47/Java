package problems;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RemoveZeroSum {


    public ListNode solution() {

        // LinkedList building
        ListNode head = new ListNode(1);
        ListNode node2 = new ListNode(2);
        head.next = node2;
        ListNode node3 = new ListNode(-3);
        node2.next = node3;
        ListNode node4 = new ListNode(3);
        node3.next = node4;
        ListNode node5 = new ListNode(1);
        node4.next = node5;


        int prefixSum = 0;
        Map<Integer, ListNode> mp = new HashMap<>();
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        mp.put(0,dummy);
        
        while (head != null) {
            prefixSum += head.val;
            if(mp.containsKey(prefixSum)){
                ListNode start = mp.get(prefixSum);
                ListNode temp = start;
                int pSum = prefixSum;
                while(temp!=head){
                    temp = temp.next;
                    pSum += temp.val;
                    if(temp!=head){
                        mp.remove(pSum);
                    }
                }
                start.next = head.next;
            }
            else{
                mp.put(prefixSum,head);
            }
            head = head.next;

        }


        return dummy.next;
    }

}
