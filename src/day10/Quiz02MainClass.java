package day10;

public class Quiz02MainClass {

	public static void main(String[] args) {
		/*
		�� ���� �Է¹޾� ���� ���
		�Է�, ���, ����, ���� ������� ����� �ּ���.
		- �迭 Ȱ��
		return a,b,c; (X)
		 */
		Quiz02TestClass t = new Quiz02TestClass();
		int[] a = t.input();
		int s = t.op( a );
		t.print(a[0], a[1], s);
		
		
	}

}
