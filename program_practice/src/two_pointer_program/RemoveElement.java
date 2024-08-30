package two_pointer_program;

public class RemoveElement {

	public static int  removeDuplicate(int[]nums,int val)
	{
		int count =0;
		 for (int i = 0; i < nums.length; i++) {
			if(nums[i]!=val)
			{
				nums[count]=nums[i];
				count++;
			}
		}
	        return count;    
		
	}
	public static void main(String[] args) {
		
		int[] nums = {0,1,2,2,3,0,4,2};
		int k=2;
		System.out.println(removeDuplicate(nums,k));
	}

}
