package sub1;

public class SamsungTV {
	
	private Speaker spk; // 멤버 선언만 하고 메소드를 쓰려면 초기화가 없기 때문에 null참조 에러가 난다.
	
	public void powerOn() {
		System.out.println("SamsungTv powerOn...");
	}

	public void powerOff() {
		System.out.println("SamsungTv powerOff...");
	}
	
	public void soundUp() {
		spk.soundUp();
	}
	
	public void soundDown() {
		spk.soundDown();
	}
}
