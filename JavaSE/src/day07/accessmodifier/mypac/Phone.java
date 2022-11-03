package day07.accessmodifier.mypac;

public class Phone {
	private String name = "일반 유선전화기";
	
	private void call() {
		System.out.println(name+" 전화하기");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	

}
