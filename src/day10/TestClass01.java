package day10;

import java.util.Scanner;

public class TestClass01 { //Ŭ���� ����
	public void sumFunc() { //���������� ��ȯŸ�� �޼ҵ� //�޼ҵ� �̸��� �´� ������ �־��ش�
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		System.out.print("�� �Է� : ");
		num1 = sc.nextInt();
		System.out.print("�� �Է� : ");
		num2 = sc.nextInt();
		int sum = num1 + num2;
		System.out.println("�� ���� �� : " + sum);
	}//���� �� �޼ҵ带 ȣ���ߴ� �������� �ǵ��ư�
}
