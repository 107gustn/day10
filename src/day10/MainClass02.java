package day10;

import java.util.Scanner;

public class MainClass02 {
	public static void main(String[] args) {

		TestClass02 t01 = new TestClass02(); //객체 생성
		int n = 1000;
		t01.test(1000, "안녕하세요"); //메소드 호출이 되면 1000, "안녕하세요" 데이터 값을 가지고 메소드를 찾아감
		
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		System.out.print("수 입력 : ");
		num1 = sc.nextInt();
		System.out.print("수 입력 : ");
		num2 = sc.nextInt();
		
		t01.sumFunc(num1, num2); //메소드(파라미터; 인자값) //메소드가 호출될 때 값을 가지고 해당 메소드 찾아감
		
	}

}
