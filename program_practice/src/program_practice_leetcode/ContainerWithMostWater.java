package program_practice_leetcode;

public class ContainerWithMostWater {

	public static int containsMoreWater(int[] height) {
		int res = 0;

		for (int start = 0; start < height.length; start++) {

			for (int end = height.length-1; end > 0; end--) {
				int container = end - start;
				int minlength = Math.min(height[start], height[end]);
				res = Math.max(res, container * minlength);
				if(height[start] > height[end])
				{
					continue;
				}else {
					break;
				}
			}
		}

		return res;
	}
	public static void main(String[] args) {
		int[] nums = { 1,8,6,2,5,4,8,3,7};
		System.out.println(containsMoreWater(nums));
	}

}
