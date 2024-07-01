package ch02;

public class CastingExam {

	public static void main(String[] args) {
		// Casting은 강제 타입 변환으로 큰타입을 작은타입으로 강제 주입할 때 사용
		// 단 손실이 발생 -> 2진법에 영향
		// int 변수명 = (int) double 값 ;
		
		int intValue = 12345678 ;
		byte byteValue = (byte) intValue; // Type mismatch: cannot convert from int to byte
		
		System.out.println("int 값 : " + intValue);
		System.out.println("byte 값 : " + byteValue);
		
		
		System.out.println("=========자동 타입 변환===========");
		int intValue1 = 10 ;
		double doubleValue1 = 5.5 ;
		double result1 = intValue1 + doubleValue1 ;
		System.out.println("int 10 + double 5.5 = " + result1); //int -> double로 바뀌어 연산됨
		
		System.out.println("=========정수로 결과를 봄=========");
		int result2 = (int) (intValue1 + doubleValue1) ; //or intValue1 + (int) doubleValue1 ; // 강제 타입 변환
		System.out.println("int 10 + double 5.5 = " + result2);
		
	}

}
