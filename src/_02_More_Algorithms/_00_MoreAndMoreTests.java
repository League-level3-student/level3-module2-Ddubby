package _02_More_Algorithms;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Uncomment each test and then write the method to make it pass.
 **/

public class _00_MoreAndMoreTests {
	String multiply(int num, int num2) {
		return num + " x " + num2 + " = " + num * num2;
	}

	boolean isPrime(int num) {
		boolean prime = true;
		int i = 2;
		while (i <= num / 2) {
			if (num % i == 0) {
				prime = false;
			}
			i++;
		}
		return prime;
	}

	boolean isSquare(int num) {
		boolean square = false;
		if (Math.sqrt(num) - Math.floor(Math.sqrt(num)) == 0) {
			square = true;
		}
		return square;
	}

	boolean isCube(int num) {
		boolean cube = false;
		if (Math.cbrt(num) - Math.floor(Math.cbrt(num)) == 0) {
			cube = true;
		}
		return cube;
	}

	@Test
	public void MultTest() {

		assertEquals("10 x 0 = 0", multiply(10, 0));
		assertEquals("10 x 10 = 100", multiply(10, 10));
		assertEquals("8 x 11 = 88", multiply(8, 11));
	}

	@Test
	public void PrimeTest() {

		assertTrue(isPrime(3));
		assertTrue(isPrime(5));
		assertTrue(isPrime(541));
		assertFalse(isPrime(4));
		assertFalse(isPrime(12));
		assertFalse(isPrime(527));

	}

	@Test
	public void SquareTest() {

		assertTrue(isSquare(4));
		assertTrue(isSquare(144));
		assertTrue(isSquare(64));
		assertTrue(isSquare(10201));
		assertTrue(isSquare(1));
		assertFalse(isSquare(3));
		assertFalse(isSquare(22));
		assertFalse(isSquare(143));

	}

	@Test
	public void CubeTest() {

		assertTrue(isCube(27));
		assertTrue(isCube(216));
		assertTrue(isCube(729));
		assertTrue(isCube(1));
		assertFalse(isCube(3));
		assertFalse(isCube(22));
		assertFalse(isCube(143));

	}

}
