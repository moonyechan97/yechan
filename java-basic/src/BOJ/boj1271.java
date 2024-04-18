package BOJ;

import java.math.BigInteger;
import java.util.Scanner;

public class boj1271 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		BigInteger A = sc.nextBigInteger();
		BigInteger B = sc.nextBigInteger();

		System.out.println(A.divide(B));
		System.out.println(A.remainder(B));
	}
}