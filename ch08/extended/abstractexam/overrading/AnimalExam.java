package ch08.extended.abstractexam.overrading;

public class AnimalExam {

	public static void main(String[] args) {
		// 추상메서드 활용
		
		// Animal animal = new Animal(); 추상 클래스라 못쓴다.
		
		Dog dog = new Dog();
		dog.kind = "포유류";
		dog.breathe();
		dog.sound();
		System.out.println("kind : " + dog.kind);
		
		System.out.println("--- Dog 자식 객체(구현클래스) ---");
		
		Cat cat = new Cat();
		cat.kind = "포유류";
		cat.breathe();
		cat.sound();
		System.out.println("kind : " + cat.kind);
		System.out.println(" --- Cat 자식 객체(구현클래스) ---");
		
		System.out.println("변수의 자동타입 변환 테스트");
		Animal animal = null; 
		animal = new Dog(); // 자동 타입 변환
		animal.sound();
		animal = new Cat(); // 자동 타입 변환
		animal.sound();
		// 객체의 다형성
		
		
		//매개변수의 다형성 실행
		animalSound(new Cat());
		
	} // main() 종료
	
	// 메서드의 매개변수의 다형성
	public static void animalSound(Animal animal) {
		animal.sound();
	}




}
