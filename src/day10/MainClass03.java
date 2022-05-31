package day10;

import java.util.Scanner;

public class MainClass03 {
	public static void main(String[] args) {

		TestClass03 t01 = new TestClass03(); //객체 생성
		
		String s = t01.test(); //메소드 호출 //메소드로부터 돌아온 값을 변수에 저장하여 사용할 수 있다.
		System.out.println("리턴 : " + s);
		
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		System.out.print("수 입력 : ");
		num1 = sc.nextInt();
		System.out.print("수 입력 : ");
		num2 = sc.nextInt();
		
		int ss = t01.sumFunc(num1, num2);
		System.out.println("두 수 합 : " + ss);
		
	}

}
