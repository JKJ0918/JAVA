package ch08.extended.car;

public class SportCar extends Car {// 자식 자동차

	@Override // 재정의 용이라는 표식 안써도됨, 
	public void speedUP() {
		speed += 5;
	}
	
	//@Override
	public void stop1() {
		
	}

}
