package com.home;

import static com.home.ConstantUtil.*;
import static java.lang.Math.*;

public class StaticImport {

	public static void main(String[] args) {
		
		//String companyName=ConstantUtil.COMPANY_IBM;
		String companyName=COMPANY_IBM;
		System.out.println(companyName);
		
		//System.out.println(Math.sqrt(5.0));
		System.out.println(sqrt(16.0));
	}

}
