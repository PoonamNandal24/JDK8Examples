package jdk8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamTerminalOperationsExample {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("Reflection", "Collection","Stream", "Stream", "Structure","Sorting","Stream", "State");
		
		names.forEach(ele -> System.out.println(ele));
		System.out.println("***************");
		names.forEach(System.out::println);
		System.out.println("***************");
		List<String> lnames =names.stream().filter(ele -> ele.startsWith("S")).collect(Collectors.toList());
		
		lnames.forEach(System.out::println);
		System.out.println("***************");
		String concatenatedNames = names.stream().reduce(" ", (partialString, element) -> partialString + " " +element);
		System.out.println(concatenatedNames.trim());
		System.out.println("***************");
		
		long count = names.stream().count();
		System.out.println(count);
		System.out.println("***************");
		
		
		Optional <String> firstname =names.stream().sorted().findFirst();
		firstname.ifPresent(System.out::println);
		
		//Optional <String> namesStream = names.stream().sorted().allMatch("S");
		//namesStream.ifPresent(System.out::println);
	}

}
