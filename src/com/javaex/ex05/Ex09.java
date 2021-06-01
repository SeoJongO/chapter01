package com.javaex.ex05;

public class Ex09 {

	public static void main(String[] args) {
		String[] arrayS = new String[3];
		
		char[] arrayC = new char[3];
		
		arrayS[0]="정우성";
		arrayS[1]="이효리";
		arrayS[2]="유재석";
		
		arrayC[0]='정';
		arrayC[1]='이';
		arrayC[2]='유';
		
		for ( int i = 0; i<arrayS.length; i++) {
			System.out.println(arrayS[i]);
			System.out.println(arrayC[i]);
		}

	}

}
