package problems;

public class TwoSum2 {
    int []arr = {1,2,3,4,5};
    int target = 7;

    public void twoSum_2(){
        int j= arr.length-1;
        int i=0;
        while(i<j){
            if(arr[i]+arr[j]==target){
                System.out.println((i+1)+","+ (j+1));
                break;
            }
            else if(arr[i]+arr[j]>target){
                j--;
            }
            else if(arr[i]+arr[j]<target){
                i++;
            }
        }

    }



}
