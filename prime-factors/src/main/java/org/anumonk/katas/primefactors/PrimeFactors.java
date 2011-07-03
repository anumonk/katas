package org.anumonk.katas.primefactors;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Attempt at the prime-factors kata, as specified by Uncle Bob. See
 * http://butunclebob.com/ArticleS.UncleBob.ThePrimeFactorsKata for more info
 * regarding this particular Kata.
 * 
 * This particular implementation is an optimisation of the original kata as it
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
	 * @param n
	 *            the number for which to generate prime-factors.
	 * @return a list of prime-factors in numerical sequence or an empty list if
	 *         n was less than 1.
	 */
	@SuppressWarnings("unchecked")
	public List<Integer> generate(Integer n) {

		if (n < LOWEST_PRIME_FACTOR) {
			return Collections.EMPTY_LIST;
		}

		int p = LOWEST_PRIME_FACTOR;
		ArrayList<Integer> primeFactors = new ArrayList<Integer>();

		while (n >= p * p) {
			if (n % p == 0) {
				primeFactors.add(p);
				n = n / p;
			} else {
				p++;
			}
		}

		primeFactors.add(n);

		return primeFactors;
	}

}
