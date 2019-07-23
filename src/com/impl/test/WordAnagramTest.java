package com.impl.test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.*;

import com.impl.dev.WordAnagram;

public class WordAnagramTest {
	
	WordAnagram wa = new WordAnagram();

	@Test
	public void checkIfUnequalStringsReturnsFalse() {
		assertEquals(false, wa.isAnagram("test", "testing"));
	}
	
	@Test
	public void checkIfSameStringsReturnsTrue() {
		assertEquals(true, wa.isAnagram("test", "test"));
	}
	
	@Test
	public void checkIfDiffStringWithSameLengthReturnsFalse() {
		assertEquals(true, wa.isAnagram("test", "tes1"));
	}
	
	@Test
	public void checkIfDiffStringWithSameLengthWithSpecialChar() {
		assertEquals(true, wa.isAnagram("tes#", "test"));
	}
	
	@Test
	public void checkIfWithNumericsReturnsTrue() {
		assertEquals(true, wa.isAnagram("1234", "4321"));
	}
	
	@Test
	public void checkIfWithUnorderedStringReturnsTrue() {
		assertEquals(true, wa.isAnagram("silent", "listen"));
	}

	@Test
	public void checkIfWithDiffCaseStringsReturnsTrue() {
		assertEquals(true, wa.isAnagram("silent", "LiStEN"));
	}
}
