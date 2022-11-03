package day05.abstractEx.mypac;

/*
 * 상속 받는방법
 *  class 클래스명 extends 상속받을클래스명
 * 
 */
public class Woman extends Human {

	// 오버라이딩 - 부모 메소드 재정의
	@Override 
	public void dance() {
		System.out.println("춤을 춰요!");
	}

}
