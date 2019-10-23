package com.impl.dev;


public class InterleavingStrings {
	
	public boolean dfsHelper(char[] a, char[] b, char[] c, int m, int n, int o, boolean[][] notValid) {
		
		if (notValid[m][n]) return false;
	
		if (o == c.length) return true;
		
		boolean valid = 
				(m < a.length) && (a[m] == c[o]) && dfsHelper(a, b, c, m+1, n, o+1, notValid) ||
				(n < b.length) && (b[n] == c[o]) && dfsHelper(a, b, c, m, n+1, o+1, notValid);
		
		if (valid) notValid[m][n] = true;
		
		return valid;
	}
	
	
	public boolean isInterleavingString(String s1, String s2, String s3) {
		int m = s1.length(), n = s2.length(), o = s3.length();
		if (m+n != o) return false;
		
		char[] a = s1.toCharArray(), b = s2.toCharArray(), c = s3.toCharArray();
		
		return dfsHelper(a, b, c, 0, 0, 0, new boolean[m+1][n+1]);
	}
}
