package kr.ac.kopo.day04.homework;

import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		    System.out.print(" 2~10 ������ ���� �Է� : ");
		
	        int num = sc.nextInt();
	        sc.nextLine();
	        
	        System.out.printf( " < 1 ~ 100 ���̿� %d�� ��� ��� >\n" , num);
	        
	        /*
				������ �Ʒ� �ڵ� �ݺ��� �ȵ��� ��ó�� �������ε�........
				for() �ڿ� ;�� �پ��ְ�...... �ѹ� �ٽ� �����غ��ô�
			*/
	        
	        int cnt = 0;
	        for (int i = 1 ; i < 101 ; i++) {
	        if(i % num == 0) {
	        System.out.print( i + " " );
	        ++cnt;
	        
	        
	        }
	}
            
	        System.out.println();
            System.out.println("�� ���� : " + cnt + "��");
	}    
}