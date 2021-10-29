package java_quiz;

import java.util.Scanner;

// 두 정수 A와 B가 주어졌을 때, A와 B를 비교하는 프로그램을 작성하시오.
public class ex02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int A = 0;
		int B = 0;
		
		
		System.out.println("A의 값을 입력하세요 : ");
		A = input.nextInt();
		System.out.println("B의 값을 입력하세요 : ");
		B = input.nextInt();
		if(A>B) {
			System.out.println("A>B");
		}else if(A<B) {
			System.out.println("A<B");
		}else {
			System.out.println("A=B");
		}
	}
}
