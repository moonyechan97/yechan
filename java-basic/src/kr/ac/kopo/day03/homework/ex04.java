package kr.ac.kopo.day03.homework;

import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		  System.out.print("������ �Է��ϼ���: ");
		  int num1 = sc.nextInt();
		  sc.nextLine();
		
		  System.out.print("���� ���� �Է��ϼ���: ");
		  int num2 = sc.nextInt();
		  sc.nextLine();
		
		  int q = num1 / num2;
		  int r = num1 % num2;
		
		  System.out.println("�� : " + q);
		  System.out.println("������ : " + r);		

	}

}
