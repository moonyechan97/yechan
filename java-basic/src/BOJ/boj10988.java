package BOJ;

import java.util.Scanner;

public class boj10988 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		int a = 1;

		for (int i = 0; i < n.length() / 2; i++) {
			char front = n.charAt(i);
			char back = n.charAt((n.length() - 1) - i);

			if (front != back) {
				a = 0;

			}
		}
		System.out.println(a);
	}
}