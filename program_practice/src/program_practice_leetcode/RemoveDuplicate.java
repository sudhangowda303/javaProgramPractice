package program_practice_leetcode;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicate {
	
	//logic 1 easy to understand 
	public static int  approach1(int[]nums)
	{
		 if (nums.length == 0) return 0;

	        int i = 1;

	        for (int j = 1; j < nums.length; j++) {
	            if (nums[j] != nums[i - 1]) {
	                nums[i] = nums[j];
	                i++;
	            }
	        }

	        return i;    
		
	}
	
	//logic 2
	public static int  approach2(int[]nums)
	{
		Set<Integer> numset=new HashSet<Integer>();
		
		for (int i = 0; i < nums.length; i++) {
			numset.add(nums[i]);
		}
		int i=0;
        for(Integer ele : numset){
        	if (!numset.contains(nums[i]))
        	{
        		
        		nums[i++] = ele;
        	}
        }
				
		return numset.size();
		
	}
	
	public static void main(String[] args) {
		int[] nums = {0,0,1,1,1,2,2,3,3,4};
		System.out.println(approach1(nums));

	}

}
