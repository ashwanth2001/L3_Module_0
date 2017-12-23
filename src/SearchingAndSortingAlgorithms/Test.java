package SearchingAndSortingAlgorithms;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test {
	
	public static void main(String[] args) {
		List<String> unsortedSequences = Arrays.asList(new String[] { "ATAGCTGATCGTAGCTACGTACGATCG", "CATCGTACATGC", "TATGTGT",
				"GCTGATCGTGACTGTAC", "ACTGT" });
		List<String> sortedSequences = Arrays.asList(new String[] { "ACTGT", "TATGTGT", "CATCGTACATGC", "GCTGATCGTGACTGTAC",
				"ATAGCTGATCGTAGCTACGTACGATCG" });
		List ret = sortDNA(unsortedSequences);
		System.out.println(ret);
	}
	
	public static List<String> sortDNA(List<String> inp){
		for(int i = 0; i<inp.size(); i++) {
			for(int j = i+1; j<inp.size();j++) {
				String a1 = inp.get(i);
				String a2 = inp.get(j);
				if(a1.length()<a2.length()) {
					inp.set(i, a2);
					inp.set(j, a1);
				}
			}
		}
		Collections.reverse(inp);
		return inp;
	}
}
