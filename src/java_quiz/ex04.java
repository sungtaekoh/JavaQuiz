package java_quiz;

import java.util.Scanner;

public class ex04 {
//N을 입력받은 뒤, 구구단 N단을 출력하는 프로그램을 작성하시오. 출력 형식에 맞춰서 출력하면 된다.
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	
		int num =0;
		
		System.out.println("숫자를 입력하세요 : ");
		num = input.nextInt();
		if(num>0) {
			for( int i=1;i<10 ;i++ ) {
				System.out.println(num+"*"+i+"="+(num*i));
			}
		}
	}
}
