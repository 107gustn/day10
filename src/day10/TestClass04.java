package day10;

public class TestClass04 {
	//오버로딩 - 매개변수가 다르면 다른 메소드로 인식
	public void SumFunc(int a, int b) {
		System.out.println("int, int");
		System.out.println(a + b);
	}
	public void sumFunc(int a) {
		System.out.println("a값 : " + a);
	}
	public void SumFunc(int a, double b) {
		System.out.println("int, double");
		System.out.println(a + b);
	}
}
