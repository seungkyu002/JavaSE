package day05.extendsEx.mypac;

public class Man extends Human {
		
	// 오버라이딩 - 부모 메소드 재정의
	@Override
	public void say() {
		super.say();
		System.out.println("굵은 목소리로 말을해요!");
	}

	public void run() {
		System.out.println("달리기를 해요!");
	}
}
