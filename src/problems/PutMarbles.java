package problems;

import java.util.ArrayList;
import java.util.Collections;

public class PutMarbles {


    int[] weights = {1, 3, 5, 1};
    int k = 2;

    public long solution() {
        int n = weights.length;
        int m = n - 1;
        ArrayList<Integer> pairSum = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            pairSum.add(weights[i] + weights[i + 1]);
        }

        Collections.sort(pairSum);
        long maxSum = 0;
        long minSum = 0;
        for (int i = 0; i < k - 1; i++) {
            minSum += pairSum.get(i);
            maxSum += pairSum.get(m - 1 - i);

        }
        System.out.println(maxSum - minSum);
        return maxSum-minSum;
    }


}
