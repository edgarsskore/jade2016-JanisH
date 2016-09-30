package m00;

import static org.junit.Assert.*;
import org.junit.Test;

public class SearchTest {

	@Test
	public void test() {
	}
	/**
	 * Test if values is in the first half
	 * x = 4, position = 1
	 */
	@Test
	public void testBinarySearchLeft() {
		int[] arr = {1,2,3,4,5,6,7,8,9,10,11};
		int x = 2;
		int xpos = 1;
		assertTrue(Search.find(x, arr) == xpos);
	}
	/**
	 * Test if values is in the second half
	 * x = 3, position = 9
	 */
	@Test
	public void testBinarySearchRight() {
		int[] arr = {1,2,3,4,5,6,7,8,9,10,11};
		int x = 10;
		int xpos = 9;
		assertTrue(Search.find(x, arr) == xpos);
	}
	/**
	 * Test if values is in the middle
	 * x = 6, position = 5
	 */
	@Test
	public void testBinarySearchMiddle() {
		int[] arr = {1,2,3,4,5,6,7,8,9,10,11};
		int x = 6;
		int xpos = 5;
		assertTrue(Search.find(x, arr) == xpos);
	}
	/**
	 * Test if values is in the second half of odd number array
	 * x = 21, position = 10
	 */
	@Test
	public void testBinarySearchOdd() {
		int[] arr = {1,3,5,7,9,11,13,15,17,19,21};
		int x = 19;
		int xpos = 9;
		assertTrue(Search.find(x, arr) == xpos);
	}
	/**
	 * Test if values is in the first half of even number array
	 * x = 2, position = 0
	 */
	@Test
	public void testBinarySearchEven() {
		int[] arr = {2,4,6,8,10,12,14,16,18,20,22};
		int x = 2;
		int xpos = 0;
		assertTrue(Search.find(x, arr) == xpos);
	}
	/**
	 * Test if first occurence of "10" is found
	 * x = 10, position = 4
	 */
	@Test
	public void testBinarySearchOccurence() {
		int[] arr = {2,4,6,8,10,10,14,16,18,20,22};
		int x = 10;
		int xpos = 5;
		assertTrue(Search.find(x, arr) == xpos);
	}
	/**
	 * Test if number doesnt exist
	 * x = 10, position = 4
	 */
	@Test
	public void testBinarySearchNoOccurence() {
		int[] arr = {2,4,6,8,10,10,14,16,18,20,22};
		int x = 33;
		assertTrue(Search.find(x, arr) == -1);
	}
}
