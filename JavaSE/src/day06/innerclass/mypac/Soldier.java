package day06.innerclass.mypac;

public class Soldier {
	private Weapon w;
	
	public Soldier(Weapon w) {
		this.w = w;
		this.w.attack();
	}

}
