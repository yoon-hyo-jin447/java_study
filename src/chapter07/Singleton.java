package chapter07;



/*
 * 싱글톤 디자인 배턴 적용
 */


public class Singleton {
	//Field
	private static Singleton singleton = new Singleton();
	private String name;
	//Constructor	: new Singleton();
	private Singleton() {}
	//Method
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	public static Singleton getInstance() {
		return singleton;
	}
}	
