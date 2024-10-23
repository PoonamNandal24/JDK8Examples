package jdk8;

public class LambdaDeclaration {

	public static void main(String[] args) {
		WebPage w1 = (value, age) -> { System.out.println("Hii " + value.toUpperCase() +" is " + age + " years old."); };
		w1.Header("Jagdeep",44);

		//WebPage w2 = (String value) -> { System.out.println(value.toUpperCase()); };
		//w2.Header("poonam");
	}
}
