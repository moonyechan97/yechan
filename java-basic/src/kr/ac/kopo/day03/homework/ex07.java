package kr.ac.kopo.day03.homework;

import java.util.Scanner;

public class ex07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("알파벳을 입력 : ");
		char ch = sc.nextLine().charAt(0);
		
		System.out.println("입력받은 문자 : " + ch);
		
		if(ch >= 'A' && ch <= 'Z') {
//			ch = (char)(ch + 32);
			ch = (char)(ch + 'a' - 'A');
		} else if(ch >= 'a' && ch <= 'z') {
			ch = (char)(ch  + 'A' - 'a');
		}
		
		System.out.println("변환된 문자 : " + ch);
	}
}

