package java_quiz;

import java.util.Scanner;

public class ex08 {
	public static void main(String[] args) {
/*
 * for��
 *�ڿ��� N�� �־����� ��, 1���� N���� �� �ٿ� �ϳ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 */
		Scanner input = new Scanner(System.in);
	int N =0;
	int sum=0;
	
	System.out.println("���ڸ� �Է��� �ּ��� : ");
	N = input.nextInt();
	for(int a=0;a<=N;a++) {
		sum+=a;
	}
	System.out.println("�հ� : "+sum);
	}	
}
