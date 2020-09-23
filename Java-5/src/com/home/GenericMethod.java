package com.home;

public class GenericMethod {

	public static void main(String[] args) {
		Employee employe1=new Employee();
		employe1.setId(1);
		employe1.setName("Pratibha");
		employe1.setSalary(10000.0);
		
		Employee employee2=new Employee();
		employee2.setId(2);
		employee2.setName("Suman");
		employee2.setSalary(10000.0);
		
		Employee empArr[]=new Employee[2];
		empArr[0]=employe1;
		empArr[1]=employee2;
		 display(empArr);
		 System.out.println("----------------");
		 
		 Integer numArr[]=new Integer[] {1,2,3,4,5};
		 display(numArr);
	}
	
	private static <E> void display(E[] elements) {
		for (E e : elements) {
			System.out.println(e);
		}
	}
}
