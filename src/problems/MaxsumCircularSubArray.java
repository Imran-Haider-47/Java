package problems;

import java.util.Arrays;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class MaxsumCircularSubArray {


    public int kadanesMax(int[] nums, int n) {
        int sum = nums[0];
        int maxSum = nums[0];
        for (int i = 1; i < n; i++) {
            sum = max(sum+nums[i], nums[i]);
            maxSum = max(maxSum, sum);
        }
        return maxSum;

    }

    public int kadanesMin(int[] nums, int n){
        int sum = nums[0];
        int minSum = nums[0];
        for(int i=1; i< n; i++){
            sum = min(sum+nums[i], nums[i]);
            minSum = min(minSum,sum);
        }
        return minSum;
    }


    public int solution() {
        int[] nums = {1, -2, 3, -2};
        int n = nums.length;

        //Step1: find TotalSum of array
        int sum = Arrays.stream(nums).sum();

        // Step2: find minSum using Kadanes Algorithm
        int minSum = kadanesMin(nums, n);

        //Step3: find maxSum using kadanes Algorithm
        int maxSum = kadanesMax(nums, n);

        //Step4: find circular sum using this formula -> sum - minSum
        int circularSum = sum - minSum;
        //Step5: check if maxSum is greater > 0
        if (maxSum > 0) {
            System.out.println(max(maxSum, circularSum));
            return max(maxSum, circularSum);
        }
        return maxSum;

    }


}
