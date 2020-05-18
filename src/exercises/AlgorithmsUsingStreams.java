package exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AlgorithmsUsingStreams {

	public static long countGoodEggs(List<String> eggs) {
		return eggs.stream()				// 1. create stream
		.filter(egg -> egg.equals("whole")) // 2. intermediate filter operation
		.count();							// 3. terminal operation: reduce to an int
	}

	public static Object findTallest(List<Double> peeps) {
//		return Collections.max(peeps);
		return peeps.stream().sorted(Comparator.reverseOrder()).findFirst().get();
	}

	public static long addStringOfNumbers(String numbers) {
		return numbers
		 	.chars()		
		 	.mapToObj(c -> Character.toString(c))	
			.mapToInt(num -> Integer.parseInt(num))
			.sum();
		}
		
		public static long countPearls(List<Boolean> oysters) {
			return oysters.stream().filter(oyster -> oyster.equals(true)).count();

		}

		
		public static String findLongestWord(List<String> words) {
			Stream<String> wordsToStream = words.stream();
			return wordsToStream.sorted((word1, word2) -> word2.length() - word1.length()).findFirst().get();

		}

		
		public static List<Double> sortScores(List<Double> results) {
			return results.stream().sorted().collect(Collectors.toList());
		}

		
		public static List<String> sortDNA(List<String> unsortedSequences) {
			return unsortedSequences.stream().sorted((dna1, dna2) -> dna1.length() - dna2.length())
					.collect(Collectors.toList());
		}

		
		public static List<String> sortWords(List<String> words) {
			return words.stream().sorted().collect(Collectors.toList());
		}

		
		public static List<String> getDistinctSpellsInAlphabeticalOrder(List<String> spellsCastThisWeek) {
			return spellsCastThisWeek.stream().distinct().sorted().collect(Collectors.toList());
		}

		
		public static Integer addEven(String string) {
			ArrayList<Integer> lst = new ArrayList<Integer>();
			for (String field : string.split(""))
				lst.add(Integer.parseInt(field));
			return lst.stream().filter(x -> x % 2 == 0).mapToInt((x) -> x).sum();
		}

		
		public static Double getAverage(int[] numbers) {
			return Arrays.stream(numbers).average().getAsDouble();

		}

		
		public static Integer countOccurrences(String[] strArr, String string) {
			return (int) Arrays.stream(strArr).filter(s -> s.equals(string)).count();
	}

}
