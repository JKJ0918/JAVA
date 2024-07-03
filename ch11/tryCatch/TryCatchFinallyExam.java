package ch11.tryCatch;

import java.util.Scanner;

public class TryCatchFinallyExam {

	public static void main(String[] args) {
		// 문자로 입력받는 숫자를 정수로 변환
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("첫번재 숫자를 입력하세요.");
		System.out.print(">>>");
		String data1 = scanner.next();
		
		System.out.println("두번재 숫자를 입력하세요.");
		System.out.print(">>>");
		String data2 = scanner.next();
		
		try {
			
			System.out.println("두개의 숫자를 더하겠습니다.");
			
			int value1 = Integer.parseInt(data1); // 문자로된 숫자를 정수로 반환
			int value2 = Integer.parseInt(data2); // 문자로된 숫자를 정수로 반환
			int result = value1 + value2;
			System.out.println(data1 + "+" + data2 + "=" + result);
		
		} catch (NumberFormatException e) {  //Exception만 쓰면 알아서 오류 찾음 저것 만 써도 됨
			System.out.println("숫자만 입력하세요.");
			//e.printStackTrace();
		}
		
		
		
	}//end main

}
