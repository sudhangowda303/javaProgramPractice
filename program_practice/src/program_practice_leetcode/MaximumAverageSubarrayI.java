package program_practice_leetcode;

public class MaximumAverageSubarrayI {

	//logic 1 easy understanding for me and take less time easy approach
	public static double maximumAverageSubArray(int[] nums, int k) {

		double res = Integer.MIN_VALUE;
		double maxvalue = 0;
		if (nums.length > 1) {

			for (int i = 0; i < k; i++) {
				maxvalue += nums[i];
			}
			res = Math.max(res, maxvalue);
			for (int j = k; j < nums.length; j++) {
				maxvalue = maxvalue + nums[j];
				maxvalue = maxvalue - nums[j - k];
				res = Math.max(res, maxvalue);
			}
			return res / k;
		}
		return nums[0];

	}

	//logic 2 shortcut logic using only one loop instead of using 2 loops
	public static double max(int[] nums, int k) {
		int s, e;
		s = 0;
		double avg = Integer.MIN_VALUE;
		double temp = 0;
		for (e = 0; e < nums.length; e++) {
			temp += nums[e];
			if ((e - s + 1) == k) {
				avg = Math.max(avg, temp);
				temp = temp - nums[s];
				s++;
			}
			// System.out.println(temp);
		}
		return (avg / k);
	}

	public static void main(String[] args) {
		int[] nums = { 1, 12, -5, -6, 50, 3 };
		int k = 4;
		System.out.println(maximumAverageSubArray(nums, k));
//		System.out.println(max(nums,k));
	}
}
