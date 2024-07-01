package ch05;

import java.util.Scanner;

public class GradeExam {
	// 학생이름 테이블 -> String[]
	// 점수 테이블 -> byte[]
	// 총점 테이블 -> int[]
	// 평균 테이블 -> double[]

	public static void main(String[] args) {
		// 주메뉴 구현용
		Scanner mainSC = new Scanner(System.in);
		System.out.println("초기작업 : 학생수를 입력하세요");
		int count = mainSC.nextInt(); // 학생수 등록완료
		String[] name = new String[count]; // 이름이력할 배열
		byte[] engScores = new byte[count]; // 영어점수 입력할 배열
		byte[] korScores = new byte[count]; // 국어점수 입력할 배열
		int[] totalScores = new int[count]; // 총점을 입력할 배열
		double[] avgScores = new double[count]; // 평균이 입력될 배열

		boolean run = true; // 메인 메뉴 while 구동용
		while (run) {
			System.out.println("======= MBC 교육센터 성적 관리 프로그램 =======");
			System.out.println("1.학생 관리 | 2.성적 관리 | 3.통계 | 4.종료");
			System.out.println("=======================================");
			System.out.print(">>>");
			int select = mainSC.nextInt(); // 1~4 까지 정수 입력 후에 분기

			switch (select) {
			case 1: // 구현 완료
				System.out.println("학생관리 메서드로 진입합니다.");
				student(name);
				break;
			case 2: // 구현 완료
				System.out.println("성적관리 메서드로 진입합니다.");
				scores(engScores, korScores, name);
				break;
			case 3: // 구현 완료 
				System.out.println("통계관리 메서드로 진입합니다.");
				statistics(engScores, korScores, name);
				break;
			case 4: // 구현 완료
				System.out.println("종료 합니다.");
				run = false;
				break;

			}// 주메뉴 switch문 종료
		} // while문 종료
	}// main 종료

	private static void statistics(byte[] engScores, byte[] korScores, String[] name) {
		// 통계용 CRUD
		Scanner statisticsSC = new Scanner(System.in);

		int engMax = engScores[0]; // 영어성적의 최대값
		int engMin = engScores[0]; // 영어성적의 최소값
		int korMax = korScores[0]; // 국어성적의 최대값
		int korMin = korScores[0]; // 국어성적의 최소값
		int engtotal = 0; // 영어 총점
		int kortotal = 0; // 국어 총점
		boolean run = true;
		while (run) {
			System.out.println("================성적통계메뉴===============");
			System.out.println("= 1.영어성적 통계 | 2.국어성적 통계 | 3.나가기 =");
			System.out.println("=======================================");
			System.out.println(">>>");
			int select = statisticsSC.nextInt();
			switch (select) {
			case 1:
				for (int i = 0; i < name.length; i++) {
					if (engScores[i] > engMax) {
						engMax = engScores[i];
					} else if (engScores[i] < engMin) {
						engMin = engScores[i];
					}
				} // engScore Max Min 값
				for (int j = 0; j < name.length; j++) {
					engtotal += engScores[j];
				} // for : 영어성적 총합계
				for (int k = 0; k < name.length; k++) {
					System.out
							.println("번호:" + (k + 1) + " 학생이름: " + name[k] + " 님의 영어 점수는 :" + engScores[k] + "점 입니다.");
				} // for 번호 이름 성적을 출력

				System.out.println("영어 성적의 최고점 : " + engMax);
				System.out.println("영어 성적의 최저점 : " + engMin);
				System.out.println("영어 성적의 평균 : " + (engtotal / name.length));
				break;
			case 2:
				for (int i = 0; i < name.length; i++) {
					if (korScores[i] > korMax) {
						korMax = korScores[i];
					} else if (korScores[i] < korMin) {
						korMin = korScores[i];
					}
				} // korScore Max Min 값
				for (int j = 0; j < name.length; j++) {
					kortotal += korScores[j];
				} // for : 국어성적 총합계
				for (int k = 0; k < name.length; k++) {
					System.out
							.println("번호:" + (k + 1) + " 학생이름: " + name[k] + " 님의 국어 점수는 :" + korScores[k] + "점 입니다.");
				} // for 번호 이름 성적을 출력
				System.out.println("국어 성적의 최고점 : " + korMax);
				System.out.println("국어 성적의 최저점 : " + korMin);
				System.out.println("국어 성적의 평균 : " + (kortotal / name.length));
				break;
			case 3:
				run = false;
				break;
				
			default:
				System.out.println("다시 입력하세요.");
			}// switch 문 종료
		} // while 문 종료
	}// statistics 메서드 종료

