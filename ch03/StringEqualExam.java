package ch03;

public class StringEqualExam {

	public static void main(String[] args) {
		// String은 첫글자가 대문자이다. -> 클래스임
		// 클래스는 객체로 사용한다.
		String str1 = new String("조건재") ;
		String str2 = "조건재" ;
		String str3 = "조건재" ;
		
		System.out.println("str1 : " + str1);
		System.out.println("str2 : " + str2);
		System.out.println("str1 == str2 "+ str1 == str2 );
		// String은 참조 타입이라 == 연산은 주소를 비교한다.
		System.out.println("str2 == str3 "+ str2 == str3 );
		System.out.println("str1.toString : " + str1.toString());
		System.out.println("str2.toString : " + str2.toString());
		System.out.println("str3.toString : " + str3.toString());
		
		//문자열 비교는 .equals()메서드를 사용한다. *안에있는 내용 비교 
		System.out.println("str1.equals(str2) : " + str1.equals(str2));
		System.out.println("str1.equals(str3) : " + str1.equals(str3));
		System.out.println("str2.equals(str3) : " + str2.equals(str3));
		
	}

}
