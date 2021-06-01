package com.javaex.ex05;

public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = new int[3];
		A[0] = 10;
		A[1] = 20;
		A[2] = 30;
		int[] B = new int[4];
		B[0] = 10;
		B[1] = 20;
		B[2] = 70;

		if (A.length == B.length) {
			for (int i = 0; i < A.length; i++) {
				if (A[i] != B[i]) {
					System.out.println(i + "번째 값이 다릅니다.");
				}
			}
		} else {
			System.out.println("배열의 크기가 다릅니다.");
		}

	}

}
