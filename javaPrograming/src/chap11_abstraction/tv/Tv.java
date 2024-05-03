package chap11_abstraction.tv;

public abstract class Tv {
	public int lastChannel;
	
	public Tv() {
	}
	public abstract void powerOn();
	
	public abstract void powerOff();
	
	public abstract void operate(int channel);
	
	public abstract void channelUp();
	
	public abstract void channelDown();
	
}
