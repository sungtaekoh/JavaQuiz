package java_quiz;

import java.util.Scanner;

public class ex09 {
	public static void main(String[] args) {
		//while문
		/*
		 *	 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
		 */
		Scanner input = new Scanner(System.in);
		int a= 0;
		int b= 0;
		int c= 0;
		while(true) {
		System.out.println("A를 입력하세요 : ");
		a = input.nextInt();
		System.out.println("B를 입력하세요 : ");
		b = input.nextInt();
				System.out.println("A+B="+(a+b));
		}
	}
}
