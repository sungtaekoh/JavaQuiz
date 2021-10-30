package java_quiz;

import java.util.Scanner;

public class ex06 {
	public static void main(String[] args) {
		/*
		 *문제
두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
각 테스트 케이스마다 "Case #x: A + B = C" 형식으로 출력한다. 
x는 테스트 케이스 번호이고 1부터 시작하며, C는 A+B이다. 
		 */
		
		Scanner input = new Scanner(System.in);
		int A = 0;
		int B = 0;
		int C = 0;
		
		for(int X=1;;X++) {
		System.out.println("A의 값을 입력하세요 : ");
		A = input.nextInt();
		System.out.println("B의 값을 입력하세요 : ");
		B= input.nextInt();
		
		System.out.println("case #"+X+":"+A+"+"+B+"="+(A+B));
		}
	}
}
