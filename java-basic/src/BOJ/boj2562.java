package BOJ;

import java.util.Scanner;

public class boj2562 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int max = 0;
		int cnt = 0;
		for (int i = 1; i <= 9; i++) {
			int n = sc.nextInt();
			if (n > max) {
				max = n;
				cnt = i;
			}
		}
		System.out.println(max);
		System.out.println(cnt);
	}
}