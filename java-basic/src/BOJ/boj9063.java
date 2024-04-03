package BOJ;

import java.util.Scanner;

public class boj9063 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();

		int MaxX = -10000;
		int MaxY = -10000;
		int MinX = 10000;
		int MinY = 10000;

		while (a-- > 0) {
			int x = 0, y = 0;

			int X = sc.nextInt();
			int Y = sc.nextInt();

			if (MaxX <= X) {
				MaxX = X;
			}
			if (MaxY <= Y) {
				MaxY = Y;
			}
			if (MinX >= X) {
				MinX = X;
			}
			if (MinY >= Y)
				MinY = Y;
		}
		int X = MaxX - MinX;
		int Y = MaxY - MinY;

		System.out.println(X * Y);
	}
}
