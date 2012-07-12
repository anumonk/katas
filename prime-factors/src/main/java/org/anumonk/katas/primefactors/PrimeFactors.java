package org.anumonk.katas.primefactors;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Attempt at the prime-factors Kata, as specified by Uncle Bob. See
 * http://butunclebob.com/ArticleS.UncleBob.ThePrimeFactorsKata for more info
 * regarding this particular Kata.
 * 
 * This particular implementation is an optimisation of the original Kata as it
 * will loop no more than n>=p*p times. See
 * http://people.revoledu.com/kardi/tutorial
 * /BasicMath/Prime/Algorithm-PrimeFactor.html for more details on this
 * algorithm.
 * 
 * @author anumonk
 * 
 */
public class PrimeFactors {

	private static final int LOWEST_PRIME_FACTOR = 2;

	/**
	 * Generates a list of prime-factors for a given integer greater than 1.
	 * 
	 * @param n. the number for which prime-factors will be generated.
	 * @return a list of prime-factors in numerical sequence order or an empty
	 *         list if n is less than 1.
	 */
	@SuppressWarnings("unchecked")
	public List<Integer> generate(Integer n) {

		if (n == null) {
			throw new IllegalArgumentException("cannot generate prime factors for null value of n");
		}

		if (n < LOWEST_PRIME_FACTOR) {
			return Collections.EMPTY_LIST;
		}

		int candidate = LOWEST_PRIME_FACTOR;
		ArrayList<Integer> primeFactors = new ArrayList<Integer>();

		while (n >= candidate * candidate) {
			if (n % candidate == 0) {
				primeFactors.add(candidate);
				n = n / candidate;
			} else {
				candidate++;
			}
		}

		primeFactors.add(n);

		return primeFactors;
	}

}
