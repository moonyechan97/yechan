package kr.ac.kopo.day15;

import java.util.Random;

import kr.ac.kopo.day15.inter02.MyRandom;

/*final*/ class Super {
	/* final */ void print() {
		System.out.println("super클래스 print()...");
	}
}

class Sub extends Super {
	@Override
	void print() {
		System.out.println("sub클래스의 print()...");
	}
}

public class FinalMain {

	public static void main(String[] args) {
		
		Random r = new MyRandom();
		
		System.out.println(r.nextInt(2));
		
	}
}