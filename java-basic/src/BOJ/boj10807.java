package BOJ;

import java.util.Scanner;

public class boj10807 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] arr = new int[N];
		int count = 0;

		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}

		int a = sc.nextInt();

		for (int i = 0; i < arr.length; i++) {
			if (a == arr[i])
				count += 1;
		}
		System.out.println(count);
	}
}