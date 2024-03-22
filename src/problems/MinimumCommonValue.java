package problems;

import java.util.HashSet;

public class MinimumCommonValue {
    int[] nums1 = {1, 2, 3};
    int[] nums2 = {2, 4};

    public int solution3(){
        int p1=0;
        int p2 = 0;
        int m= nums1.length;
        int n = nums2.length;
        while(p1< m && p2 < n){
            if(nums1[p1]== nums2[p2]){
                return nums1[p1];
            }
            else if(nums1[p1]<nums2[p2]){
                p1++;
            }
            else {
                p2++;
            }
        }

        return -1;
    }

//    public int solution1(){HashSet<Integer> hashSet = new HashSet<>();
//        for(int i=0; i< nums1.length;i++){
//            hashSet.add(nums1[i]);
//        }
//        for(int i=0; i<nums2.length;i++){
//            if(hashSet.contains(nums2[i])){
//                return nums2[i];
//            }
//        }
//        return -1;
//    }
}
