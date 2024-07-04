package ch14.collection.list;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ArrayListExam {

	public static void main(String[] args) {
		// list 컬렉션은 Arraylist, vector, linkedlist 3가지를 주로 사용한다. *다형성으로 동작한다라는 느낌
		// list 컬렉션은 배열 대신 활용도가 높다. (길이가 자유롭다)
		// list<String> 는 강한타입체크로 String 만 들어 감
		// List<String> list = new ArrayList<String>(); -> 10개가 기본 값

		List<String> listS = new ArrayList<String>();

		listS.add("Java"); // 0번 인덱스
		listS.add("Oracle"); // 1번 인덱스 *데이터베이스(DB)
		listS.add("JDBC"); // 2번 인덱스 *Java+DB 연동
		listS.add("HTML,CSS,JS"); // 3번 인덱스 *프론트
		listS.add("jsp"); // 4번 인덱스 *Java+DB+프론트
		listS.add("TOMCAT"); // 5번 인덱스 *서버 프로그래밍(Servlet)
		listS.add("리눅스"); // 6번 인덱스 *배포 서버
		listS.add(5, "servlet"); // 7번 인덱스 *jsp+Java
		listS.add("AWS"); // 8번 인덱스 *가상 배포서버

		int size = listS.size();
		System.out.println("총 객체수 :" + size);
		System.out.println("--------------------------------------------------");

		String skill = listS.get(2); // 2번 인덱스 값을 가져와 skill 변수에 넣음
		System.out.println("2번째 인덱스값 :" + skill);
		
		
		listS.remove(2);
		listS.remove(2);
		listS.remove("jsp");
		
		
		System.out.println("--------------------전체 출력------------------------");
		for (int i = 0; i < listS.size(); i++) {
			System.out.println(i + "번째 값:" + listS.get(i));
		} // end for
		
		
		
		
		
		System.out.println("----------------- for each 전체 출력 (index 사용 안함) ------------------");
		for(String str : listS) {
			System.out.println(str);
		}
	
	
	
	}// end main

}
