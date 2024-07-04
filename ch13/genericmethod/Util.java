package ch13.genericmethod;

public class Util {
	// 제내릭 메서드 테스트 용
	public static <T> Box<T> boxing(T t){
		// static 은 new 없이 사용하는 메서드
		Box<T> box = new Box<T>();
		box.set(t);
		return box ;
	}
}
