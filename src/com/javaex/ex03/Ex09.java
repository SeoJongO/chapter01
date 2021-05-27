package com.javaex.ex03;
import java.util.Scanner;
public class Ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("과목을 선택하세요");
		System.out.println("(1.JAVA 2.C 3.C++ 4.PYTHON)");
		System.out.print("과목번호: ");
		char num = sc.next().charAt(0);
		if (num=='A') {
			System.out.println("R101호");
		}
		else if (num=='B') {
			System.out.println("R202호");
		}
		else if (num=='C') {
			System.out.println("R303호");
		}
		else if (num=='D') {
			System.out.println("R404호");
		}
		else {
			System.out.println("상담원에게 문의하세요");
		}
		sc.close();
	}

}
