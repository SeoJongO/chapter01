package com.javaex.ex05;

public class Ex07 {

	public static void main(String[] args) {
		int[] arrA = new int [3];
		arrA[0] = 3;
		arrA[1] = 6;
		arrA[2] = 9;
		
		int[] arrB = new int [3];
		
		arrB[0] = arrA[0];
		arrB[1] = arrA[1]; 
		arrB[2] = arrA[2]; 
		
		arrA[1] = 100;
		System.out.println("arrA");
		for (int i = 0; i < arrA.length; i++) {
			System.out.println(arrA[i]);
		}
		System.out.println("arrB");
		for (int i = 0; i < arrA.length; i++) {
			System.out.println(arrB[i]);
		}
	}

}
