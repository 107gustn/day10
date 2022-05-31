package day10;

public class Quiz01MianClass {

	public static void main(String[] args) {
		/*
		3명의 이름을 입력받아 출력하는 프로그램을 만드세요.
		입력기능, 출력기능, 메인
		*/
		Quiz01TestClass t = new Quiz01TestClass();
		String n = t.input();
		t.print( n );
		
		String[] str = t.input02();
		t.print02( str );
		
	}

}
