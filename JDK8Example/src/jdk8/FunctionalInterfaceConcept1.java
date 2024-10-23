package jdk8;

import java.util.function.Function;

public class FunctionalInterfaceConcept1 {

	public static void main(String[] args) {
	
		Function<String, Integer> func = x -> x.length();
		Integer len =func.apply("I am Poonam and i am learning JDK8");
		System.out.println(len);
		
		Function<String, Integer> func1 = x -> x.concat(x).length();
		Integer res =func1.apply("I am blessed");
		System.out.println(res);
	
		//Chaining method
		//func.andThen(func1.).apply("May God bless everyone");
		
		Function<String, Integer> func2 = x -> x.concat("I am blessed").length();
		Integer res1 =func2.apply("May god bless everyone");
		
		//func.andThen(func2).apply("Hope everyone is blessed");
	}

}
