package java_quiz;

import java.util.Scanner;

public class ex03 {
/*	���� ������ �Է¹޾� 
	90 ~ 100���� A, 80 ~ 89���� B, 70 ~ 79���� C, 
	60 ~ 69���� D, ������ ������ F�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	*/
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int point =0;
		
		System.out.println("���� ������ �Է��ϼ��� : ");
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
