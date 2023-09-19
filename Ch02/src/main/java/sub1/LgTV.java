package sub1;

import org.springframework.beans.factory.annotation.Autowired;

public class LgTV {
	@Autowired // 참조변수에다가 annotation 선언
	private Speaker spk; // 멤버 선언만 하고 메소드를 쓰려면 초기화가 없기 때문에 null참조 에러가 난다.
	
	 //이 에러를 해결하기 위한 DI방법. 자동주입이므로 이름 필요없음
	public void powerOn() {
		System.out.println("LgTv powerOn...");
	}

	public void powerOff() {
		System.out.println("LgTv powerOff...");
	}
	
	public void soundUp() {
		spk.soundUp();
	}
	
	public void soundDown() {
		spk.soundDown();
	}
}
