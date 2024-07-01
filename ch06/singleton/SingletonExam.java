package ch06.singleton;

public class SingletonExam {

	public static void main(String[] args) {
		// 싱글톤을 사용해보자.
		
		// 생성자에 private을 붙여서 불가능
		// Singletion obj1 = new Singletion();
		// Singletion obj2 = new Singletion();

		Singletion obj3 = Singletion.getInstance(); //싱글톤 객체 연결
		Singletion obj4 = Singletion.getInstance(); //싱글톤 객체 연결
		
		if(obj3 == obj4) {
			System.out.println("같은 싱글톤 객체 입니다.");
		}else {
			System.out.println("다른 싱글톤 객체 입니다.");
		}
	} // end main

} // end class
