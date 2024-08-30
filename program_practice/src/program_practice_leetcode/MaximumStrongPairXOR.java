package program_practice_leetcode;

public class MaximumStrongPairXOR {
	
	public static int bitWeise(int[] nums) {
		int res = 0;
		res = Math.max(res, nums[0] ^ nums[0]);
		if (nums.length > 1) {
			for (int i = 0; i < nums.length; i++) {
				for (int j = 0; j < nums.length; j++) {
					if (Math.abs(nums[i] - nums[j]) <= Math.min(nums[i], nums[j])) {
						res = Math.max(res, nums[i] ^ nums[j]);
					}
				}
			}
		}
		return res;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		System.out.println(bitWeise(arr));
	}

}
