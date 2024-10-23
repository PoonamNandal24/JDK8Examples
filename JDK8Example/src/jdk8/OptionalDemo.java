package jdk8;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class OptionalDemo {

	public static void main(String[] args) {
		
		String[] names = new String[10];
		Optional<String> chkNull = Optional.ofNullable(names[5]);
		
		if(chkNull.isPresent())
		{
			String n = names[5].toUpperCase();
			System.out.println(n);
		}else
		{
			System.out.println("names[5] is null");
		}
		System.out.println("*************");
		
		//List<Integer> iList= new ArrayList<Integer>();
		String[] iList = new String[10];
		Optional opt = Optional.ofNullable(iList[8]);
		
		if(opt.isPresent())
		{
			System.out.println(opt);
		}
		else
		{
			System.out.println("List is null");
		}
		
		
		String nullName = null;
		String opt1 = Optional.ofNullable(nullName).orElse("Poonam");
		System.out.println(opt1);
	}

}
