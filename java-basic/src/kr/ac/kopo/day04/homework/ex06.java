package kr.ac.kopo.day04.homework;

import java.util.Scanner;

/*
 	1's 성적 : 90
	90점의 학점은 A입니다
	
	2's 성적 : 37
	37점의 학점은 F입니다
	
	3's 성적 : 89
	89점의 학점은 B입니다
	
	4's 성적 : 1000
	잘못입력하셨습니다
	
	5's 성적 : 96
	96점의 학점은 A입니다
 */
public class ex06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 1; i <= 5; i++) {
			System.out.print(i + "\'s 성적 입력 : ");
			int score = Integer.parseInt(sc.nextLine());

			if(score >= 0 && score <= 100) {
				if (score >= 90) {
					System.out.printf("%d\'s 학점은 A\n", score);
				} else if (score >= 80) {
					System.out.println(score + "\'s 학점은 B");
				} else if (score >= 70) {
					System.out.println(score + "\'s 학점은 C");
				} else if (score >= 60) {
					System.out.println(score + "\'s 학점은 D");
				} else {
					System.out.println(score + "\'s 학점은 F");
				}
			} else {
				System.out.println("잘못입력했습니다");
			}
		}
	}
}

