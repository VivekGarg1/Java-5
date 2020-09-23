package com.home;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ForEachLoop {

	public static void main(String[] args) {
		List<String> empList = new ArrayList<>();
		empList.add("Vivek Garg");
		empList.add("Paras");
		empList.add("Prabhat");
		empList.add("Shubham");

		Iterator<String> iterator = empList.iterator();
		while (iterator.hasNext()) {
			String empName = (String) iterator.next();
			System.out.println(empName);
		}
		System.out.println("-----------------------");
		for (String emp : empList) {
			System.out.println(emp);
		}
		System.out.println("-----------------------");
		String nameArr[]=new String[] {"Vivek Garg","Paras","Prabhat","Shubham"};
		for (String name : nameArr) {
			System.out.println(name);
		}
	}

}
