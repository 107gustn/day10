package day10;

import java.util.Scanner;

public class TestClass01 { //클래스 생성
	public void sumFunc() { //접근제한자 반환타입 메소드 //메소드 이름에 맞는 내용을 넣어준다
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		System.out.print("수 입력 : ");
		num1 = sc.nextInt();
		System.out.print("수 입력 : ");
		num2 = sc.nextInt();
		int sum = num1 + num2;
		System.out.println("두 수의 합 : " + sum);
	}//종료 후 메소드를 호출했던 지역으로 되돌아감
}
