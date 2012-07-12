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

		List<Integer> resultingFactors = primeFactorsService.generate(1);
		assertThat(resultingFactors, is(Collections.EMPTY_LIST));
	}

	@Test
	public void shouldReturnPrimeForTwo() {

		List<Integer> resultingFactors = primeFactorsService.generate(2);
		assertThat("resulting prime factor for 2 should be the prime number 2", resultingFactors, is(listWithValues(2)));

	}

	@Test
	public void shouldReturnPrimeForThree() {

		List<Integer> resultingFactors = primeFactorsService.generate(3);
		assertThat("resulting prime factor for 3 should be the prime number 3", resultingFactors, is(listWithValues(3)));
	}

	@Test
	public void shouldReturnPrimesForFour() {

		List<Integer> resultingFactors = primeFactorsService.generate(4);
		assertThat("resulting prime factor for 4 should be the prime numbers 2,2", resultingFactors, is(listWithValues(2, 2)));
	}

	@Test
	public void shouldReturnPrimesForSix() {

		List<Integer> resultingFactors = primeFactorsService.generate(6);
		assertThat("resulting prime factor for 6 should be the prime numbers 2,3", resultingFactors, is(listWithValues(2, 3)));
	}

	@Test
	public void shouldReturnPrimesForEight() {
		
		List<Integer> resultingFactors = primeFactorsService.generate(8);
		assertThat("resulting prime factor for 8 should be the prime numbers 2,2,2", resultingFactors, is(listWithValues(2, 2, 2)));
	}

	@Test
	public void shouldReturnPrimesForNine() {

		List<Integer> resultingFactors = primeFactorsService.generate(9);
		assertThat("resulting prime factor for 9 should be the prime numbers 3,3", resultingFactors, is(listWithValues(3, 3)));

	}
	
	@Test
	public void shouldReturnPrimesForTen() {

		List<Integer> resultingFactors = primeFactorsService.generate(10);
		assertThat("resulting prime factor for 10 should be the prime numbers 2,5", resultingFactors, is(listWithValues(2, 5)));
	}

	@Test(expected = IllegalArgumentException.class)
	public void shouldExceptionWithNullArgument() {
		// when generating prime factors for a null value
		primeFactorsService.generate(null);

		// then we expect an exception to be thrown
	}

	private List<Integer> listWithValues(Integer... vals) {
		ArrayList<Integer> valueHolder = new ArrayList<Integer>();
		for (Integer val : vals) {
			valueHolder.add(val);
		}
		return valueHolder;
	}

}
