package kr.ac.kopo.day06;

import java.util.Arrays;

public class ArrayMain05 {

	public static void main(String[] args) {
	    
		// "2024��" "java" "����" ���ڿ��� ����
//		String str = "2024��";
		String str = new String("2024��");
		String str2 = "java";
		String str3 = "����";
		
		String[] strArr = {str, str2, str3};
		
		System.out.println("������ �Ѱ��� : " + strArr.length);
		
		for(int i = 0; i < strArr.length; i++) {
			System.out.println(strArr[i]);
		}
		System.out.println("=========================");
		
		for(String s : strArr) {
			System.out.println(s);
		}
		System.out.println("=========================");
		System.out.println(Arrays.toString(strArr));
	}

	}


