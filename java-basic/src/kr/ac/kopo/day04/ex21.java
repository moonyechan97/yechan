package kr.ac.kopo.day04;

import java.util.Scanner;

public class ex21 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 2 ; i <= 9 ; i++) {
		    System.out.println("*** " + i + "´Ü ***");
		
		for (int j = 1 ; j <= 9 ; j++) {
			System.out.printf("%d * %d = %d\n", i,j,i*j);
		}
	    System.out.println();
	       }
	    
	    
	}

}