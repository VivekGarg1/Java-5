package com.home;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WildCardGenericUnBounded {

	public static void main(String[] args) {
		List<Integer> intList=Arrays.asList(1,2,3,4,5);
		print(intList);
		System.out.println("-------");
		List<Double> doubleList = new ArrayList<>();
		doubleList.add(40.0);
		doubleList.add(50.0);
		doubleList.add(70.0);
		print(doubleList);
		System.out.println("-------");
		List<String> empList = new ArrayList<>();
		empList.add("Vivek Garg");
		empList.add("Paras");
		empList.add("Prabhat");
		empList.add("Shubham");
		print(empList);
	}

	private static void print(List<?> list) {
		System.out.println(list);
	}

}
