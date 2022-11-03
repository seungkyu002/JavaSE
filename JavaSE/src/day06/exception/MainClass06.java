package day06.exception;

public class MainClass06 {
	public static void main(String[] args) throws InterruptedException {
		NumberPrinter p = new NumberPrinter();
		
		p.printNumber();
		
		// 강제 익셉션 발생시키기
		// throw new 익셥션클래스명();   
	}

}
