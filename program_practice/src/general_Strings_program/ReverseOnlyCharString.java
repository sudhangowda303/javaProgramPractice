package general_Strings_program;

public class ReverseOnlyCharString {
	
	public static void reverseOnlySpecialChar(String str) {
		char[] c=str.toCharArray();
		int start = 0;
		int end = c.length-1;
		char temp=' ';
		
		while(start<end)
		{
			if(!Character.isAlphabetic(c[start]) && !Character.isDigit(c[start]))
			{
				
				if(!Character.isAlphabetic(c[end]) && !Character.isDigit(c[end]))
				{
					char ch=c[end];
					c[end]=c[start];
					c[start]=ch;
					
					start++;
					end--;
				}else {
					end--;
				}
			}else {
				
				start++;
			}
		}
		
		System.out.println(String.valueOf(c));
	}
	
	public static void reverseOnlyAlphabets(String str)
	{

		int count=0;
		char[] c=str.toCharArray();
		int start = 0;
		int end = c.length-1;
		
		while(start<end)
		{
			if(Character.isAlphabetic(c[start]) && Character.isAlphabetic(c[end])) {
				char temp = c[start];
				c[start]= c[end];
				c[end] = temp;
				start++;end--;
			}
			if(!Character.isAlphabetic(c[start])) {
				start++;
			}
			if(!Character.isAlphabetic(c[end])) {
				end--;
			}
		}
		
		System.out.println(String.valueOf(c));
	}

	public static void main(String[] args) {
		String str = "#4a!Qt*@1m%n2(";
		
		reverseOnlySpecialChar(str);
		
	}

}
