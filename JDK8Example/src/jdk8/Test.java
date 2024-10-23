package jdk8;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		
		funcInterface funInterfaceObj = x -> System.out.println(x*2);
		
		funInterfaceObj.abstractFun(24);
		
		funInterfaceObj.normalFun();
		
		System.out.println("*****************");
		
		functionalTestInterface ft = x -> System.out.println(x.toUpperCase());
		ft.funcTest("Poonam is beautiful");
		System.out.println("*****************");
		
		functionalTestInterface ft1 = x -> System.out.println(x.compareTo("poonam is beautiful"));
		
		ft1.funcTest("POONAM IS BEAUTIFUL");
		System.out.println("*****************");
		
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		arrList.add(20);
		arrList.add(10);
		arrList.add(2);
		arrList.add(5);
		arrList.add(3);
		arrList.add(7);
		arrList.add(28);
		
		arrList.forEach(x -> {
			if(x%2 == 0)
				System.out.println(x);
		});
		
		
		
}

}
