package kr.ac.kopo.day03.homework;

import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ʸ� �Է� : ");
		int sec = sc.nextInt();
		sc.nextLine();
		
		// sec = 3661 ����
		int hour = sec / (60*60);
		int min = sec % (60*60) / 60;
		int s = sec % 3600 % 60;
		
		System.out.printf("%d�� : %d�ð� %d�� %d��\n", sec, hour, min, s);
		
	}
}