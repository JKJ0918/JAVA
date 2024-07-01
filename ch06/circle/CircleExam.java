package ch06.circle;

public class CircleExam {

	public static void main(String[] args) {
		// 주 메뉴가 되는 클래스로 내가만든 라이브러리 클래스를 new로 인스턴스화
		
		Circle circle = new Circle();
		
		circle.name = "조건재"; // new String("김기원");
		circle.radius = 20 ; // 객체의 값 입력 완료
		
		//동작		
		double result = circle.getArea(); // 메서드 호출(동작->리턴)
		
		// 출력 
		System.out.println("원의 넓이 : " + circle.radius );
		System.out.println("작성자 : " + circle.name );
		System.out.println("동작 결과 : " + result );

	}

}
