package day10;

import java.util.Scanner;

public class Quiz01TestClass {
	
	public String input() {//리턴 변수에 맞는 자료형으로 리턴값을 정해준다.
		Scanner sc = new Scanner(System.in);
		String name;
		System.out.print("이름 입력 : ");
		name = sc.next();
		
		return name;
	}
	
	public void print(String name) {
		System.out.println("당신의 이름은 " + name + "\n");
	}
	
	public String[] input02() {
		Scanner sc = new Scanner(System.in);
		String[] nameArr = new String[3];
		for(int i=0; i<nameArr.length; i++) {
			System.out.print(i + ".이름 입력 : ");
			nameArr[i] = sc.next(); 
		}
		
		return nameArr;
	}
	
	public void print02(String[] nameArr) {
		System.out.println("===이름 출력===");
		for(int i=0; i<nameArr.length; i++) {
			System.out.println(i + "." + nameArr[i]);
		}
	}

}
