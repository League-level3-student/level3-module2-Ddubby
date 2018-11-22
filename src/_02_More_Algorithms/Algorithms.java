package _02_More_Algorithms;

import java.util.List;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		for (int i = 0; i < eggs.size(); i++) {
			if (eggs.get(i).equals("cracked")) {
				return i;
			}
		}
		return 0;
	}

	public static int countPearls(List<Boolean> oysters) {
		int pearls = 0;
		for (int i = 0; i < oysters.size(); i++) {
			if (oysters.get(i)) {
				pearls++;
			}
		}
		return pearls;
	}

	public static double findTallest(List<Double> peeps) {
		double low = 0;
		for (int i = 0; i < peeps.size(); i++) {
			if (peeps.get(i) > low) {
				low = peeps.get(i);
			}
		}
		return low;
	}

	public static String findLongestWord(List<String> words) {
		int size = 0;
		String longest = "";
		for (int i = 0; i < words.size(); i++) {
			if (words.get(i).length() > size) {
				size = words.get(i).length();
				longest = words.get(i);
			}
		}
		return longest;
	}

	public static boolean containsSOS(List<String> code) {
		boolean SOS = false;
		for (int i = 0; i < code.size(); i++) {
			if (code.get(i).equals(" ... --- ... ")) {
				SOS = true;
				return SOS;
			}
		}
		return SOS;
	}

	public static List<Double> sortScores(List<Double> results) {
		for (int i = 0; i < results.size() - 1; i++) {
			if (results.get(i) > results.get(i + 1)) {
				double score = results.get(i);
				results.set(i, results.get(i + 1));
				results.set(i + 1, score);
				if (i == 0) {
					i -= 1;
				} else {
					i -= 2;
				}
			}
		}
		return results;
	}

}
