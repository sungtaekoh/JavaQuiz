package java_quiz;

import java.util.Scanner;

public class ex06 {
	public static void main(String[] args) {
		/*
		 *����
�� ���� A�� B�� �Է¹��� ����, A+B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
�� �׽�Ʈ ���̽����� "Case #x: A + B = C" �������� ����Ѵ�. 
x�� �׽�Ʈ ���̽� ��ȣ�̰� 1���� �����ϸ�, C�� A+B�̴�. 
		 */
		
		Scanner input = new Scanner(System.in);
		int A = 0;
		int B = 0;
		int C = 0;
		
		for(int X=1;;X++) {
		System.out.println("A�� ���� �Է��ϼ��� : ");
		A = input.nextInt();
		System.out.println("B�� ���� �Է��ϼ��� : ");
		B= input.nextInt();
		
		System.out.println("case #"+X+":"+A+"+"+B+"="+(A+B));
		}
	}
}
