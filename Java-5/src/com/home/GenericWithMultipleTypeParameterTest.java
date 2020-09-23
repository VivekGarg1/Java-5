package com.home;

public class GenericWithMultipleTypeParameterTest {

	public static void main(String[] args) {
		
		Employee employee=new Employee();
		employee.setId(1);
		employee.setName("Pratibha");
		employee.setSalary(10000.0);
		
		Department department=new Department();
		department.setId(1);
		department.setName("ME");
		GenericWithMultipleTypeParameter<Employee,Department> empDept=new GenericWithMultipleTypeParameter<Employee,Department>(employee,department);
		Employee employee2 = empDept.getT();
		System.out.println(employee2);
		Department department2 = empDept.getU();
		System.out.println(department2);
		
		GenericWithMultipleTypeParameter<String,Integer> genericClass=new GenericWithMultipleTypeParameter<String,Integer>("Vivek Garg",23);
		String t = genericClass.getT();
		Integer u = genericClass.getU();
		System.out.println(t+"\t"+u);
	}

}
