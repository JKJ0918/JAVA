package ch10;

public class StringBuilderExam {

	public static void main(String[] args) {
		// StringBuilder 는 신형문자열 처리 방법으로 객체의 문자열을 수정, 추가 할 수 있다.
		// 동기화되지 않는다른 점을 제외하고는 StringBuilder 클래스와 메서드가 같다.(비동기화)
		// 동기화 : 여러 객체 변수를 같이 쓰는 개념.
		// 구현에서 빠르기때문에 우선적으로 활용한다.
	
		
		StringBuilder stringBuilder = new StringBuilder() ; 			// 16개 문자열 배열
		StringBuilder stringBuilder1 = new StringBuilder("Hello ") ; 	// 6개 문자열 배열
		//StringBuilder stringBuilder2 = new StringBuilder(50) ; 		// 50개 문자열 배열
		StringBuilder stringBuilder2 = new StringBuilder("Hello") ; 	// 50개 문자열 배열
		
		stringBuilder1.append("Programming") ; 						// Hello Programming *append 글자를 붙힘
		System.out.println(stringBuilder1);
		
		stringBuilder1.insert(6, "Java ");							// 글자에 삽입
		System.out.println(stringBuilder1);
		
		stringBuilder1.replace(1, 4, "Good");
		System.out.println(stringBuilder1); 							// Good으로 글자 대체
		
		stringBuilder1.delete(1, 5);
		System.out.println(stringBuilder1);
		
		stringBuilder1.reverse();
		System.out.println(stringBuilder1);
		
		System.out.println(stringBuilder1.equals(stringBuilder2) );	// equals 재정의 안됨
		

	} // end main

}
