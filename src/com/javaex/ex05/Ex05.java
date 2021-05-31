package com.javaex.ex05;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = new int[3];
		
		A[0] = 1;
		A[1] = 2;
		// A[2] = 3;
		//정답
		for(int i = 0; i<A.length;i++) {
			System.out.println(A[i]);
		}
		//실수 <=
		for(int i = 0; i<=A.length;i++) {
			System.out.println(A[i]);
		}
		//없는방쓸때
		for(int i = 0; i<A.length;i++) {
			System.out.println(A[i]);
		}
	}

}
