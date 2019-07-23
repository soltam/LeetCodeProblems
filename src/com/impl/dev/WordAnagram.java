package com.impl.dev;
import java.util.Arrays;

public class WordAnagram {
public boolean isAnagram(String s1, String s2) {
	//To check the length of strings
	if (s1.length() != s2.length())
		return false;
	
	char[] s1_arr = s1.toCharArray();
	char[] s2_arr = s1.toCharArray();
	
	//Sorting the array
	Arrays.sort(s1_arr);
	Arrays.sort(s2_arr);
	
	for (int i = 0; i < s2_arr.length; i++) {
		if (s1_arr[i] != s2_arr[i]) 
			return false;
	}
	
	return true;
}
}
