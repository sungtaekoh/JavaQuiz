package java_quiz;

import java.util.Scanner;

public class ex05 {
//�� ���� A�� B�� �Է¹��� ����, A+B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int A = 0 ;
		int B = 0 ;
		
		System.out.println("A�� ���� �Է��ϼ��� : ");
		A = input.nextInt();
		System.out.println("B�� ���� �Է��ϼ��� : ");
		B = input.nextInt();
		
		System.out.println(A+"+"+B+"="+(A+B));
	}
}
