package kr.ac.kopo.day04;

public class ex17 {

	public static void main(String[] args) {
		
		for (int i = 1 ; i <= 9 ; i++) {
		  if (i <= 5 ) {	
			for (int j = 1 ; j <= 5-i ; j++) {
				System.out.print(' ');
			}
			for (int j = 1 ; j <= 2*i-1 ; j++) {
				System.out.print('*');
			}
		} else {
			for (int j = 1 ; j <= i-5 ; j++) {
				System.out.print(' ');
			}
			for (int j = 1 ; j <= 19-2*i ; j++) {
				System.out.print('*');
			}
		}
			System.out.println();
		}

	}
}
