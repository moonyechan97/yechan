package kr.ac.kopo.day18;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

import kr.ac.kopo.day.util.FileClose;

public class FileIOMain06 {

	public static void write() {
		Member m = new Member("hong", "홍길동", "010-1111-2222");

		FileWriter fw = null;
		PrintWriter pw = null;

		try {
			fw = new FileWriter("iotest/member.txt");
			pw = new PrintWriter(fw);

			pw.printf("%s#%s#%s\n", m.getId(), m.getName(), m.getPhone());
			pw.flush();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			FileClose.close(fw);
			FileClose.close(pw);
		}

		System.out.println("member.txt 저장완료...");

	}

	public static void read() {

		FileReader fr = null;
		BufferedReader br = null;

		try {
			fr = new FileReader("iotest/member.txt");
			br = new BufferedReader(fr);

			String data = br.readLine();
			if (data == null)
				return;

			String[] strArr = data.split("#");
			Member m = new Member(strArr[0], strArr[1], strArr[2]);
			System.out.println("읽어온 Member : " + m);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			FileClose.close(fr, br);

		}
	}

	public static void read2() {

		FileReader fr = null;
		BufferedReader br = null;

		try {
			fr = new FileReader("iotest/member.txt");
			br = new BufferedReader(fr);

			String data = br.readLine();
			if (data == null)
				return;

			StringTokenizer token = new StringTokenizer(data, "#");
			String id = token.nextToken();
			String name = token.nextToken();
			String phone = token.nextToken();
			Member m = new Member(id, name, phone);
			System.out.println("읽어온 데이터 : " + m);

			/*
			 * while(token.hasMoreElements()) { System.out.println(token.nextElement()); }
			 */

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			FileClose.close(fr, br);

		}
	}

	public static void main(String[] args) {

		read2();
		// read();
		// write();

	}
}