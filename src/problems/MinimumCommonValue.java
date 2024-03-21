package problems;

import java.util.HashSet;

public class MinimumCommonValue {
    int[] nums1 = {1, 2, 3};
    int[] nums2 = {2, 4};
    public int solution(){HashSet<Integer> hashSet = new HashSet<>();
        for(int i=0; i< nums1.length;i++){
            hashSet.add(nums1[i]);
        }
        for(int i=0; i<nums2.length;i++){
            if(hashSet.contains(nums2[i])){
                return nums2[i];
            }
        }
        return -1;
    }
}
