package BOJ;

import java.util.Scanner;

public class boj10872 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int i = sc.nextInt();

		int ans = 1;

		while (i != 0) {
			ans = ans * i;
			i--;

		}
		System.out.println(ans);
	}
}