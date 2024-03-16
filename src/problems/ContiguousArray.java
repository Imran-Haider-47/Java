package problems;

import java.util.HashMap;
import java.util.Map;

public class ContiguousArray {
    public int findMaxLength(int[] nums) {
        int csum=0;
        Map<Integer, Integer> map = new HashMap<>();
        int length=0;
        map.put(0,-1);
        for(int i=0; i< nums.length;i++){

            if(nums[i]==0){
                csum += -1;
            }else{
                csum += 1;
            }
            if(map.containsKey(csum)){
                int val = map.get(csum);
                length = Math.max(length, i- val);
            }
            else{
                map.put(csum, i);
            }
        }
        return length;

    }

}
