package ch08.extended.abstractexam;

public class PhoneExam {

	public static void main(String[] args) {
		
		// Phone phone = new Phone("김기원");
		// phone 클래스에 abstract가 되어 있어 객체로 사용할 수 없다.
		// 사용하려면 구현 클래스(조원) 상속받아 활용해야 한다.(강제)
		
		SmartPhone smartPhone = new SmartPhone("김기원");
		smartPhone.turnOn();
		System.out.println(smartPhone.owner);
		smartPhone.internetSearch();
		smartPhone.turnOff();
	}

}
