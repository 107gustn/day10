package day10;

public class TestClass03 {
	
	public int sumFunc(int num1, int num2) {
		int sum = num1 + num2;
		return sum;
	}

	public String test() { //반환타입은 돌려주고자 하는 타입으로 설정해준다.
		System.out.println("test호출");
		return "12345"; //메소드 종료 //돌려주고자 하는 특정 값이 있다면 값을 돌려준다.
	}

}
