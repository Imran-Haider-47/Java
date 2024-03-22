package problems;

public class PalindromeLinkedList {
    ListNode curr;
    boolean recursive(ListNode head){

        if(head == null){
            return true;
        }
        boolean result = recursive(head.next);
        if(curr.val != head.val){
            return false;
        }
        curr = curr.next;
        return result;
    }
    public boolean isPalindrome(ListNode head) {
        curr = head;
        return recursive(head);
    }
}
