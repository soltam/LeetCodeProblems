package com.impl.dev;

import java.util.ArrayList;
import java.util.List;

public class MissingNumbers {

	public static String diffRangeString(int curr, int next, boolean lower, boolean upper) {
		String resultStr = "";
		
		if (curr+1 == next) {
			return resultStr;
		} else if (curr+2 == next) {
			return String.valueOf(curr+1);
		} else {
			
			if (lower)
				resultStr += String.valueOf(curr);
			else 
				resultStr += String.valueOf(curr+1);
			
			resultStr += "->";
			
			if (upper)
				resultStr += String.valueOf(next);
			else 
				resultStr += String.valueOf(next-1);
		}

		return resultStr;
	}
	
	
	public static List<String> findMissingNumberRanges(int[] nums, int lower, int upper) {
		ArrayList<String> result = new ArrayList<String>();
		String tempString = "";
		int length = nums.length;
		
		if (length == 0) 
			return result;
		
		if (nums[0] != lower) {
			result.add(diffRangeString(lower, nums[0], true, false));
		}
		
		for (int i = 0; i < (length-1); i++) {
			tempString = diffRangeString(nums[i], nums[i+1], false, false);
			if (tempString.length() > 0) {
				result.add(tempString);
			}
		}
		
		if (nums[length-1] != upper) {
			result.add(diffRangeString(nums[length-1], upper, false, true));
		}
		
		return result;
	}
	
	
	public static void main(String[] args) {
		int nums[] = {0, 1, 3, 50, 75};
		int lower = 0;
		int upper = 99;
		
		List<String> result = findMissingNumberRanges(nums, lower, upper);
		for (int i = 0; i < result.size(); i++) {
			System.out.println(result.get(i));
		}
	}
	
}
