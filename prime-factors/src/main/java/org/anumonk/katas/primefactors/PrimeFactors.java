package org.anumonk.katas.primefactors;

import java.util.ArrayList;
import java.util.List;

/**
 * Attempt at the prime-factors kata, as specified by Uncle Bob. See
 * http://butunclebob.com/ArticleS.UncleBob.ThePrimeFactorsKata for more info
 * regarding this particular Kata.
 * 
 * @author anumonk
 * 
 */
public class PrimeFactors {

	/**
	 * Generates a list of prime-factors for a given integer greater than 1.
	 * 
	 * @param n
	 *            the number for which to generate prime-factors.
	 * @return a list of prime-factors in numerical sequence or an empty list if
	 *         n was less than 1.
	 */
	public List<Integer> generate(Integer n) {
		ArrayList<Integer> primeFactors = new ArrayList<Integer>();

		for (int p = 2; n > 1; p++) {
			for (; n % p == 0; n /= p) {
				primeFactors.add(p);
			}
		}

		return primeFactors;
	}

}
