package jdk8;

import java.util.concurrent.ForkJoinPool;

public class ParallelStreamConcept {

	public static void main(String[] args) {
		
		ForkJoinPool corePool = ForkJoinPool.commonPool();
		System.out.println(corePool);

	}

}
