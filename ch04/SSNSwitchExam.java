package ch04;

import java.util.Scanner;

public class SSNSwitchExam {

	public static void main(String[] args) {
		// 주민등록번호를 입력받아 switch 문을 이용한 성별 판단
		Scanner in = new Scanner(System.in);
		System.out.println("주민등록번호를 입력하시오. '-' 포함 : ");
		char gender = in.next().charAt(7);
		
		switch(gender) {
		case '1' : case '3' : case '5' : case '7' :
			System.out.println("당신은 남자 입니다.");
			break;
		case '2' : case '4' : case '6' : case '8' :
			System.out.println("당신은 여자 입니다.");
			break;
		default :
			System.out.println("당신은 외계인입니다.");
			System.out.println("당신의 별로 돌아가시기 바랍니다.");
		} // 성별 판단 switch 문 종료

		
	} //main 메서드 종료

} //class 종료
