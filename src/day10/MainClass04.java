package day10;

public class MainClass04 {

	public static void main(String[] args) {
		
		/*
		�����ε�
		- ������ �̸��� �޼ҵ带 ����°�
		- �̸��� ���� �޼ҵ带 �����ϱ� ���ؼ��� �Ű������� ���� �����Ѵ�.
		- �Ű������� ���� �Ǵ� Ÿ���� ���� �ٸ��� �ٸ� �޼ҵ�� �ν�
		*/
		TestClass04 t = new TestClass04();
		
		//�޼ҵ� �����ε�
		t.SumFunc(10, 20);
		t.SumFunc(10, 20.222);
		t.sumFunc( 12345 );
		
		
		//���� �� (0.0 ~ 0.9)
		for(int i=0; i<5; i++) {
			int ran = (int)(Math.random()*3)+10;
			System.out.println( ran );
		}

	}

}
