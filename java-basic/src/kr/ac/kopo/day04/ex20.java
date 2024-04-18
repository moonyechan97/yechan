package kr.ac.kopo.day04;

import java.util.Scanner;

public class ex20 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("1 - 9 : ");

		int num = sc.nextInt();

		for (int i = 1; i <= 9; i++) {
			System.out.println(num + " * " + i + " = " + num * i);
		}
	}
}