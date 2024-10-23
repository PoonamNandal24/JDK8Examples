package jdk8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsConcept {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10,22,23,25,24,26);
		
		list.stream().filter(ele -> ele%2 == 0).forEach(ele -> System.out.println(ele));
		
		System.out.println("*******************");
		
		Stream.of("Java", "World", "Poonam").map(e -> e.concat("  Hello")).forEach(ele -> System.out.println(ele));
		System.out.println("-------------");
		
		Stream.of("Java", "C#", "JavaScript", "Shell").filter(e -> e.startsWith("J")).forEach(ele -> System.out.print(ele));
		
		System.out.println("---------------");
		
		Stream.of(1,62,13,5,22,68,43).sorted().forEach(ele -> System.out.println(ele));
						
		System.out.println("---------------");
		
		List<String> lname = Arrays.asList("Hello", "Java", "Poonam");
		lname.stream().map(ele -> ele.concat(" World")).forEach(ele -> System.out.println(ele));
		
		

	}

}
