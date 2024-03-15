package kr.ac.kopo.day04;

public class ex19 {

	public static void main(String[] args) {
		
		for (int i = 1 ; i <= 7 ; i++) {
			if (i <= 3) {
				for (int j = 1 ; j <= i ; j++) {
					System.out.print('*');
				}
				for (int j = 1 ; j <= 7-2*i ; j++) {
					System.out.print(' ');
				}
				for (int j = 1 ; j <= i ; j++) {
					System.out.print('*');
				}
			} else if (i == 4) {
				for (int j = 1 ; j <= 7 ; j++) {
					System.out.print('*');
				}
			} else {
				for (int j = 1 ; j <= 8-i ; j++) {
					System.out.print('*');
				}
				for (int j = 1 ; j <= 2*i-9 ; j++) {
					System.out.print(' ');
				}
				for (int j =1 ; j <= 8-i ; j++) {
					System.out.print('*');
				}
			}
			System.out.println();
		}

	}

}


