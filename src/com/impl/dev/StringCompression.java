package com.impl.dev;

public class StringCompression {

	public static String getCompressedString(String s) {
		String result = "";
		char[] s_char = s.toCharArray();
		int count = 1, length = s_char.length;
		String curr = "";
		
		for (int i = 0; i < (length-1); i++) {
			curr = String.valueOf(s_char[i]);
			if (s_char[i] == s_char[i+1]) {
				count += 1;
				continue;
			} else {
				result += curr;
				result += String.valueOf(count);
				
				if (i == (length-2) && s_char[i] != s_char[i+1])
					result += String.valueOf(s_char[i+1]) + "1";
				
				count = 1;
			}
		}
		
		if (count != 1) 
			result += curr+String.valueOf(count);
		
		return result;
	}
	
	public static void main(String[] args) {
		System.out.println(getCompressedString("aaaaaaa"));
		System.out.println(getCompressedString("aabbbsssbbbeef"));
		System.out.println(getCompressedString("aaabbbcccdddeeefff"));
	}
}
