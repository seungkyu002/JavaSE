package day06.thread.mypac;

/*
 	Brother 총 재산 : 5662
	Syster 총 재산 : 4339
 
 */
public class Wallet {
	public int totalMoney = 10000;
	
	// synchronized 동기화 시켜주는 예약어
	public synchronized int getMoney() {
		
		if(totalMoney == 0) return 0;
		totalMoney = totalMoney -1;
		System.out.println("현재 지갑의 금액: " + totalMoney);
		
		return 1;
	}

}
