package problems;

import java.util.HashMap;
import java.util.Map;

public class CountElementsWithMaxFreq {
    int[] arr = {1,2,3,4,1,2,5};
    Map<Integer, Integer> hashMap = new HashMap<>();

    public int solution(){

        for(int element: arr){
            if(hashMap.containsKey(element)){
                int value = hashMap.get(element);
                value ++;
                hashMap.put(element,value);
            }
            else{
                hashMap.put(element,1);
            }
        }
        int max = Integer.MIN_VALUE;
        for(int value : hashMap.values()){
            if(value>max){
                max = value;
            }
        }
        int result=0;
        for(int value: hashMap.values()){
            if(value==max){
                result += value;
            }
        }
        return result;
    }


}
