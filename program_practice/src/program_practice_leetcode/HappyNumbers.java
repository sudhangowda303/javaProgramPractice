package program_practice_leetcode;

import java.util.ArrayList;
import java.util.List;

public class HappyNumbers {

	 public static boolean isHappy(int n) {
	        int sum=0;
			
			List<Integer> list = new ArrayList<Integer>();

			if(n==1)
			{
				return true;			
			}
			else
			{
				while(n>0) {
					
						sum=sum+(n%10)*(n%10);
						n=n/10;
						if(n==0)
						{
							n=sum;
							
							if(list.contains(n) || n==1)
							{
								return list.contains(n)?false:true;
								
							}
							list.add(sum);
							sum=0;
							
							
						}
						
					
				}
				
			}
	        return false;
				
	    }
	public static void main(String[] args) {
		System.out.println(isHappy(19));

	}

}
