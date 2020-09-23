package com.home;

public class GenericWithSingleTypeParameterTest {

	public static void main(String[] args) {
		GenericWithSingleTypeParameter<String> class1=new GenericWithSingleTypeParameter<String>("Vivek Garg");
		String name = class1.getObject();
		System.out.println(name);
		
		System.out.println("------------");
		
		Employee employee=new Employee();
		employee.setId(1);
		employee.setName("Pratibha");
		employee.setSalary(10000.0);
		GenericWithSingleTypeParameter<Employee> emp=new GenericWithSingleTypeParameter<Employee>(employee);
		Employee employee2 = emp.getObject();
		System.out.println(employee2);
	}

}
