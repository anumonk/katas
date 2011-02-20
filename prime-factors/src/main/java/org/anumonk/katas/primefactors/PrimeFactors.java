package org.anumonk.katas.primefactors;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {

	public List<Integer> generate(Integer n) {
		ArrayList<Integer> primeFactors = new ArrayList<Integer>();
		if (n > 1) {
			int p = 2;
			while (p < n) {
				while (n % p == 0) {
					primeFactors.add(p);
					n /= p;
				}
				p ++;
			}
			if (n > 1) {
				primeFactors.add(n);
			}
		}
		return primeFactors;
	}

}
