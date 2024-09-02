package two_pointer_program;

import java.util.Arrays;

public class TwoSumIIInputArrayIsSorted {

	//logic1 easy and time eff is better
		public static int[] twosum(int[] nums, int target) {
			int l = 0, r = nums.length - 1;
			
			while (nums[l] + nums[r] != target) {
				if (nums[l] + nums[r] < target) l++;
				else r--;
			}

			return new int[] {l+1, r+1};
		}
		
		//logic2 almost same logic as above to understand deeply this logic can be used
		public static int[] twoSum1(int[] numbers, int target) {
			
			int left = 0;
	        int right = numbers.length - 1;

	        while (left < right) {
	            int total = numbers[left] + numbers[right];

	            if (total == target) {
	                return new int[]{left + 1, right + 1};
	            } else if (total > target) {
	                right--;
	            } else {
	                left++;
	            }
	        }
	        return new int[]{-1, -1}; // If no solution is found  
		}

	public static void main(String[] args) {
		int[] numbers= {3,24,50,79,88,150,345};
		int target=200;
		System.out.println(Arrays.toString(twosum(numbers, target)));

	}

}
