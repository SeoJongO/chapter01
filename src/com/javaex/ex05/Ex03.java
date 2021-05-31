package com.javaex.ex05;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = new int[6];
		
		for (int i = 0; i <num.length; i++) {
			num[i] = (int) (Math.random() * 45) + 1;
			System.out.print(num[i] + " ");
		}
	}

}
