package java_quiz;

import java.util.Scanner;

public class ex04 {
//N�� �Է¹��� ��, ������ N���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. ��� ���Ŀ� ���缭 ����ϸ� �ȴ�.
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	
		int num =0;
		
		System.out.println("���ڸ� �Է��ϼ��� : ");
		num = input.nextInt();
		if(num>0) {
			for( int i=1;i<10 ;i++ ) {
				System.out.println(num+"*"+i+"="+(num*i));
			}
		}
	}
}
