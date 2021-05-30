package com.javaex.ex04;

public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 20; i++) {
			if (i % 2 == 0 || i % 3 == 0) {
				continue;
			}
			System.out.println(i);
		}
		System.out.println("==============");

		for (int c = 1; c <= 20; c++) {
			if (c % 2 == 0 || c % 3 == 0) {
			} else {

				System.out.println(c);
			}

		}
		System.out.println("==============");

		for (int c = 1; c <= 20; c++) {
			if (!(c % 2 == 0 || c % 3 == 0)) {
				System.out.println(c);
				}

				

	}
}
}