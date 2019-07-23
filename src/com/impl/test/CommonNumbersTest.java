package com.impl.test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.*;

import com.impl.dev.CommonNumbers;

public class CommonNumbersTest {

	CommonNumbers cn = new CommonNumbers();
	
	List<Integer> l1 = Arrays.asList(1, 2, 3, 5, 8);
	List<Integer> l2 = Arrays.asList(1, 2, 99, 15, 18);
	List<Integer> l3 = Arrays.asList(1, 2, 23, 45, 17);
	List<Integer> l4 = Arrays.asList(1, 2, 31, 655, 88);
	
	List<List<Integer>> input_ls = Arrays.asList(l1, l2, l3, l4);
	
	@Test
	public void ValidInputReturnsCommonNumber() {
		List<Integer> result_op = cn.getCommonIntegers(input_ls);
		assertEquals((Integer) 1, result_op.get(0));
		assertEquals((Integer) 2, result_op.get(1));
	}
	
	@Test
	public void EmptyInputReturnsNothing() {
		List<List<Integer>> empty_list = Arrays.asList();
		List<Integer> result_op = cn.getCommonIntegers(empty_list);
		assertEquals(0, result_op.size());
	}
	
	@Test
	public void DuplicatesElementsInInputShouldNotReturnValidOp() {
		List<Integer> l1 = Arrays.asList(1, 2, 3, 5, 8, 2);
		List<Integer> l2 = Arrays.asList(1, 99, 15, 18);
		List<List<Integer>> input_ls = Arrays.asList(l1, l2);
		List<Integer> result_op = cn.getCommonIntegers(input_ls);
		
		assertEquals((Integer) 1, result_op.size());
	}
}
