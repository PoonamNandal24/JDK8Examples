package jdk8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class sortLambda {

	public static void main(String[] args) {
		
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(10);
		a1.add(20);
		a1.add(16);
		a1.add(35);
		a1.add(52);
		a1.add(25);
		
		Collections.sort(a1,(o1, o2) -> (o1 > o2) ? -1 :(o1 < o2) ? 1 : 0);
		
		System.out.println("Elements of the arraylist after sorting " + a1);
		System.out.println(a1.get(1));
		
		System.out.println("**************");
		
		List<Integer> num = a1.stream().sorted().filter(ele -> ele % 2 == 0).collect(Collectors.toList());
		num.forEach(e -> System.out.println(e));
		
		System.out.println("***********");
		
		num.forEach(System.out :: println);

	}

}
