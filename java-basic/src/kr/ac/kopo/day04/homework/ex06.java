package kr.ac.kopo.day04.homework;

import java.util.Scanner;

/*
 	1's ���� : 90
	90���� ������ A�Դϴ�
	
	2's ���� : 37
	37���� ������ F�Դϴ�
	
	3's ���� : 89
	89���� ������ B�Դϴ�
	
	4's ���� : 1000
	�߸��Է��ϼ̽��ϴ�
	
	5's ���� : 96
	96���� ������ A�Դϴ�
 */
public class ex06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 1; i <= 5; i++) {
			System.out.print(i + "\'s ���� �Է� : ");
			int score = Integer.parseInt(sc.nextLine());

			if(score >= 0 && score <= 100) {
				if (score >= 90) {
					System.out.printf("%d\'s ������ A\n", score);
				} else if (score >= 80) {
					System.out.println(score + "\'s ������ B");
				} else if (score >= 70) {
					System.out.println(score + "\'s ������ C");
				} else if (score >= 60) {
					System.out.println(score + "\'s ������ D");
				} else {
					System.out.println(score + "\'s ������ F");
				}
			} else {
				System.out.println("�߸��Է��߽��ϴ�");
			}
		}
	}
}

