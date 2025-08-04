import java.util.*;

public class sample_hard {
    static final int MOD = 1_000_000_007;

    public static int countValidSubsequences(int[] nums) {
        int n = nums.length;
        int total = 0;
        int minAND = Integer.MAX_VALUE;

        // Step 1: Find minimum possible AND among all subsets
        for (int mask = 1; mask < (1 << n); mask++) {
            int and = -1;
            for (int i = 0; i < n; i++) {
                if ((mask & (1 << i)) != 0) {
                    and = and == -1 ? nums[i] : and & nums[i];
                }
            }
            minAND = Math.min(minAND, and);
        }

        // Step 2: Count how many subsequences have AND == minAND
        for (int mask = 1; mask < (1 << n); mask++) {
            int and = -1;
            for (int i = 0; i < n; i++) {
                if ((mask & (1 << i)) != 0) {
                    and = and == -1 ? nums[i] : and & nums[i];
                }
            }
            if (and == minAND) {
                total = (total + 1) % MOD;
            }
        }

        return total;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        System.out.println(countValidSubsequences(nums));  // Output: 2
    }
}

