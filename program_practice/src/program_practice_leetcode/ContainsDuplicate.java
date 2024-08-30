package program_practice_leetcode;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {
	
	//logic 2
//	public static boolean containDuplicate(int[]nums,int k)
//	{
//		Map<Integer, Integer> index = new HashMap<>();
//        for (int i = 0; i < nums.length; i++) {
//            Integer j = index.put(nums[i], i); // put() returns previous value associated with the given key or null if key didn't exist
//            if (j != null && (i - j) <= k) {
//                return true;
//            }
//        }
//        return false;
//	}
	
	//logic 1
	public static boolean containDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer>map=new HashMap<>();
		for(int i=0;i<nums.length;i++)
		{
			if(! map.containsKey(nums[i]))
			{
				map.put(nums[i], i);
			}else if(map.containsKey(nums[i])) {
			 int temp=map.get(nums[i]);
			 	if(Math.abs(temp-i)<=k)
			 	{
			 		return true;
			 	}else {
			 		map.put(nums[i], i);
			 	}
			}
		}
		return false;
    }

	public static void main(String[] args) {
		
		int[] arr = {1,2,1,1};
		int k=1;
		System.out.println(containDuplicate(arr, k)); 
		
	}

}
