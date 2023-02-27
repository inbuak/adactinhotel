package com.sam;

public class Sample {
	public static void main(String[] args) {
//		int a=20,b=10;
//		System.out.println("biggest num is: "+ (a>b?a:b));
	String s="jaVa Programming";
	int lower=0;
	int upper=0;
	for (int i = 0; i < s.length(); i++) {
		char charAt = s.charAt(i);
		if (Character.isLowerCase(charAt)) {
			lower++;
			
		}else{
			upper++;
		}
	}
	System.out.println(lower);
	System.out.println(upper);
	}

}
