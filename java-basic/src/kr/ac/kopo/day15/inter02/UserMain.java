package kr.ac.kopo.day15.inter02;

public class UserMain {

	public static void main(String[] args) {
		
		TV tv = new LGTV();
		//TV tv = new SamsungTV();
		tv.powerOn();
		tv.soundUp();
		tv.channelDown();
		tv.mute();
		tv.mute();
		tv.soundUp();
		tv.powerOff();
	}
}
