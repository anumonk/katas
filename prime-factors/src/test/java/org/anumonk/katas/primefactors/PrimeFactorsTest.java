package org.anumonk.katas.primefactors;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class PrimeFactorsTest {

	private PrimeFactors primeFactorsService;

	@Before
	public void setup() {
		primeFactorsService = new PrimeFactors();
	}

	@Test
	public void shouldReturnEmptyListForOne() {
		// when generating the prime-factors of 1
		List<Integer> resultingFactors = primeFactorsService.generate(1);

		// we expect an empty list to be returned
		assertThat(resultingFactors, is(Collections.EMPTY_LIST));
	}

	@Test
	public void shouldReturnPrimeForTwo() {
		// when generating the prime factors of two
		List<Integer> resultingFactors = primeFactorsService.generate(2);

		// we expect the prime number 2 to be returned
		assertThat("resulting prime factor for 2 should be the prime number 2",
				resultingFactors, is(listWithValues(2)));

	}

	@Test
	public void shouldReturnPrimeForThree() {
		// when generating the prime factors of three
		List<Integer> resultingFactors = primeFactorsService.generate(3);

		// we expect the prime number 3 to be returned
		assertThat("resulting prime factor for 3 should be the prime number 3",
				resultingFactors, is(listWithValues(3)));
	}

	@Test
	public void shouldReturnPrimesForFour() {
		// when generating the prime factors of four
		List<Integer> resultingFactors = primeFactorsService.generate(4);

		// we expect the prime numbers 2,2 to be returned
		assertThat(
				"resulting prime factor for 4 should be the prime numbers 2,2",
				resultingFactors, is(listWithValues(2, 2)));
	}

	@Test
	public void shouldReturnPrimesForSix() {
		// when generating the prime factors of six
		List<Integer> resultingFactors = primeFactorsService.generate(6);

		// we expect the prime numbers 2,3 to be returned
		assertThat(
				"resulting prime factor for 6 should be the prime numbers 2,3",
				resultingFactors, is(listWithValues(2, 3)));
	}

	@Test
	public void shouldReturnPrimesForEight() {
		// when generating the prime factors of eight
		List<Integer> resultingFactors = primeFactorsService.generate(8);

		// we expect the prime numbers 2,3 to be returned
		assertThat(
				"resulting prime factor for 8 should be the prime numbers 2,2,2",
				resultingFactors, is(listWithValues(2, 2, 2)));
	}

	@Test
	public void shouldReturnPrimesForNine() {
		// when generating the prime factors of nine
		List<Integer> resultingFactors = primeFactorsService.generate(9);

		// we expect the prime numbers 2,3 to be returned
		assertThat(
				"resulting prime factor for 9 should be the prime numbers 3,3",
				resultingFactors, is(listWithValues(3, 3)));

	}

	private List<Integer> listWithValues(Integer... vals) {
		ArrayList<Integer> valueHolder = new ArrayList<Integer>();
		for (Integer val : vals) {
			valueHolder.add(val);
		}
		return valueHolder;
	}

}
