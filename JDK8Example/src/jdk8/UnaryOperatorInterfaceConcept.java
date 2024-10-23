package jdk8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class UnaryOperatorInterfaceConcept {

	public static void main(String[] args) {
		
		UnaryOperator<Integer> un = x -> x*10;
		
		//System.out.println(un.apply(20));
		
		//FunctionOperator
		
		Function<Integer, Integer> func = x -> x+x;
		//System.out.println(func.apply(400));
		
		List<String> li = new ArrayList<String> ();
		
		li.add("Java");
		li.add("C#");
		li.add("Python");
		li.add("JavaScript");
		li.add("Perl");
		Collections.sort(li);
		System.out.println(li);
		
		li.replaceAll(ele -> ele + " Language");
		System.out.println(li);
	}

}
