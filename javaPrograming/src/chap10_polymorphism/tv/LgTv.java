package chap10_polymorphism.tv;

public class LgTv extends Tv {	

	@Override
	public void powerOn() {
		System.out.println("QLED");
	}
	@Override
	public void powerOff() {
		System.out.println("QLED");
	}
	@Override
	public void operate(int channel) {
		System.out.println("QLED");
	}
	@Override
	public void moveTo(int channel) {
		System.out.println("채널 변경" + channel);
	}
	@Override
	public void channelUp() {
		System.out.println("채널 이동" + "+1");
	}
	@Override
	public void channelDown() {
		System.out.println("채널 이동" + "-1");
	}
}
