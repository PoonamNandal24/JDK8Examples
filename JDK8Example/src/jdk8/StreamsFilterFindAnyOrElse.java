package jdk8;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsFilterFindAnyOrElse {

	public static void main(String[] args) {
		
		List<Customer> customersList = Arrays.asList(
				new Customer("Poonam", 25),
				new Customer("Anita", 35),
				new Customer("Peter", 28),
				new Customer("Tom", 25),
				new Customer("Raj", 33),
				new Customer("Purvi", 40),
				new Customer("Peter", 38)
				);
		
		List <Customer> result =customersList
									.stream()
									.filter(ele -> "Poonam".equals(ele.getName()))
									.collect(Collectors.toList());
		result.forEach(ele -> System.out.println(ele.getAge()));
		
		//2 
		List <Customer> res = customersList.stream().filter(ele -> ! "Tom".equals(ele.getName())).collect(Collectors.toList());
		res.forEach(ele -> System.out.println((ele.getName())+ " - " + (ele.getAge())));
		
		//3
		System.out.println("*****************");
		List<Customer> PCust = customersList.stream().filter(ele -> ele.getName().startsWith("P")).collect(Collectors.toList());
		PCust.forEach(ele -> System.out.println(ele.getName() + " " + ele.getAge()));
		
		System.out.println("%%%%%%%%%%%%%%%%%");
		
		List<Customer> RCust = customersList.stream().filter(ele -> ele.getName().contains("R")).collect(Collectors.toList());
		RCust.forEach(ele -> System.out.println(ele.getName() +" " + ele.getAge()));
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$");
		
		List <Customer> PList =customersList.stream().filter(ele -> (ele.getName().equals("Peter")) && (28 == ele.getAge())).collect(Collectors.toList());
		PList.forEach(ele -> System.out.println(ele.getName() + " -- " + ele.getAge()));
	}

}
