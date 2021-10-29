package java_quiz;

import java.util.Scanner;

public class ex05 {
//두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int A = 0 ;
		int B = 0 ;
		
		System.out.println("A의 값을 입력하세요 : ");
		A = input.nextInt();
		System.out.println("B의 값을 입력하세요 : ");
		B = input.nextInt();
		
		System.out.println(A+"+"+B+"="+(A+B));
	}
}
