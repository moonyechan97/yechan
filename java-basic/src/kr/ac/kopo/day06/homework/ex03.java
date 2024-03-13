package kr.ac.kopo.day06.homework;

import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] score = new int[5];	// [0] ~ [4, score.length-1]
		
		for(int i = 0; i < score.length; i++) {
			System.out.print(i+1 + "\'s score : ");
			score[i] = Integer.parseInt(sc.nextLine()); 
		}
		
		int total = 0;
		
		System.out.println("< PRINT >");
		System.out.println("--------------------------");
		System.out.println("��ȣ\t����\t����");
		System.out.println("--------------------------");
		for(int i = 0; i < score.length; i++) {
			if(score[i] >= 0 && score[i] <= 100) {
				
				total = total + score[i];
				
				char grade = 'F';
				switch(score[i] / 10) {
				case 10 : case 9 :
					grade = 'A';
					break;
				case 8 : 
					grade = 'B';
					break;
				case 7 : 
					grade = 'C';
					break;
				case 6 : 
					grade = 'D';
				}
				System.out.println(i+1 + "\t" + score[i] + "\t" + grade);
			} else {
				System.out.println(i+1 + "\tERROR!!!");
			}
		}
		System.out.println("--------------------------");
		System.out.println("��  �� : " +  total + "��");
//		System.out.printf("��  �� : %.2f��\n", total / 5.);
		System.out.printf("��  �� : %.2f��\n", (double)total / score.length);
	}
}