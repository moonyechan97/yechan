package kr.ac.kopo.day10;

public class StringMain04 {

	public static void main(String[] args) {
		
		String s ="Hello";
		String s2 = new String("HeLlo");
		
		System.out.printf("s : [%s]\n", s);
		System.out.printf("s2 : [%s]\n", s2);
		
		//주소 비교
		if(s == s2) {
			System.out.println("s == s2");
		} else {
			System.out.println("s != s2");
		}
		
        //문자열 비교
		boolean bool = s.equals(s2);
		if(bool) {
			System.out.println("equals() : 같다");
		} else {
			System.out.println("equals() : 다르다");
		}
		
		bool = s.equalsIgnoreCase(s2);
		if(bool) {
			System.out.println("equalsIgnoreCase() : 같다");
		} else {
			System.out.println("equalsIgnoreCase() : 다르다");
		}
		
		String [] names = {"홍길동", "홍길순", "나갈길", "강길동", "윤길동", "홍길동", "홍개똥", "길길순"};
		
		System.out.println("<\"길\" 포함된 사람을 출력>");
		for(String name : names) {
			if(name.contains("길")) {
				System.out.println(name);
			}
		}
		
		System.out.println("<이름이 \"길동\"인 사람을 출력>");
		for(String name : names) {
			if(name.endsWith("길동")) {
				System.out.println(name);
			}
		}
		
		System.out.println("<\"홍\"씨 성을 가진 이름을 출력>");
		for(String name : names) {
			if(name.startsWith("홍")) {
				System.out.println(name);
			}
		}
		
		System.out.println("--------------------");
		for(String name : names) {
			if(name.charAt(0) == '홍') {
				System.out.println(name);
			}
		}
		
		System.out.println("<전체이름이 \"홍길동\"인 이름을 출력>");
		for(String name : names) {
			switch(name) {
			case "홍길동" -> {
				System.out.println(name);
			}
			}
		}
		
		System.out.println("--------------------");
		for(String name : names) {
			switch(name) {
			case "홍길동":
				System.out.println(name);
				break;
			}
		}
		
		System.out.println("--------------------");
		for(int i = 0; i < names.length; i++) {
			if(names[i].equals("홍길동")) {
				System.out.println(names[i]);
			}
		}
		
		System.out.println("--------------------");
		for(String name : names) {
			if(name.compareTo("홍길동") == 0) {
				System.out.println(name);
			}
		}
		
		System.out.println("--------------------");
		
		String word = "hello World";
		String word2 = "her";
		
		int cmp = word.compareTo(word2);
		if(cmp == 0) {
			    System.out.printf("%s == %s\n", word, word2);
		} else if(cmp > 0) {
				System.out.printf("%s > %s\n", word, word2);
		} else {
				System.out.printf("%s < %s\n", word, word2);
		}
	}
}