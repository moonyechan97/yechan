package kr.ac.kopo.day03.homework;

import java.util.Scanner;

public class ex10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수 : ");
		int num01 = sc.nextInt();
		sc.nextLine();
		
		System.out.print("두번째 정수 : ");
		int num02 = sc.nextInt();
		sc.nextLine();
		
		System.out.print("세번째 정수 : ");
		int num03 = sc.nextInt();
		sc.nextLine();
	
		int max = num01;
		int min = num02;
		if(num02 > num01) {
			max = num02;
			min = num01;
		}
		if(num03 > max) {
			System.out.printf("%d > %d > %d\n", num03, max, min);
		} else if(num03 > min) {
			System.out.printf("%d > %d > %d\n", max, num03, min);
		} else {
			System.out.printf("%d > %d > %d\n", max, min, num03);
		}
		
/*		
		if(num01 > num02 && num02 > num03) {
			
		} else if(num01 > num03 && num03 > num02) {
			
		} else if(num02 > num01 && num01 > num03) {
			
		}
*/		
		
/*		
		if(num01 > num02) {
			// num01  > num02
			if(num01 > num03) {
				// num01 > num02, num03
				if(num02 > num03) {
					// num01 > num02 > num03
				} else {
					// num01 > num03 > num02
				}
			} else {
				// num03 > num01 > num02
			}
		} else {
			// num02 > num01
		}
*/		
	}
}






