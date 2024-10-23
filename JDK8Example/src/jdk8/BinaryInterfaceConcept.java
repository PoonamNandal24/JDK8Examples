package jdk8;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class BinaryInterfaceConcept {

	public static void main(String[] args) {
	
		BiFunction<String, String, String> fun = (x,y) -> x.concat(y);
		
		String res =fun.apply("Happy Birthday Shaurya, Happy Birthday Happy Birthday Happy Birthday Shaurya", "  May God bless you long healthy life");
		System.out.println(res);
		
		BinaryOperator <String> func1 = (x,y) -> x.replaceAll("amm", "");
		String re= func1.apply("I amm am a amm good amm girl", "amm");
		System.out.println(re);
	
	}

}
