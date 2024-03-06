package problems;

import java.util.HashMap;
import java.util.Map;

public class TwoSum1 {
    int []arr={1,2,3,4};
    int target = 6;
    public void twosum_1(){

        for(int i=0; i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++)
            {
                if(target-arr[i]== arr[j]){
                    System.out.println(i+" , "+j);
                }

            }
        }
    }

    public void twoSum_hashMap(){
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for(int i=0;i<arr.length;i++){

            if(hashMap.containsKey(target-arr[i])){

                System.out.println(hashMap.get(target-arr[i])+ " , "+ i);

            }
            hashMap.put(arr[i],i);
        }

    }
}
