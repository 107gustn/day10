package day10;

import java.util.ArrayList;

public class Quiz03MainClass {

	public static void main(String[] args) {
		//���� 2�� ArrayList�� ��ȯ
		Quiz03TestClass t = new Quiz03TestClass();
		
		ArrayList arr = t.input();
		
		int sum = t.op(arr);
		t.print(arr, sum);

	}

}
