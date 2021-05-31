package com.javaex.ex05;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] num = new int[6];
		
		for (int i = 0; i <6; i++) {
			num[i] = (int) (Math.random() * 45) + 1;
			System.out.print(num[i] + " ");
		}
		
//		num[0] = (int) (Math.random() * 45) + 1;
//		num[1] = (int) (Math.random() * 45) + 1;
//		num[2] = (int) (Math.random() * 45) + 1;
//		num[3] = (int) (Math.random() * 45) + 1;
//		num[4] = (int) (Math.random() * 45) + 1;
//		num[5] = (int) (Math.random() * 45) + 1;
		
		System.out.println("");
		System.out.println("=================");
		
		System.out.println(num[0]+" "+num[1]+" "+num[2]+" "+num[3]+" "+num[4]+" "+num[5]);

//		for (int i = 0; i < 6; i++) {
//			System.out.print(num[i] + " ");
//		}
	}

}
