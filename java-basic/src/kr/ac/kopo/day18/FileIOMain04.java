package kr.ac.kopo.day18;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIOMain04 {
	// iotest/Koala.jpg => iotest/koala3.jpg 복사
	public static void main(String[] args) {

		FileInputStream fis = null;
		FileOutputStream fos = null;

		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;

		long start = System.currentTimeMillis();

		try {
			fis = new FileInputStream("iotest/Koala.jpg");
			fos = new FileOutputStream("iotest/Koala3.jpg");

			bis = new BufferedInputStream(fis);
			bos = new BufferedOutputStream(fos);

			while (true) {
				int c = bis.read();
				if (c == -1)
					break;
				bos.write(c);
			}
			bos.flush();
			System.out.println("koala3.jpg 복사완료...");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			if (bis != null) {
				try {
					bis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

			if (fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

			if (bos != null) {
				try {
					bos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

			if (fos != null) {
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		}

		long end = System.currentTimeMillis();
		System.out.println("소요시간 : " + (end - start) / 1000. + "(초)");

	}

}
