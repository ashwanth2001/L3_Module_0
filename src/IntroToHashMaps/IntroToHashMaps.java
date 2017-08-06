package IntroToHashMaps;

import java.util.HashMap;

public class IntroToHashMaps {
	public static void main(String[] args) {
		// 1. Create a HashMap called roots with Integers for the keys and
		// Doubles
		// for the values.
		HashMap<Integer, String> roots = new HashMap<Integer, String>();
		// 2. Using a for-loop, add 500 entries to your HashMap. The key entry
		// will
		// be the
		// current iteration of the loop (i). The value entry will be the square
		// root of i.
		double s = 0;
		String b = "";
		for (int i = 0; i < 501; i++) {
			s = Math.sqrt(i);
			b = Double.toString(s);
			roots.put(i, b);
		}
		// 3. Iterate through all the entries in your HashMap displaying the
		// keys
		// with their respective
		// square roots (values). Use the following format.
		for (int j = 0; j < 501; j++) {
			System.out.println("The square root of " + j + " is " + roots.get(j));
		}
		// The square Root of 0 is 0.0
		// The square Root of 1 is 1.0
		// The square Root of 2 is 1.4142135623730951
		// The square Root of 3 is 1.7320508075688772
	}
}
