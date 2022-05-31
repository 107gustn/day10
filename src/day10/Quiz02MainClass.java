package day10;

public class Quiz02MainClass {

	public static void main(String[] args) {
		/*
		두 수를 입력받아 합을 출력
		입력, 출력, 연산, 메인 기능으로 만들어 주세요.
		- 배열 활용
		return a,b,c; (X)
		 */
		Quiz02TestClass t = new Quiz02TestClass();
		int[] a = t.input();
		int s = t.op( a );
		t.print(a[0], a[1], s);
		
		
	}

}
