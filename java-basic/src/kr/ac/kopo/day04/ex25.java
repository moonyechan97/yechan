package kr.ac.kopo.day04;

import java.util.Random;

public class ex25 {

	public static void main(String[] args) {
			
			// 20 ~ 120������ ������ ����
			Random r = new Random();
			int number = r.nextInt(101) + 20;	// 0+20 ~ 100+20
			
			System.out.println("< 1 ~ " + number + " 369���� >");
			for(int i = 1; i <= number; i++) {
				System.out.print(i + "\t");
				
				int n1 = i % 10;
				int n10 = i % 100 / 10;
				
				if(n1 == 3 || n1 == 6 || n1 == 9) {
					System.out.print("¦");
				}
				if(n10 != 0 && n10 % 3 == 0) {
					System.out.print("¦");
				}
				if(i % 10 == 0) {
					n10 = i / 10;
					while(n10-- > 0) 
						System.out.print('��');
					System.out.print("��");
				}
				
				System.out.println();
			}
			
		}
	}






