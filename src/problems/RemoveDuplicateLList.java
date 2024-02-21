package problems;

import java.util.LinkedList;

public class RemoveDuplicateLList {

    public ListNode deleteDuplicates(ListNode head) {
        LinkedList llist = new LinkedList();
        ListNode temp = head;
        while(head!=null){
            if(llist.contains(head.val)){
                continue;
            }
            else{
                llist.add(head.val);
            }
            head= head.next;
        }
        head = temp;
        while(head!=null){
            System.out.println(head.val);
            head = head.next;
        }
        head = temp;
        return head;
    }


}
