package com.home;

import java.lang.reflect.Method;

public class AnnotationCustomTest {

	@AnnotationCustom(developerName="Shubham",expiryDate = "10-10-2018")
	public void myMethod1() {
		System.out.println("Mymethod1...");
	}
	
	@AnnotationCustom(expiryDate = "12-07-2020")
	public void myMethod2() {
		System.out.println("Mymethod2...");
	}
	
	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		System.out.println("Welcome to annotation world!!!");
		 Method method1 = new AnnotationCustomTest().getClass().getMethod("myMethod1");
		 AnnotationCustom annotation1 = method1.getAnnotation(AnnotationCustom.class);
		 System.out.println(annotation1.developerName()+"\t"+annotation1.expiryDate());
		 
		 Method method2 = new AnnotationCustomTest().getClass().getMethod("myMethod2");
		 AnnotationCustom annotation2 = method2.getAnnotation(AnnotationCustom.class);
		 System.out.println(annotation2.developerName()+"\t"+annotation2.expiryDate());
	}
}
