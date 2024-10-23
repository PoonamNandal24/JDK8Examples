package jdk8;

import java.util.Arrays;
import java.util.List;

public class distinctUsingStream {

	public static void main(String[] args) {
		
		List<String> lnames = Arrays.asList("Java", "C#", "JavaScript", "Java", "Python", "C#");
		
		lnames.stream().distinct().forEach(ele -> System.out.println(ele));
		
		System.out.println("****************");
		
		lnames.stream().map(ele -> ele.concat(" World")).sorted().forEach(ele -> System.out.println(ele));
		
		System.out.println("****************");
		
		lnames.stream().map(ele -> ele.concat(" World")).distinct().sorted().forEach(ele -> System.out.println(ele));

	}

}
