package com.javaex.ex03;
import java.util.Scanner;
public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("과목을 선택하세요");
		System.out.println("(1.JAVA 2.C 3.C++ 4.PYTHON)");
		System.out.print("과목번호: ");
		String num = sc.nextLine();
		
		switch(num) {
			case "A":
				System.out.println("R101");
				break;
			case "B":
				System.out.println("R202");
				break;
			case "C":
				System.out.println("R303");
				break;
			case "D":
				System.out.println("R404");
				break;
			default :
				System.out.println("상담원에게 문의하세요");
				break;
		}
		sc.close();
	}

}
