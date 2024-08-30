package two_pointer_program;

public class SeparateBlackandWhiteBalls {
	
	//logic1 best approach to understand and time effecincy is good
	public static long BlackWhiteBalls(String s)
	{
		long steps=0;
		long count=0;
		
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)=='1')
			{
				count++;
			}else {
				steps +=count;
			}
		}
		
		return steps;
	}
	
	//logic2 compare to logic1 time eff is low
	public static long BlackWhiteBalls1(String s)
	{
		long steps=0;
		long count=s.length()-1;
		
		for (int i = s.length() - 1; i >= 0; i--) {
			if (s.charAt(i) == '1') {
				steps += count - i;
				count--;
			}
		}
		
		return steps;
	}

	public static void main(String[] args) {
		String str = "100";
		System.out.println(BlackWhiteBalls1(str));

	}

}
