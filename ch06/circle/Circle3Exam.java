package ch06.circle;

public class Circle3Exam {

	public static void main(String[] args) {
		
		Circle circle = new Circle(30, "조건재");
		
		//동작		
		double result = circle.getArea(); // 메서드 호출(동작->리턴)
		
		// 출력 
		System.out.println("원의 넓이 : " + circle.radius );
		System.out.println("작성자 : " + circle.name );
		System.out.println("동작 결과 : " + result );

		

	}

}
