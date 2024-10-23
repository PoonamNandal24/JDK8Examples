package jdk8;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class BinaryOperatorInterfaceConcept {

	public static void main(String[] args) {
		
		BinaryOperator <Integer> func = (x1,x2) -> x1+x2;
		int sum = func.apply(20, 30);
		System.out.println(sum);
		
		//BiFunction operator
		
		BiFunction <Integer, Integer, Integer> func1 = (x1,x2) -> x1 * x2;
		int mul = func1.apply(30, 20);
		System.out.println(mul);
	}

}
