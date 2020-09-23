package com.home;

import java.util.ArrayList;
import java.util.List;

public class AutoBoxingAndUnBoxing {

	public static void main(String[] args) {
		
		Integer n=new Integer(10);
		System.out.println(n);
		int m=n;
		System.out.println(m);
		System.out.println("-----");
		Character c='a';
		System.out.println(c);
		char b=c;
		System.out.println(b);
		System.out.println("-----");
		List<Integer> numList=new ArrayList<>();
		for (int i = 1; i <=10; i++) {
			numList.add(i);
		}
		for (Integer num : numList) {
			System.out.println(num);
		}
	}

}
