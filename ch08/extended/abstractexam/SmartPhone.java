package ch08.extended.abstractexam;

public class SmartPhone extends Phone{

	public SmartPhone(String owner) {
		super(owner);
		// 추상메서드에서 만든 생성자를 강제로 주입받음.
	} 
	
	
	//메서드
	public void internetSearch() {
		System.out.println("인터넷 검색을 합니다.");
	}
	

}
