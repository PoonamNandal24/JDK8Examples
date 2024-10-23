package jdk8;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ForEach {

	public static void main(String[] args) {
		
		List<String> product = Arrays.asList("Bag", "MacBook Pro", "Shoes", "Phones", "Bat");
		product.forEach(ele -> System.out.println(ele));
		System.out.println("----------Befor filtering------------");
		
		List <String> result =product.stream().filter(ele -> ! ele.equals("Bat")).collect(Collectors.toList());
		result.forEach(ele1 -> System.out.println(ele1));
		
		System.out.println("----------List with b----------");
		
		List<String> Blist = product.stream().filter(ele -> ele.startsWith("B")).collect(Collectors.toList());
		Blist.forEach(ele -> System.out.println(ele));
		
		System.out.println("--------After Filtering------------");
		
		List<String> names = new ArrayList<String> ();
		names.add("Poonam");
		names.add("Jagdeep");
		names.add("Shaurya");
		names.add("Yashveer");
		names.add("Inaya");
		names.add("Shivaya");
		
		names.forEach(ele -> System.out.println(ele));
		System.out.println("----------------");
		
		names.forEach(System.out :: println);
		
	}

}
