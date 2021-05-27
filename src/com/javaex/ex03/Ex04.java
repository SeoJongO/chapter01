package com.javaex.ex03;
import java.util.Scanner;
public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하세요: ");
		int point = sc.nextInt();
		
		if (point>=90) {
			System.out.println("A등급 입니다.");
		}
		else if (point>=80) {
			System.out.println("B등급 입니다.");
		}
		else if (point>=70) {
			System.out.println("C등급 입니다.");
		}
		else if (point>=60) {
			System.out.println("D등급 입니다.");
		}
		else {
			System.out.println("F등급 입니다.");
		}
		
		sc.close();
	}

}
