package rainbomsea.leetcode.bit_manipulation;

public class TotalHammingDistance {
    public int totalHammingDistance(int[] nums) {
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = nums.length - 1;  j > i; j--) {
                ans += hammingDistance(nums[i], nums[j]);
            }
        }
        return ans;
    }

    public int hammingDistance(int x, int y) {
        return Integer.bitCount(x^y);
    }
}
