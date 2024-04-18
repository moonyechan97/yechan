package BOJ;

import java.util.Scanner;

public class boj27959 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();

		if (A * 100 >= B) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}
}