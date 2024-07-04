package ch13.genericmethod;

public class Box<T> extends Object {
	//필드
	private T t;
	//생성자 
	
	//메서드
	public T get() {
		return t;
	} // Getter
	
	public void set(T t) {
		this.t = t;
	} // Setter
	
}