	private static void scores(byte[] engScores, byte[] korScores, String[] name) {
		// 성적 입력용 CRUD
		Scanner scoresSC = new Scanner(System.in);

		boolean run = true; // scores 메뉴 구동
		while (run) {
			System.out.println("================성적관리메뉴===============");
			System.out.println("1.영어 | 2.국어 | 3.보기 | 4.수정 | 5. 나가기");
			System.out.println("========================================");
			System.out.print(">>>");
			int select = scoresSC.nextInt();
			switch (select) {
			case 1:
				System.out.println("영어 성적 입력을 시작합니다");
				for (int i = 0; i < name.length; i++) {
					System.out.println((i + 1) + "번째" +name[i]+ " 학생의 점수 : ");
					engScores[i] = (byte) scoresSC.nextInt();
				}
				break;
			case 2:
				System.out.println("국어 성적 입력을 시작합니다");
				for (int i = 0; i < name.length; i++) {
					System.out.println((i + 1) + "번째" +name[i]+ " 학생의 점수 : ");
					korScores[i] = (byte) scoresSC.nextInt();
				}
				break;
			case 3:
				System.out.println("입력된 성적을 보여줍니다.");
				for (int i = 0; i < name.length; i++) {
					System.out.println(
							(i + 1) + "번째"+name[i]+" 학생의 점수 = [영어 :" + engScores[i] + "점] | [국어 : " + korScores[i] + "점]");
				}
				break;
			case 4:
				System.out.println("입력된 성적을 수정합니다.");
				System.out.println("수정할 과목을 선택해 주세요 : 1.영어 / 2.국어");
				int edit = scoresSC.nextInt();
				switch (edit) {
				case 1:
					System.out.println("영어 성적을 수정합니다.");
					System.out.println("몇번째 학생의 성적을 수정할 까요? (1~" + name.length + "번 중 입력");
					int engEdit = scoresSC.nextInt();
					System.out.println("수정하실 점수를 입력해 주세요.");
					int engResocre = (byte) scoresSC.nextInt();
					engScores[engEdit - 1] = (byte) engResocre;
					break;
				case 2:
					System.out.println("국어 성적을 수정합니다.");
					System.out.println("몇번째 학생의 성적을 수정할 까요? (1~" + name.length + "번 중 입력)");
					int korEdit = scoresSC.nextInt();
					System.out.println("수정하실 점수를 입력해 주세요.");
					int korResocre = (byte) scoresSC.nextInt();
					korScores[korEdit - 1] = (byte) korResocre;
					break;
				}// case 4 의 switch
				break;// case 4 break
			case 5:
				run = false;
				break;
			default:
				System.out.println("다시 입력해 주세요.");
			} // switch 문 종료
		} // while문 종료
	} // scores 종료

	private static String[] student(String[] name) {
		// 학생관리용 CRUD
		Scanner studentSC = new Scanner(System.in); // student의 scanner

		boolean run = true; // while 반복문 용

		while (run) {
			System.out.println("================학생관리메뉴===============");
			System.out.println("1.등록 | 2.보기 | 3.수정 | 4.삭제 | 5. 나가기");
			System.out.println("========================================");
			System.out.print(">>>");
			int select = studentSC.nextInt();
			switch (select) {
			case 1:
				System.out.println("학생 등록을 시작합니다.");
				System.out.println("총 학생수는 : " + name.length); // main에서 가져온 name 을 이용함
				for (int i = 0; i < name.length; i++) { // 학생이름 반복문
					System.out.println((i + 1) + "번 학생 이름을 등록하세요.");
					name[i] = studentSC.next(); // 키보드 문자로 받은 값을 배열 i에 넣는다.
				}
				System.out.println("학생 등록 완료");
				break;
			case 2:
				System.out.println("학생 리스트 출력!");
				for (int i = 0; i < name.length; i++) {
					System.out.println((i + 1) + " 번 : " + name[i]);
				}
				break;
			case 3:
				System.out.println("학생 이름 수정");
				System.out.println("수정할 학생 번호를 입력하세요.");
				int nameNum = studentSC.nextInt();
				System.out.println("수정할 학생 이름을 입력하세요.");
				String nameMOD = studentSC.next();
				name[nameNum - 1] = nameMOD;
				System.out.println("수정 완료");
				break;
			case 4:
				System.out.println("삭제할 학생 번호를 입력하세요.");
				int deleteNum = studentSC.nextInt();
				name[deleteNum - 1] = null; // 객체는 지울 때 Null (String=객체)
				break;
			case 5:
				run = false;
				break;
			default:
				System.out.println("입력값 오류 : 1~4번 만 입력하세요 ");

			} // switch문 종료
		} // while문 종료
		return name;

	} // student() 종료

} // class 종료
