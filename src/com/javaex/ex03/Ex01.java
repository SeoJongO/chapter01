package com.javaex.ex03;
import java.util.Scanner;
public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("근무시간: ");
		int time = sc.nextInt();
		if (time<0) {
			System.out.println(time*10000);
		}
		else if (time>8) {
			System.out.println(80000+(time-8)*12000);
		}
		else {
			System.out.println("다시 입력 바랍니다.");
		}
		sc.close();
	}

}
