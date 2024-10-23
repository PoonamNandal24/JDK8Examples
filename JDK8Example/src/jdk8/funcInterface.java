package jdk8;

public interface funcInterface {

	void abstractFun(int x);
	
	default void normalFun()
	{
		System.out.println(" Hello ");
		
	}
	
}
