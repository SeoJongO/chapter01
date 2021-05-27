package com.javaex.ex04;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean action = true;
		
		Scanner sc = new Scanner(System.in);
		
		
		
		while (action) {
			System.out.println("숫자를 입력하세요");
			int x = sc.nextInt();
			if (x==0) {
				System.out.println("종료");
				action=false;
			} else if (x%3==0) {
				System.out.println("3의 배수입니다.\n");
			} else {
				System.out.println("3의 배수가 아닙니다.\n");
			}
			
		}
		sc.close();
	}
}