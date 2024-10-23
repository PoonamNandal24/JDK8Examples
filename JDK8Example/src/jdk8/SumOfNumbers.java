package jdk8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SumOfNumbers {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,3,5,2,7,8,9,11,48,21,24,56);
		
		int sum = list.stream().sorted().reduce((p,q) -> p+q).get();
		
		System.out.println(sum);

	}

}
