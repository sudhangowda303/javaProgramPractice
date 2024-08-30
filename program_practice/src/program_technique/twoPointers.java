package program_technique;

import java.util.Arrays;

public class twoPointers {
	
	public static int[] twopointerTechnique(int[]nums,int target)
	{
		int start = 0;
		int end = nums.length-1;
		int[] result = new int[2];
		
		while(start<end)
		{
			int sum=nums[start]+nums[end];
			if(sum == target)
			{
				result[0]=start+1;
				result[1]=end+1;
				break;
			}else if(sum<target){
				start++;
			}else {
				end--;
			}
		}
		
		return result;
	}

	public static void main(String[] args) {
		int []nums= {-3,2,3,3,6,8,15};
		int target=6;
		System.out.println(Arrays.toString(twopointerTechnique(nums,target)));
	}
	//find the 2 number in array which can sum the target variable
}
