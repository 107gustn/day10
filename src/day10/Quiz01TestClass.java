package day10;

import java.util.Scanner;

public class Quiz01TestClass {
	
	public String input() {//���� ������ �´� �ڷ������� ���ϰ��� �����ش�.
		Scanner sc = new Scanner(System.in);
		String name;
		System.out.print("�̸� �Է� : ");
		name = sc.next();
		
		return name;
	}
	
	public void print(String name) {
		System.out.println("����� �̸��� " + name + "\n");
	}
	
	public String[] input02() {
		Scanner sc = new Scanner(System.in);
		String[] nameArr = new String[3];
		for(int i=0; i<nameArr.length; i++) {
			System.out.print(i + ".�̸� �Է� : ");
			nameArr[i] = sc.next(); 
		}
		
		return nameArr;
	}
	
	public void print02(String[] nameArr) {
		System.out.println("===�̸� ���===");
		for(int i=0; i<nameArr.length; i++) {
			System.out.println(i + "." + nameArr[i]);
		}
	}

}
