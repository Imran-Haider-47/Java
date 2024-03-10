package problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Intersection_of_Two_Arrays {
    int[] nums1 = {4,9,5};
    int[] nums2 = {9,4,9,8,4};

    public int[] optimized(){
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> intersectionSet = new HashSet<>();

        for(int num: nums1){
            set1.add(num);
        }
        for(int num: nums2){
            if(set1.contains(num)){
                intersectionSet.add(num);
            }
        }
        int[] result = new int[intersectionSet.size()];
        int i=0;
        for(int num: intersectionSet){
            result[i++] = num;
        }
        return result;

    }
    public int[] intersection() {
        int n1 = this.nums1.length;
        int n2 = this.nums2.length;
        ArrayList<Integer> intersection = new ArrayList<>();

        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                if (nums1[i] == nums2[j]) {
                    if (!intersection.contains(nums1[i])) {
                        intersection.add(nums1[i]);
                    }
                }
            }
        }
        int[] array = new int[intersection.size()];
        for (int i = 0; i < array.length; i++) {
            array[i] = intersection.get(i);
        }
        for (int num : array) {
            System.out.println(num);
        }
        return array;
    }

}
