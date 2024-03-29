package BOJ;

import java.util.Scanner;

public class boj9086add {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = Integer.parseInt(sc.nextLine());

		String[] result = new String[a];

		for (int i = 0; i < a; i++) {
			String str = sc.next();
			result[i] = Character.toString(str.charAt(0));
			result[i] += str.charAt(str.length() - 1);
		}

		for (String s : result)
			System.out.println(s);
	}
}
