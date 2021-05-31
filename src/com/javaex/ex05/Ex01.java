package com.javaex.ex05;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = (int)(Math.random()*45)+1;
		int num2 = (int)(Math.random()*45)+1;
		int num3 = (int)(Math.random()*45)+1;
		int num4 = (int)(Math.random()*45)+1;
		int num5 = (int)(Math.random()*45)+1;
		int num6 = (int)(Math.random()*45)+1;
		System.out.println(num1+" "+num2+" "+num3+" "+num4+" "+num5+" "+num6);
		
		for (int i=1;i<=6;i++) {
			int num = (int)(Math.random()*45)+1;
			System.out.print(num+" ");
		}
	}

}
