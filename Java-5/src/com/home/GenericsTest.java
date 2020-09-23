package com.home;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest {

	public static void main(String[] args) {
		List<Object> list=new ArrayList<>();
		list.add("Vive Garg");
		list.add(23);
		list.add("Paras");
		list.add(25);
		
		//System.out.println((String)list.get(3));//Exception on Rintime
		for (Object object : list) {
			if(object instanceof String) {
				String name=(String) object;
				System.out.println(name);
			}
			else if(object instanceof Integer) {
				Integer age=(Integer) object;
				System.out.println(age);
			}
		}
		
		System.out.println("-----------");
		List<String> empList = new ArrayList<>();
		empList.add("Vivek Garg");
		empList.add("Paras");
		empList.add("Prabhat");
		empList.add("Shubham");
		//empList.add(10);//Compile time error
		for (String emp : empList) {
			System.out.println(emp);
		}
	} 

}
