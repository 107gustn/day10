package day10;

public class Quiz04 {
	public static void main(String[] args) {
		
		/*
		�ζ� ���α׷� ��������. - ������ ���� 1~45������ ���� �� �ߺ����� �ʴ� 6���� ����
		*/
		for (int i = 0; i < 6; i++) {
			int ran = (int) (Math.random() * 45) + 1;
			System.out.println(ran);
		}
	}
}
