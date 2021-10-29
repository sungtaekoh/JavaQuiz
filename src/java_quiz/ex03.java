package java_quiz;

import java.util.Scanner;

public class ex03 {
/*	시험 점수를 입력받아 
	90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 
	60 ~ 69점은 D, 나머지 점수는 F를 출력하는 프로그램을 작성하시오.
	*/
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int point =0;
		
		System.out.println("시험 점수를 입력하세요 : ");
		point = input.nextInt();
		if(point>=90) {
			System.out.println("A");
		}else if(89<=point || point>=80){
			System.out.println("B");
		}else if(79<=point || point>=70) {
			System.out.println("C");
		}else if(69<=point || point>=60){
			System.out.println("D");
		}else {
			System.out.println("F");
		}
	}

}
