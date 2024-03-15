package kr.ac.kopo.day09;

/*
 * 멤버변수선언
 * 생성자선언
 * 메소드선언 
*/

public class Member {
   String name;
   int age;
   String bloodType;
   
   Member() {
	   name = "알수없음";
	   age = -1;
	   bloodType = "알수없음";
   }
   
   Member(String name) {
	   this.name = name;
	   this.age = -1;
	   this.bloodType = "알수없음";
   }
   
   Member(String name, int age) {
	   this.name = name;
	   this.age = age;
	   this.bloodType = "알수없음";
   }
   
   Member(String name, int age, String bloodType) {
	   this.name = name;                //멤버변수와 지역변수를 구분하기위해 this 붙임
	   this.age = age;
	   this.bloodType = bloodType;
	   
   }
   
   void info() {
	   System.out.println("이름 : " + name + ", 나이 : " + age + ", 혈액형 : " + bloodType);

   }
}
