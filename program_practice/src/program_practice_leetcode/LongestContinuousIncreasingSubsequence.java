package program_practice_leetcode;

public class LongestContinuousIncreasingSubsequence {

	public static int findLengthOfLCIS(int[] nums) {
		int count = 1;
		int res = 0;
		res = Math.max(res, count);
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] > nums[i - 1]) {
				count++;
				res = Math.max(res, count);
			} else {
				count = 1;
			}
		}
		return res;
	}

	public static void main(String[] args) {
		int[] nums = { 1, 3, 5, 4, 7 };
		System.out.println(findLengthOfLCIS(nums));
	}

}
