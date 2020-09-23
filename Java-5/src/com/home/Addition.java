package com.home;

public class Addition {
	
	@Deprecated
	public int sum(int n1,int n2) {
		return n1+n2;
	}
	
	public int sum(int ...n) {
		int sum=0;
		for (int i : n) {
			sum+=i;
		}
		return sum;
	}

}
