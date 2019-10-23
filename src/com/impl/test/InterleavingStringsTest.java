package com.impl.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import com.impl.dev.InterleavingStrings;

public class InterleavingStringsTest {

	@Test
	public void validInterleavingStringsReturnTrue() {
		InterleavingStrings interleavingEx = new InterleavingStrings();
		String s1 = "aabcc", s2 = "dbbca", s3 = "aadbbcbcac";
		boolean isValid = interleavingEx.isInterleavingString(s1, s2, s3);
		assertEquals(true, isValid);
	}
	
	@Test
	public void invalidInterleavingStringsReturnFalse() {
		InterleavingStrings interleavingEx = new InterleavingStrings();
		String s1 = "aabcc", s2 = "dbbca", s3 = "aaasddbbcbcac";
		boolean isValid = interleavingEx.isInterleavingString(s1, s2, s3);
		assertEquals(false, isValid);
	}
	
	@Test
	public void emptyS1InterleavingStringsReturnFalse() {
		InterleavingStrings interleavingEx = new InterleavingStrings();
		String s1 = "", s2 = "dbbca", s3 = "aaasddbbcbcac";
		boolean isValid = interleavingEx.isInterleavingString(s1, s2, s3);
		assertEquals(false, isValid);
	}
	
	@Test
	public void emptyS2InterleavingStringsReturnFalse() {
		InterleavingStrings interleavingEx = new InterleavingStrings();
		String s1 = "aabcc", s2 = "", s3 = "aaasddbbcbcac";
		boolean isValid = interleavingEx.isInterleavingString(s1, s2, s3);
		assertEquals(false, isValid);
	}
	
	@Test
	public void emptyS3InterleavingStringsReturnFalse() {
		InterleavingStrings interleavingEx = new InterleavingStrings();
		String s1 = "aabcc", s2 = "dbbca", s3 = "";
		boolean isValid = interleavingEx.isInterleavingString(s1, s2, s3);
		assertEquals(false, isValid);
	}
	
}
