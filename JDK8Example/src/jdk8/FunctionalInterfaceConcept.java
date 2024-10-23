package jdk8;

import java.util.function.Function;

public class FunctionalInterfaceConcept {

	public static void main(String[] args) {
		
		Function<String, Integer> func = x -> x.length();
		int len = func.apply("Hello Poonam");
		
		System.out.println(len);
		
		//chaining method
		
		Function<Integer, Integer> func2 = x -> x*2;
		
		int result = func.andThen(func2).apply("You are very beautiful");
		System.out.println(result);
	}

}
