package com.javaex.practice;

public class Ex06 {

	public static void main(String[] args) {

		for (int i = 1; i <= 100; i++) {		//	1에서 100까지
			
			if (i % 5 == 0 && i % 7 == 0) {		//	5의 배수이면서 7의 배수
				System.out.println(i);
			}

		}

	}

}
