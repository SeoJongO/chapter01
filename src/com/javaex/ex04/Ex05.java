package com.javaex.ex04;
public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int dan=1; dan<=9; dan++) {
			
			for (int i=1; i<=9;i++) {
				int result = dan * i;
				System.out.println(dan+"*"+i+"="+result);
				if(i==10) {
					dan++;
					i=1;
				}
			}

			
			
			
			
		}
	}

}
