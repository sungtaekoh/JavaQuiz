package java_quiz;

import java.util.Scanner;

// �� ���� A�� B�� �־����� ��, A�� B�� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
public class ex02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int A = 0;
		int B = 0;
		
		
		System.out.println("A�� ���� �Է��ϼ��� : ");
		A = input.nextInt();
		System.out.println("B�� ���� �Է��ϼ��� : ");
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
