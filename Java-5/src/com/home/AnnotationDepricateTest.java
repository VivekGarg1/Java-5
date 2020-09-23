package com.home;

public class AnnotationDepricateTest {

	public static void main(String[] args) {
		Addition addition=new Addition();
		@SuppressWarnings("deprecation")
		int sum = addition.sum(10, 20);
		System.out.println(sum);
		
		Addition addition1=new Addition();
		int sum1 = addition1.sum(10, 20,30,40);
		System.out.println(sum1);
	}

}
