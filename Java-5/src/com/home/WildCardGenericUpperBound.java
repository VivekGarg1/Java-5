package com.home;

import java.util.Arrays;
import java.util.List;

public class WildCardGenericUpperBound {

	public static void main(String[] args) {
		List<Integer> numList=Arrays.asList(1,2,3,4,5);
		System.out.println("Total sum is: "+sum(numList));
		System.out.println("-------------------");
		List<Double> doubleList=Arrays.asList(1.0,2.0,20.0,40.0,50.0);
		System.out.println("Total sum is: "+sum(doubleList));
	}

	private static double sum(List<? extends Number> list) {
		double sum=0.0;
		for (Number number : list) {
			sum+=number.doubleValue();
		}
		return sum;
	}

}
