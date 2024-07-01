package ch04;

import java.util.Scanner;

public class LottoExam {

	public static void main(String[] args) {
		// 정수 6개의 값을 입력받고 랜덤으로 6개의 값을 생성
		// 몇개가 맞았는지 파악
		
		Scanner in = new Scanner(System.in);
		System.out.println("로또 1~45번까지 번호중 6개를 입력해 주세요.");
		System.out.println("1번째 번호 : ");
		int myNum1 = in.nextInt();
		
		System.out.println("2번째 번호 : ");
		int myNum2 = in.nextInt();
		
		System.out.println("3번째 번호 : ");
		int myNum3 = in.nextInt();
		
		System.out.println("4번째 번호 : ");
		int myNum4 = in.nextInt();
		
		System.out.println("5번째 번호 : ");
		int myNum5 = in.nextInt();
		
		System.out.println("6번째 번호 : ");
		int myNum6 = in.nextInt();
		
		// 컴퓨터 난수 발생
		int num1 = (int)(Math.random()*45) + 1;
		int num2 = (int)(Math.random()*45) + 1;
		int num3 = (int)(Math.random()*45) + 1;
		int num4 = (int)(Math.random()*45) + 1;
		int num5 = (int)(Math.random()*45) + 1;
		int num6 = (int)(Math.random()*45) + 1;
				
		int x = 0 ; // 맞은 숫자
		
		if(myNum1==num1||myNum1==num2||myNum1==num3||myNum1==num4||myNum1==num5||myNum1==num6) {
			++x;
		}
		if(myNum2==num1||myNum2==num2||myNum2==num3||myNum2==num4||myNum2==num5||myNum2==num6) {
			++x;
		}
		if(myNum3==num1||myNum3==num2||myNum3==num3||myNum3==num4||myNum3==num5||myNum3==num6) {
			++x;
		}
		if(myNum4==num1||myNum4==num2||myNum4==num3||myNum4==num4||myNum4==num5||myNum4==num6) {
			++x;
		}
		if(myNum5==num1||myNum5==num2||myNum5==num3||myNum5==num4||myNum5==num5||myNum5==num6) {
			++x;
		}
		if(myNum6==num1||myNum6==num2||myNum6==num3||myNum6==num4||myNum6==num5||myNum6==num6) {
			++x;
		} // 비교 하는 if문 종료
		
		System.out.println("====================================================================");
		System.out.println("이번주의 로또당첨 번호입니다.");
		System.out.println(num1+" "+num2+" "+num3+" "+num4+" "+num5+" "+num6);
		System.out.println("====================================================================");
		
		if(x==0) {
			System.out.println("번호가 하나도 맞이 않았습니다.");
		}else if(x==1) {
			System.out.println("축하합니다. 번호가 1개 맞았습니다.");
		}else if(x==2) {
			System.out.println("축하합니다. 번호가 2개 맞았습니다.");
		}else if(x==3) {
			System.out.println("축하합니다. 번호가 3개 맞았습니다.");
		}else if(x==4) {
			System.out.println("축하합니다. 번호가 4개 맞았습니다.");
		}else if(x==5) {
			System.out.println("축하합니다. 번호가 5개 맞았습니다.");
		}else if(x==6) {
			System.out.println("축하합니다. 번호가 6개 맞았습니다.");
		}else {
			System.out.println("시스템이 아파요.");
		}
	}

}
