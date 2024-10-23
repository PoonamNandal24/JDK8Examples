package jdk8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class streamIntermediateOperationsExample {

	public static void main(String[] args) {
		
		List<List<String>> listOfLists = Arrays.asList(
				Arrays.asList("Reflection", "Collection", "Stream"),
				Arrays.asList("Structure", "State", "Flow"),
				Arrays.asList("Sorting", "Mapping", "Reduction", "Stream")
				); 
		
		Set<String> intermediateResults = new HashSet<>();
		
		List<String> result = listOfLists.stream().flatMap(List :: stream)
		.filter(ele -> ele.startsWith("S")).sorted().distinct().map(ele -> ele.toUpperCase()).peek(s -> intermediateResults.add(s))
		.collect(Collectors.toList());
		
		result.forEach(ele -> System.out.println(ele));
		
	}

}
