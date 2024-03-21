package problems;

public class MergeTwoSortedLinkedList {
    public ListNode solve(ListNode L1, ListNode L2){
        ListNode result;
        if(L1==null){
            return L2;
        }
        if(L2 == null){
            return L1;
        }
        if(L1.val < L2.val){
            result = L1;
            result.next = solve(L1.next, L2);
        }
        else{
            result = L2;
            result.next = solve(L1, L2.next);
        }
        return result;

    }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        return solve(list1, list2);

    }
}
