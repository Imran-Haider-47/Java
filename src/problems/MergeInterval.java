package problems;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeInterval {
    int[][] intervals = {{1,3},{6,9}};
    int[] newInterval = {2,5};

    public int[][] solution(){
        int n = intervals.length;
        ArrayList<int[]> list = new ArrayList<>();
        int i=0;
        while(i<  intervals.length){
            if(intervals[i][1] < newInterval[0] ){
                list.add(intervals[i]);
            }
            else if(intervals[i][0]> newInterval[1]){
                break;
            }
            else{
                //merger and move forward
                newInterval[0] = Math.min(intervals[i][0], newInterval[0]);
                newInterval[1] = Math.max(intervals[i][1], newInterval[1]);
            }

            i++;
        }
        list.add(newInterval);
        while(i<n){
            list.add(intervals[i]);
            i++;
        }
        // Convert ArrayList to 2D array
        int[][] result = new int[list.size()][];
        for (int j = 0; j < list.size(); j++) {
            result[j] = list.get(j);

        }
        return result;
    }





}
