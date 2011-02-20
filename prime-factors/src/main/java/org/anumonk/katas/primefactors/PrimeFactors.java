package org.anumonk.katas.primefactors;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {

	public List<Integer> generate(Integer n) {
		ArrayList<Integer> primeFactors = new ArrayList<Integer>();
		if (n > 1) {
			if (n % 2 == 0) {
				primeFactors.add(2);
				n = n / 2;
			}
			if (n > 1) {
				primeFactors.add(n);
			}
		}
		return primeFactors;
	}

}
