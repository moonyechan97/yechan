package BOJ;

import java.util.Scanner;

public class boj16561 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt() / 3;
		int cnt = 0;

		for (int i = 1; i <= A; i++) {
			for (int j = 1; j <= A - i; j++) {
				if (A - i - j > 0) {
					cnt++;
				}
			}
		}
		System.out.println(cnt);
	}

}
