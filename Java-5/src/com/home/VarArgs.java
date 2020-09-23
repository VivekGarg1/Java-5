package com.home;

public class VarArgs {

	public static void main(String[] args) {

		int sum = sum("Calculated sum::");
		System.out.println(sum);
		
		int sum1 = sum("Calculated sum::",1,5,4);
		System.out.println(sum1);
		
		int sum2 = sum("Calculated sum::",new int[] {1,5,6,8});
		System.out.println(sum2);
	}

	private static int sum(String message, int... arr) {
		System.out.println(message);
		int sum=0;
		for (int i : arr) {
			sum=sum+i;
		}
		return sum;
}

}
