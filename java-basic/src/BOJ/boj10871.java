package BOJ;

import java.util.Scanner;

public class boj10871 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int arr[] = new int[a];

		for (int i = 0; i < a; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < a; i++) {
			if (b > arr[i]) {
				System.out.print(arr[i] + " ");
			}
		}
	}
}