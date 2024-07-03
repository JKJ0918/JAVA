package ch12.beeptest;

import java.awt.Toolkit;

public class BeepTask implements Runnable {
	// 소리가 나는 스레드 
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		Toolkit toolkit = Toolkit.getDefaultToolkit(); 		// 객체화
		for(int i = 0 ; i < 10; i++) {
			toolkit.beep(); // 사운드로 경고음이 출력됨
			
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} // 1초 동안 대기 상태
			
		}//소리나는 end for
		
		
	}

}//end class
