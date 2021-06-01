package com.javaex.ex01;

public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int num3 = 1;
//		float num4 = 1.1f;
//		float resultf = num3 + num4;
//		
//		System.out.println(resultf);
		
		//자동형변환1 : 자동형변환 규칙을 알아야 자료형을 결정할 수 있다
		System.out.println(2+3.5);
		double var01 = 2+3.5; //자료형을 알아야 한다
		System.out.println(var01);
		
		//자동형변환 (long + float)
		long var02 = 12345;
		float var03 = 1.1F;
		float result01 = var02 + var03; //long -> float 자동 변환
		System.out.println(result01);
		
		System.out.println("--------------------");
		
		//강제형변환
		int var04 = (int) 3.14;
		System.out.println(var04);
		
		//확대변환
		byte var05 = 10;
		int result02 = (int) var05;
		System.out.println(result02);
		
		//축소변환
		int var06 = 10;
		byte result03 = (byte) var06;
		System.out.println(result03);
		
		//축소변화 비교
		int var07 = 128;
		byte result04 = (byte) var07;
		System.out.println(result04);
	
		//실수 -> 정수 : 소수점 없어짐
		double var08 = 5.57;
		int result05 = (int) var08;
		System.out.println(result05);
		
		//정수 -> 실수 : 실수형으로 보여줌
		int var09 = 7;
		double result06 = (double) var09;
		System.out.println(result06);
		
		
	}

}
