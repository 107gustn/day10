package day10;

public class MainClass04 {

	public static void main(String[] args) {
		
		/*
		오버로딩
		- 동일한 이름의 메소드를 만드는것
		- 이름이 같은 메소드를 구별하기 위해서는 매개변수에 따라 구분한다.
		- 매개변수의 개수 또는 타입이 서로 다르면 다른 메소드로 인식
		*/
		TestClass04 t = new TestClass04();
		
		//메소드 오버로딩
		t.SumFunc(10, 20);
		t.SumFunc(10, 20.222);
		t.sumFunc( 12345 );
		
		
		//랜덤 수 (0.0 ~ 0.9)
		for(int i=0; i<5; i++) {
			int ran = (int)(Math.random()*3)+10;
			System.out.println( ran );
		}

	}

}
