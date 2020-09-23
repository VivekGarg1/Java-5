package com.home;

import java.util.ArrayList;
import java.util.List;

public class AnnotationSupressTest {

	@SuppressWarnings({"unchecked","deprecation","rawtypes"})
	public static void main(String[] args) {
		Addition addition=new Addition();
		//@SuppressWarnings("deprecation")
		int sum = addition.sum(10, 20);
		System.out.println(sum);
		
		//@SuppressWarnings("rawtypes")
		List list=new ArrayList<>();
		list.add(10);
		list.add(100);
		System.out.println(list);
	}

}
