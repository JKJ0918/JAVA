package ch07.exam1.package2;

import ch07.exam1.package1.A;
import ch07.exam1.package1.B;

public class C {
	A a ; // default는 다른 패키지는 안됨
	B b ; // public은 import처리 하면 접근 가능
	
	A a1 = new A(true); //public
	// A a2 = new A(2);
	// A a3 = new A("문자열");
}
