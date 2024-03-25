package kr.ac.kopo.day15.inter02;

import java.util.Random;

public class MyRandom extends Random {

	@Override
	public int nextInt(int bound) {
		int random = super.nextInt(bound);	// 0 ~ (bound-1)
		return random + 1;
	}

}