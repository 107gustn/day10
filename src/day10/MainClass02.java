package day10;

import java.util.Scanner;

public class MainClass02 {
	public static void main(String[] args) {

		TestClass02 t01 = new TestClass02(); //��ü ����
		int n = 1000;
		t01.test(1000, "�ȳ��ϼ���"); //�޼ҵ� ȣ���� �Ǹ� 1000, "�ȳ��ϼ���" ������ ���� ������ �޼ҵ带 ã�ư�
		
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		System.out.print("�� �Է� : ");
		num1 = sc.nextInt();
		System.out.print("�� �Է� : ");
		num2 = sc.nextInt();
		
		t01.sumFunc(num1, num2); //�޼ҵ�(�Ķ����; ���ڰ�) //�޼ҵ尡 ȣ��� �� ���� ������ �ش� �޼ҵ� ã�ư�
		
	}

}
