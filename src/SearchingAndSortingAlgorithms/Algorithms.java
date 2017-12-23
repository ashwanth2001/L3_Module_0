package SearchingAndSortingAlgorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		int first = -1;
		for(int i = 0; i<eggs.size(); i++) {
			if(eggs.get(i).equalsIgnoreCase("cracked")) {
				first = i;
				break;
			}
		}
		return first; //<- this needs changing
	}
	
	//Add other methods here
	public static int countPearls(List<Boolean> oysters) {
		int total = 0;
		for(int i = 0; i<oysters.size(); i++) {
			if(oysters.get(i) == true) {
				total++;
			}
		}
		return total;
		
	}
	
	public static double findTallest(List<Double> h) {
		Double max = 0.0;
		for(int i = 0; i<h.size(); i++) {
			if(h.get(i)>max) {
				max = h.get(i);
			}
		}
		return max;
		
	}
	
	public static String findLongestWord(List<String> words) {
		String occ = "";
		int maxL = 0;
		int maxI = 0;
		int l = 0;
		for(int i = 0; i<words.size(); i++) {
			occ = words.get(i);
			l = occ.length();
			if(l>maxL) {
				maxL = l;
				maxI = i;
			}
		}
		String fin = words.get(maxI);
		return fin;
	}
	
	public static boolean containsSOS(List<String> inp) {
		boolean sos = false;
		String occ = "";
		for(int i = 0; i<inp.size(); i++) {
			occ = inp.get(i);
			if(occ.equals(" ... --- ... ")) {
				sos = true;
				break;
			}
		}
		return sos;
	}
	
	public static List<Double> sortScores(List<Double> results){
		Collections.sort(results);
		return results;
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
	
	public static List<String> sortWords(List<String> words){
		Collections.sort(words);
		return words;
	}
	
}


