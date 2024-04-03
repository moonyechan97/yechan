package BOJ;

import java.util.Scanner;

public class boj1978 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int tmp;
		int cnt = 0;

		for (int i = 1; i <= N; i++) {
			tmp = sc.nextInt();
			for (int a = 2; a <= tmp; a++) {
				if (a == tmp) {
					cnt++;
				}
				if (tmp % a == 0) {
					break;
				}

			}

		}
		System.out.println(cnt);
	}
}