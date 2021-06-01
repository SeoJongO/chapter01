package com.javaex.ex01;

public class Ex08 {

	public static void main(String[] args) {
		
		
		System.out.println("--대입연산자--");
		int a = 7;
		int b = 2;
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("--산술연산자--");
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		
		System.out.println("--산술연산자 / %--");
		System.out.println(7.0/2.0);
		System.out.println(6.1/2.0);
		System.out.println(14.0%5.0);
		
		
		System.out.println("--부호연산자--");
		int var = -3;
		int pvar = +var;
		int mvar = -var;
		System.out.println(pvar);
		System.out.println(mvar);
		
		System.out.println("--증감연산자 앞--");
		System.out.println(a);
		System.out.println(++a);
		System.out.println(b);
		System.out.println(--b);
		
		System.out.println("--증감연산자 뒤--");
		System.out.println(a); //a=8
		System.out.println(b); //b=1
		System.out.println(a++);
		System.out.println(a);
		System.out.println(b--);
		System.out.println(b);
		
		int test01 = 5;
		System.out.println(test01++ *5-3);
		System.out.println(test01);
		System.out.println(++test01 *5-3);
		System.out.println(test01);
		System.out.println(test01++ *(5+(5-3)));
		System.out.println(test01 *(5+(5-3)));
		
		char c1 = 0xD55c;
		char c2 = 54620;
		System.out.println(c1+"한"+c2);
	}

}
