package kr.ac.kopo.day03.homework;

import java.util.Scanner;

public class ex07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ĺ��� �Է� : ");
		char ch = sc.nextLine().charAt(0);
		
		System.out.println("�Է¹��� ���� : " + ch);
		
		if(ch >= 'A' && ch <= 'Z') {
//			ch = (char)(ch + 32);
			ch = (char)(ch + 'a' - 'A');
		} else if(ch >= 'a' && ch <= 'z') {
			ch = (char)(ch  + 'A' - 'a');
		}
		
		System.out.println("��ȯ�� ���� : " + ch);
	}
}

