package day10;

public class Quiz01MianClass {

	public static void main(String[] args) {
		/*
		3���� �̸��� �Է¹޾� ����ϴ� ���α׷��� ���弼��.
		�Է±��, ��±��, ����
		*/
		Quiz01TestClass t = new Quiz01TestClass();
		String n = t.input();
		t.print( n );
		
		String[] str = t.input02();
		t.print02( str );
		
	}

}
