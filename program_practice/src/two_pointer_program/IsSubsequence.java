package two_pointer_program;

public class IsSubsequence {

	// logic1 wrote by sudhan time eff is 1ms
	public static boolean isSubSequence(String s, String t) {
		int startofs = 0;
		int count = 0;
		if (s.length() == 0)
			return true;
		if (t.indexOf(s.charAt(0)) == -1)
			return false;
		int tsart = t.indexOf(s.charAt(0));
		while (tsart < t.length() && startofs<s.length()) {
			if (s.charAt(startofs) == t.charAt(tsart)) {
				count++;
				startofs++;
			} 
				tsart++;
			
			
		}
		return count == s.length();
	}

	//logic2 copoed from leetcode time eff is 0ms
	public static boolean isSubSequence1(String s, String t) {
		char[] sArr = s.toCharArray();
		char[] tArr = t.toCharArray();
		int counter = 0;
		int zähler = 0;
		int i = 0;
		for (int c = counter; c < tArr.length && i < sArr.length; c = counter) {
			if (sArr[i] == tArr[c]) {
				zähler++;
				i++;
			}
			counter++;
		}
		return zähler == sArr.length;
	}

	public static void main(String[] args) {
		String s = "b", t = "abc";
		System.out.println(isSubSequence(s, t));

	}

}
