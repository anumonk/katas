package org.anumonk.katas.primefactors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrimeFactors {

	public List<Integer> generate(Integer n) {
		if (n > 1) {
			return Arrays.asList(2);
		}
		return new ArrayList<Integer>();
	}

}
