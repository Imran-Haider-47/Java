package problems;

import java.util.LinkedList;

public class MergeInBetweenLList {


    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode head = list1;
        ListNode left = head;

        // Move left pointer to node before the a-th node
        for (int i = 0; i < a - 1; i++) {
            left = left.next;
        }

        ListNode right = left;

        // Move right pointer to b-th node
        for (int i = 0; i < b - a + 1; i++) {
            right = right.next;
        }

        // Connect the left sublist to list2
        left.next = list2;

        // Move temp to the end of list2
        ListNode temp = list2;
        while (temp.next != null) {
            temp = temp.next;
        }

        // Connect the end of list2 to the node after the right sublist
        temp.next = right.next;

        // Return the head of the modified list
        return head;
    }

}
