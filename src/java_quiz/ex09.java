package java_quiz;

import java.util.Scanner;

public class ex09 {
	public static void main(String[] args) {
		//while��
		/*
		 *	 �� ���� A�� B�� �Է¹��� ����, A+B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 */
		Scanner input = new Scanner(System.in);
		int a= 0;
		int b= 0;
		int c= 0;
		while(true) {
		System.out.println("A�� �Է��ϼ��� : ");
		a = input.nextInt();
		System.out.println("B�� �Է��ϼ��� : ");
		b = input.nextInt();
				System.out.println("A+B="+(a+b));
		}
	}
}
