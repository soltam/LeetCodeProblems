package com.impl.dev;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * Input : List of List of Integers
 * Output: Common integers across all the list of integers
 * Assumptions: No Duplicates
 */

public class CommonNumbers {

	public List<Integer> getCommonIntegers(List<List<Integer>> input_list) {
		List<Integer> result = new ArrayList<Integer>();
		Map<Integer, Integer> result_map = new HashMap<Integer, Integer>();
		
		for (int i = 0; i < input_list.size(); i++) {
			List<Integer> counter_list = new ArrayList<Integer>();
			
			for (int j = 0; j < input_list.get(i).size(); j++) {
				int number = input_list.get(i).get(j);
				
				if (counter_list.contains(number))
					continue;
				
				if (result_map.containsKey(number))
					result_map.put(number, result_map.get(number)+1);
				else 
					result_map.put(number, 1);
				
				counter_list.add(number);
			}
		}
		
		for (Map.Entry<Integer, Integer> each_number: result_map.entrySet()) {
			if (each_number.getValue() == input_list.size()) {
				result.add(each_number.getKey());
			}
		}
		
		return result;
	}
}
