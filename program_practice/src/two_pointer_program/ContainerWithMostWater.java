package two_pointer_program;

public class ContainerWithMostWater {
	
	//logic1 best and short code by youtube best approach
	public static int containsMoreWater1(int[] height) {
		int res = 0 ,left=0,right=height.length-1;
		
		while(left<right) {
			res=Math.max(res, (Math.min(height[left], height[right])*(right - left)));
			if(height[left] > height[right])
			{
				right--;
			}else {
				left++;
			}
		}

		return res;
	}

	//logic2 done by sudhan
	public static int containsMoreWater2(int[] height) {
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
	
	//logic will work but it will take more time to compile it will time exceed in leetcode
	public static int containsMoreWater3(int[] height) {
		int res = 0;

		for (int start = 0; start < height.length; start++) {

			for (int end = start+1;end < height.length; end++) {
				int container = end - start;
				int minlength = Math.min(height[start], height[end]);
				res = Math.max(res, container * minlength);
			}
		}

		return res;
	}
	public static void main(String[] args) {
		int[] nums = { 1,7,6,2,5,4,8,3,8};
		System.out.println(containsMoreWater1(nums));
	}

}
