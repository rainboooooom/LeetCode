package rainbomsea.leetcode.array;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int index = nums1.length - 1;
        int i = m - 1;
        int j = n - 1;
        // 这里边界情况直接在括号里面处理了
        while (index >= 0) {
            int a = i >= 0 ? nums1[i] : nums2[j] - 1;
            int b = j >= 0 ? nums2[j] : nums1[i] - 1;
            if(a >= b) {
                nums1[index--] = a;
                i--;
            }else {
                nums1[index--] = b;
                j--;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        new MergeSortedArray().merge(nums1, 3, nums2, 3);
    }
}
