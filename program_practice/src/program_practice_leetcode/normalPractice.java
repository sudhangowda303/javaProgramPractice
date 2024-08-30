package program_practice_leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class normalPractice {


	public static void main(String[] args) {
		String str = "qwefza@ym%n2(";

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
}
