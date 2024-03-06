package problems;

import java.util.List;

public class ThreeSum3 {
    int[] arr = {-4, -1, -1, 0, 0, 1, 2, 2};

    public void ThreeSum_3() {


        for (int i = 0; i < arr.length - 2; i++) {

            if (i > 0 && arr[i] == arr[i - 1]) {
                continue;
            }

            int n1 = arr[i];
            int left = i + 1;
            int right = arr.length - 1;

            while (left < right) {
                int sum = arr[left] + arr[right];
                if (sum == -n1) {
                    System.out.println(n1 + ", " + arr[left] + ", " + arr[right]);

                    while (left < right && arr[left] == arr[left + 1]) {
                        left++;
                    }
                    while (left < right && arr[right] == arr[right - 1]) {
                        right--;
                    }
                    left++;
                    right--;
                } else if (sum < -n1) {
                    left++;
                } else {
                    right--;
                }
            }
        }
    }
}
