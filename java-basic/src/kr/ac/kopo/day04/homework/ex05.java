package kr.ac.kopo.day04.homework;

import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		    System.out.print(" 2~10 사이의 정수 입력 : ");
		
	        int num = sc.nextInt();
	        sc.nextLine();
	        
	        System.out.printf( " < 1 ~ 100 사이에 %d의 배수 출력 >\n" , num);
	        
	        /*
				예찬씨 아래 코드 반복문 안도는 것처럼 보일터인데........
				for() 뒤에 ;도 붙어있고...... 한번 다시 생각해봅시다
			*/
	        
	        int cnt = 0;
	        for (int i = 1 ; i < 101 ; i++) {
	        if(i % num == 0) {
	        System.out.print( i + " " );
	        ++cnt;
	        
	        
	        }
	}
            
	        System.out.println();
            System.out.println("총 개수 : " + cnt + "개");
	}    
}