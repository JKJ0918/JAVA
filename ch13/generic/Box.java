package ch13.generic;

public class Box<T> { // <T> generic 코드로 타입을 정하고 시작한다.
	// 위에 명시된 T가 String 이면????
	
	
	// 필드 
	private T t;


	// 기본 생성자
	
	
	// 메서드 
	
	public T getT() {			// getter
		return t;
	}

	public void setT(T t) { 	// setter
		this.t = t;
	}
	
	

}
