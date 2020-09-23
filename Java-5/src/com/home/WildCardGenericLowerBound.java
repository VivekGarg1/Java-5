package com.home;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WildCardGenericLowerBound {

	public static void main(String[] args) {
		List<Integer> intList=Arrays.asList(1,2,3,4,5);
		print(intList);
		System.out.println("-------");
		List<Number> numList = new ArrayList<>();
		numList.add(40);
		numList.add(50);
		numList.add(70);
		print(numList);
	}

	private static void print(List<? super Integer> list) {
		System.out.println(list);
	}

}
