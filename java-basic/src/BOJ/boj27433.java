package BOJ;

import java.util.Scanner;

public class boj27433 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		System.out.println(fact(n));
	}

	public static long fact(long n) {
		if (n == 0) {
			return 1;
		} else {
			return n * fact(n - 1);
		}
	}
}