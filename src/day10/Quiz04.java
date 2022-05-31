package day10;

public class Quiz04 {
	public static void main(String[] args) {
		
		/*
		로또 프로그램 만들어보세요. - 랜덤한 숫자 1~45까지의 숫자 중 중복되지 않는 6개의 숫자
		*/
		for (int i = 0; i < 6; i++) {
			int ran = (int) (Math.random() * 45) + 1;
			System.out.println(ran);
		}
	}
}
