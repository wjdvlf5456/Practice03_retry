package com.javaex.practice;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double answer = (int) (Math.random() * 100);

		System.out.println("==============================");
		System.out.println("       [숫자맞추기게임 시작]       ");
		System.out.println("==============================");
		while (true) {
			System.out.print(">>");
			int num = sc.nextInt();
			if (num > answer) {
				System.out.println("더 낮게");

			} else if (num < answer) {
				System.out.println("더 높게");

			} else if (num == answer) {
				System.out.println("맞았습니다.");
				System.out.print("게임을 종료하시겠습니까?(y/n)");
				System.out.println("\t>>");

				String yesno = sc.next();
				if (yesno.equals("y")) {
					System.out.println("==============================");
					System.out.println("       [숫자맞추기게임 종료]       ");
					System.out.println("==============================");
					break;

				} else if (yesno.equals("n")) {
					System.out.println("==============================");
					System.out.println("       [숫자맞추기게임 시작]       ");
					System.out.println("==============================");
					continue;

				} else {
					System.out.println("다시 입력해주세요");
					continue;

				}

			}

		}

		sc.close();
	}

}
