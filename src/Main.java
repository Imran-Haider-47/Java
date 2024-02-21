import problems.*;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        LinkedList llist = new LinkedList();
        ListNode head = new ListNode(1);
        llist.add(head);
        int i=0;
        while(i<5){
            llist.add(i);
            llist.add(i);
        }
        RemoveDuplicateLList removedllist = new RemoveDuplicateLList();
        removedllist.deleteDuplicates(head);

        MyHashMap hashmap = new MyHashMap();
        hashmap.myHashMapFn();

        //MyLinkedList myllist = new MyLinkedList();
        //myllist.studentsLinkedList();


        //CollectionsClass.arrayListFnInt();
        //Collections.arrayListFnStr();
//        PlusOne plusOne = new PlusOne();
//        int []arr={9,8,7,6,5,4,3,2,1,0};
//        int[] arr1 = plusOne.solution(arr);
    }
}