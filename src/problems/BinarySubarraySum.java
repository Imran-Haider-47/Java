package problems;

import java.util.HashMap;
import java.util.Map;

public class BinarySubarraySum {
    int[] nums = {1,0,1,0,1};
    int goal = 2;
    public int solution(){

        Map<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        int result = 0;
        int cur_sum = 0;
        for(int num: nums){
            cur_sum+= num;
            int remain_sum = cur_sum - goal;
            if(map.containsKey(remain_sum)){
                result+= map.get(remain_sum);
            }

            map.put(cur_sum, map.getOrDefault(cur_sum, 0) + 1);
        }
        return result;
    }

}
