package kr.ac.kopo.day15;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Random;

public class ExceptionMain05 {

	public static void a() {
		
		try {
			FileReader fr = new FileReader("a.txt");
		} catch(FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		}
		
	}
	public static void b() throws Exception {
		
		Random r = new Random();
		int random = r.nextInt(3);
		int[] nums = new int[2];
		nums[random] = random;
		
		String str = null;
		System.out.println(str.length());
	}
	
	public static void main(String[] args) {
		
		System.out.println("---------- start ----------");
		a();
		try {
			b();
		} catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("---------- end ----------");	
	}
}
