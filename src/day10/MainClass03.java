package day10;

import java.util.Scanner;

public class MainClass03 {
	public static void main(String[] args) {

		TestClass03 t01 = new TestClass03(); //��ü ����
		
		String s = t01.test(); //�޼ҵ� ȣ�� //�޼ҵ�κ��� ���ƿ� ���� ������ �����Ͽ� ����� �� �ִ�.
		System.out.println("���� : " + s);
		
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		System.out.print("�� �Է� : ");
		num1 = sc.nextInt();
		System.out.print("�� �Է� : ");
		num2 = sc.nextInt();
		
		int ss = t01.sumFunc(num1, num2);
		System.out.println("�� �� �� : " + ss);
		
	}

}
