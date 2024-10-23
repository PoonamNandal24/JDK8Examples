package jdk8;

import java.util.Arrays;
import java.util.List;

public class implemantingFunctionalInterface {

	public static void main(String[] args) {
		
		FunctionalInterface FI = (x,y) -> System.out.println((x)*2);
		
		FI.abc(24,10);
		System.out.println("*********");
		
		FunctionalInterface fI1 = (x, y) -> System.out.println(x*y);
		
		fI1.abc(20,300);
		System.out.println("***************");
		
		List<Integer> l1 = Arrays.asList(10,21,25,22,34,38,49,45,52,2,6);
		l1.stream().sorted().forEach(
				ele -> 
				{
					if(ele %2 ==0)
					{
						System.out.println(ele);
					}
				}
				
				);
		
	}

}
