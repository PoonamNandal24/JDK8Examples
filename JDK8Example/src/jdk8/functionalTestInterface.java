package jdk8;

public interface functionalTestInterface {
	
	void funcTest(String x);
	
	default void test()
	{
	
		System.out.println("Hi How are you Doing ?");
		
	}
}
