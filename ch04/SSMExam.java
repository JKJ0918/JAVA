package ch04;

import java.util.Scanner;

public class SSMExam {

	public static void main(String[] args) {
		// 주민번호 7번째 글자를 입력 받아 남여 파악용
		Scanner input1 = new Scanner(System.in);
		System.out.print("질문 1) 주민번호 7번째 숫자 입력 : ");
		int ssn = input1.nextInt();
		String gender1 = "male";
		String gender2 = "female";
		
		if(ssn%2 == 1 && ssn <9) {
			System.out.println("남자");
		}
		if(ssn%2 == 0 && ssn <9) {
			System.out.println("여자");
		}
		if(ssn<1 || ssn>9) {
			System.out.println("1~9사이의 값을 입력 하시오.");
		}
		
		Scanner input2 = new Scanner(System.in);
		System.out.println("질문 2) 당신의 성별은? : Male or Female ");
		String gender = input2.next();
		System.out.println("당신이 입력한 것은 : " + gender);
		if(gender1.equalsIgnoreCase(gender)) {
			System.out.println("당신은 남자가 맞습니다.");
		}
		if(gender2.equalsIgnoreCase(gender)) {
			System.out.println("당신은 여자가 맞습니다.");
		}

	}

}
