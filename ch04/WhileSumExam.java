package ch04;

public class WhileSumExam {

	public static void main(String[] args) {
		// 1~100까지의 합을 구하시오!!! -> 5050
		int i = 1; // 반복용 상자
		int sum = 0; // 합을 구하는 상자
		
		while(i <= 100) { //1~100까지 반복
			
			sum += i; // sum += i; -> i값이 1~100까지 나오니깐 sum이랑 더함
			i++; //i = i + 1 -> 1~100까지 증가 

		} // while end
		
		System.out.println("1~100까지의 합은 :" + sum);
		
		
	} //main end

} // class end