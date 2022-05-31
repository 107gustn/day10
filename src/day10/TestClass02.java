package day10;

public class TestClass02 {
	public void sumFunc(int num1, int num2) { //메소드(매개변수; argument)
		
		int sum = num1 + num2;
		System.out.println("두 수의 합 : " + sum);
	}
	
	public void test(int n, String s) { //메소드에 가지고 온 값을 해당 변수에 저장 //넘어오는 변수와 받아오는 변수를 서로 맞춰줘야 한다.
		System.out.println(n + s + " : test호출");
	}
}
