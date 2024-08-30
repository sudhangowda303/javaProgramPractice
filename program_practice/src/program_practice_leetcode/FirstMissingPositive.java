package program_practice_leetcode;

public class FirstMissingPositive {

	public static int firstMissingPositive(int[] nums) {
        int i=0;
		int n=nums.length;
		
		while (i<n) {
			int correctIndex=nums[i]-1;
			if(nums[i]>0 && nums[i]<=n && nums[i]!=nums[correctIndex])
			{
				swaping(nums,i,correctIndex);
			}else {
				i++;
			}
			
		}
		
		for (int j = 0; j < n; j++) {
			if(nums[j]!=j+1)
			{
				return j+1;
			}
		}
		return n+1;
    }

    public static void swaping(int[]nums,int index1,int index2)
	{
		int temp=nums[index1];
		nums[index1]=nums[index2];
		nums[index2]=temp;
	}
	public static void main(String[] args) {
		int[] nums = {7,8,9,11,12};
		System.out.println(firstMissingPositive(nums));
	}

}
