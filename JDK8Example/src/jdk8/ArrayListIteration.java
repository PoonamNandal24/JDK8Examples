package jdk8;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIteration {

	public static void main(String[] args) {
		ArrayList<String> tvSeries = new ArrayList<String> ();
		tvSeries.add("Games of Thorne");
		tvSeries.add("Breaking Bad");
		tvSeries.add("The Big Bang Theory");
		tvSeries.add("The Walking Dead");
		tvSeries.add("Prison Break");
		
		//1. Using For each and Lambda expression
		System.out.println("--------------Print using For Each  with lambda in java 8------------");
		
		tvSeries.forEach(shows ->{
			System.out.println(shows);
		});
		
		System.out.println("----------Print using Iterator------------");
		
		//2. Iterator
		
		Iterator<String> it = tvSeries.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
		System.out.println("----------Print using For Loop------------");
		//3. For loop
		
		for(int i=0; i<tvSeries.size(); i++)
		{
			System.out.println(tvSeries.get(i));
		}
		
	}

}
