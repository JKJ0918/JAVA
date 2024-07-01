package ch07.mbcCar;

import ch07.hyndai.Engine;
import ch07.hankook.SnowTire;
import ch07.kumho.EcoTire;
import ch07.nexen.*;  // nexen에서 만든 클래스는 모두 가져올 수 있음


//import ch07.hankook.Tire;
//import ch07.kumho.Tire; // Tire가 중복되어 못씀

public class Car {
	// 필드
	
	ch07.hankook.Tire hTire = new ch07.hankook.Tire(); 	// hankook Tire 패키지에서 가져옴. import ch07.hankook.Tire;
	ch07.kumho.Tire kTire = new ch07.kumho.Tire(); 		// 금호타이어 패키지에서 가져옴.
	SnowTire sTire = new SnowTire();
	EcoTire eTire = new EcoTire();
	
	BigWidthTire bTire = new BigWidthTire();
	SportTire spTire = new SportTire();
	
	Engine hEngine = new Engine();
	
	
	// 생성자
	
	
	// 메서드
}
