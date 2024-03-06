package problems;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        list.add(List.of(1));
        if(numRows>1){
            list.add(List.of(1,1));
        }
        for(int i=2;i<numRows; i++){

            List<Integer> list2 = new ArrayList<>();
            list2.add(1);
            for(int j=0;j<=i-2;j++){

                list2.add(list.get(i-1).get(j)+ list.get(i-1).get(j+1));

            }
            list2.add(1);
            list.add(list2);
        }

        return list;
    }
}
