package program_practice_leetcode;

public class ConsecutiveBlackBlocks {

	//logic 1 easy to undestand
	public static int approach2(String blocks, int k) {
		int res = Integer.MAX_VALUE;
		int j = 0, i = 0, whiteBlocks = 0;

		while (j < k) {
			whiteBlocks += (blocks.charAt(j) == 'W') ? 1 : 0;
			j++;
		}
		while (j < blocks.length()) {
			res = Math.min(res, whiteBlocks);
			if (blocks.charAt(i++) == 'W') {
				whiteBlocks--;
			}
			if (blocks.charAt(j++) == 'W') {
				whiteBlocks++;
			}
		}
		res = Math.min(res, whiteBlocks);
		return res;
	}

	// logic2
	public static int approach1(String blocks, int k) {
		int res = Integer.MAX_VALUE;
		for (int i = 0; i < blocks.length() - k + 1; i++) {
			int count = 0;
			for (int j = i; j < i + k; j++) {
				if (blocks.charAt(j) == 'W') {
					count++;
				}
			}
			res = Math.min(res, count);
		}
		return res;
	}

	public static void main(String[] args) {

		String str = "WBWBBBW";
		int k = 2;
		System.out.println(approach1(str, k));
//			System.out.println(approach2(str, k));

	}

}
