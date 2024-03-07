package kr.ac.kopo.day03.homework;

import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		
		final double 원주율 = 3.141592;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("반지름 입력: ");
		int r = sc.nextInt();
		sc.nextLine();
		
		double result = r * r * 원주율; 
		
		System.out.printf("반지름이 %d일때 원의 면적은 %f입니다.", r, result);
		
	}

}
