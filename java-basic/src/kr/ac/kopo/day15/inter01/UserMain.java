package kr.ac.kopo.day15.inter01;

public class UserMain {

	public static void main(String[] args) {
		
		LGTV lg = new LGTV();
		lg.powerOn();
		lg.channelDown();
		lg.volumeUp();
		lg.volumeUp();
		lg.volumeDown();
		lg.channeUp();
		lg.powerOff();
		
		SamsungTV sam = new SamsungTV();
		sam.turnOn();
		sam.soundDown();
		sam.soundUp();
		sam.mute();
		sam.channelUp();
		sam.channelDown();
		sam.turnOff();
	}
}