package problems;

import java.util.Arrays;
import java.util.List;

public class LongestSubsequenceWithLimitedSum {
    int[] nums = {4, 5, 2, 1};
    int n = nums.length;
    int[] queries = {3, 10, 21};

    public int binarySearchMethod(int target) {
        int result_idx = -1;

        int l = 0;
        int r = n - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] <= target) {
                result_idx = mid;
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return result_idx + 1;
    }

    public int[] solution() {

        Arrays.sort(nums);
        int [] result= new int[queries.length];

        // cumulative sum
        int csum = 0;
        for (int i = 0; i < n; i++) {
            csum = csum + nums[i];
            nums[i] = csum;
        }

        int i=0;
        for(int query : queries) {
            int count = binarySearchMethod(query);
            result[i] = count;
            i++;
        }
        System.out.println(Arrays.toString(result));
        return result;

    }


}
