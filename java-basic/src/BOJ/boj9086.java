package BOJ;

import java.util.Scanner;

public class boj9086 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();

		for (int i = 0; i < a; i++) {
			String str = sc.next();

			System.out.print(str.charAt(0));
			System.out.println(str.charAt(str.length() - 1));
		}
	}
}