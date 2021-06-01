package com.javaex.ex05;

public class Ex10 {

	public static void main(String[] args) {

		if (args.length > 0) {
			if (args[0].equals("-version")) {
				System.out.println("Exil 버전 : 3.4343");
			} else if (args[0].equals("-help")) {
				System.out.println("도움말");
				System.out.println("[-version] : 버전정보를 확인할 수 있습니다");
				System.out.println("[-help] : 도움말을 볼 수 있습니다.");
			} else {
				for (int i = 0; i < args.length; i++) {
					System.out.println(i + "번째 값: " + args[i]);
				}
			}
		}
	}
}
