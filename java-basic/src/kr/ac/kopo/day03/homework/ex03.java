package kr.ac.kopo.day03.homework;

import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		
		final double ������ = 3.141592;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է�: ");
		int r = sc.nextInt();
		sc.nextLine();
		
		double result = r * r * ������; 
		
		System.out.printf("�������� %d�϶� ���� ������ %f�Դϴ�.", r, result);
		
	}

}
