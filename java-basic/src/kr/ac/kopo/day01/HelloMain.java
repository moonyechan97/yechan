package kr.ac.kopo.day01;

/**
 * print(), printf() �������� �˾ƺ��ô�
 * 
 * @author ȫ�浿
 * @version 0.1
 */
public class HelloMain {

	/**
	 * �����ϱ� ���� �޼ҵ�
	 * @param args �Է°�
	 */
	public static void main(String[] args) {
		
		// 3 + 4
		System.out.print(3);
		System.out.print(' ');
		System.out.print('+');
		System.out.print(' ');
		System.out.print(4);
		System.out.println();
		System.out.println(3 + " + " + 4);
		System.out.printf("[%4d] %c %d\n", 3, '+', 4);
		System.out.printf("[%-4d] %c %d\n", 3, '+', 4);
		System.out.printf("[%04d] %c %d\n", 3, '+', 4);
	}
}
