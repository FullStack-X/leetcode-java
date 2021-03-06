package me.icro.problems.t189_rotate;

/**
 * 描述:
 *  https://leetcode.com/problems/rotate-array/
 *
 * @author Lin
 * @since 2019-04-24 7:09 AM
 */
public class Solution {
    public void rotate(int[] nums, int k) {
        k %= nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int tmp = nums[start];
            nums[start] = nums[end];
            nums[end] = tmp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] nums0 = new int[] {-1, -100, 3, 99};
        new Solution().rotate(nums0, 2);
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7};
        new Solution().rotate(nums, 3);
        System.out.println(nums);
        int[] nums2 = new int[]{1, 2, 3, 4, 5, 6, 7};
        new Solution().rotate(nums2, 10);
        int[] nums3 = new int[]{1};
        new Solution().rotate(nums3, 10);
    }
}
