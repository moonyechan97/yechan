package kr.ac.kopo.day06.homework;

import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] nums = new int[10];	// [0] ~ [nums.lenght-1]   [0] ~ [9]
		
		for(int i = 0; i < nums.length; i++) {
			System.out.print("num" + (i+1) + " : ");
			nums[i] = sc.nextInt();
		}
		
		for (int mod = 0; mod <= 1; mod++) {
			System.out.printf("< %s >\n", mod == 0 ? "Â¦¼ö" : "È¦¼ö");
			for (int num : nums) {
				if (num % 2 == mod)
					System.out.print(num + "  ");
			}
			System.out.println();
		}
	}
}
