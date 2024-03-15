package kr.ac.kopo.day09;

/*
 * 생성자 특징
 * 1.클래스명 동일
 * 2.반환명 없음
 * 3.디폴트생성자 지원
 *   class내에 선언된 생성자가 없는 경우 JVM 자동으로 지원해주는 생성장
 *   클래스명() {
 * 4. 생성자 오버로딩 지원
 * 5. 속성 초기화
 */

class Car {
	
	Car() {
		System.out.println("디폴트 생성자 Car() 호출...");
	}
	
	Car(String s) {
		System.out.println("Car(String) 생성자 호출...");
	}
}

public class ConstructorMain01 {

	public static void main(String[] args) {
		
		Car c = new Car();
		
	}

}
