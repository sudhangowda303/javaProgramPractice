package program_practice_leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CountPairsWhoseSumLessthanTarget {

	//easy to understand done by sudhan 
	public static int approach1(List<Integer> nums, int target) {
		int count = 0;
		for (int i = 0; i < nums.size(); i++) {
			for (int j = 0; j < nums.size(); j++) {
				if (i < j && nums.get(i) + nums.get(j) < target) {
					count++;
				}
			}
		}
		return count;
	}
	
	//this logic used to reduce the time complexity
	public static int approach2(List<Integer> nums,int target)
	{
		 int[] ar = new int[nums.size()];
	        for(int k = 0;  k< nums.size(); k++){
	            ar[k] = nums.get(k);
	        }
	             int count = 0;
	        for(int i = 0; i < ar.length; i++){
	               for(int j = i+1; j < ar.length; j++){
	                if(ar[i] + ar[j] < target){
	                    count++;
	                }
	               }
	        }

	        return count;
	}

	public static void main(String[] args) {
		
		Integer[]nums= {-1,1,2,3,1};
		int target=2;
		
		List<Integer>numlist = new ArrayList<>();
		Collections.addAll(numlist, nums);
		
		System.out.println(approach1(numlist, target));
		
	}

}
