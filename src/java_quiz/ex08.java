package java_quiz;

import java.util.Scanner;

public class ex08 {
	public static void main(String[] args) {
/*
 * for문
 *자연수 N이 주어졌을 때, 1부터 N까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.
 */
		Scanner input = new Scanner(System.in);
	int N =0;
	int sum=0;
	
	System.out.println("숫자를 입력해 주세요 : ");
	N = input.nextInt();
	for(int a=0;a<=N;a++) {
		sum+=a;
	}
	System.out.println("합계 : "+sum);
	}	
}
