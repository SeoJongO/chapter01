package com.javaex.ex04;

public class Ex08 {

	public static void main(String[] args) {

		int x = 1;

		while (true) {

			if (x % 6 == 0 && x % 14 == 0) {
				break;
			}
			x++;
		}
		System.out.println(x);
	}

}
