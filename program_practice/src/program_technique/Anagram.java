package program_technique;

import java.util.Arrays;

public class Anagram {
	
	public static boolean checkAnagram(String str1, String str2)
	{
		char[] ArrayS1 = str1.toLowerCase().toCharArray();
		char[] ArrayS2 = str2.toLowerCase().toCharArray();
		Arrays.sort(ArrayS1);
		Arrays.sort(ArrayS2);
		boolean status=Arrays.equals(ArrayS1, ArrayS2);
//		return Arrays.equals(ArrayS1, ArrayS2);
		return status;
	}
	
	public static boolean checkAnagram1(String strw1, String strw2)
	{
		String str1=strw1.replaceAll("\\S", "");
		String str2=strw2.replaceAll("\\S", "");
		char[] ArrayS1 = str1.toLowerCase().toCharArray();
		char[] ArrayS2 = str2.toLowerCase().toCharArray();
		Arrays.sort(ArrayS1);
		Arrays.sort(ArrayS2);
		boolean status=Arrays.equals(ArrayS1, ArrayS2);
//		return Arrays.equals(ArrayS1, ArrayS2);
		return status;
	}
	
	//without using inbuilt methods
	public static boolean isAnagram(String s1, String s2) {
        // If lengths are different, they cannot be anagrams
        if (s1.length() != s2.length()) {
            return false;
        }
        
        // Create arrays to count frequency of each character (assuming lowercase English letters)
        int[] count = new int[26];
        
        // Count frequency of characters in string s1
        for (char c : s1.toCharArray()) {
            count[c - 'a']++;
        }
        
        // Subtract frequency of characters in string s2
        for (char c : s2.toCharArray()) {
            count[c - 'a']--;
        }
        
        System.out.println(Arrays.toString(count));
        
        // Check if all counts are zero
        for (int i = 0; i < 26; i++) {
            if (count[i] != 0) {
                return false;
            }
        }
        
        return true;
    }

	public static void main(String[] args) {
		String str="sudhan";
		String str1 = "suhand";
		
		System.out.println(checkAnagram(str,str1));
		
		String strw1="sudhan is a good boy";
		String strw2="good boy is suhadn a";
		
		System.out.println(checkAnagram1(strw1, strw2));
		
		System.out.println(isAnagram(str, str1));
		

	}

}
