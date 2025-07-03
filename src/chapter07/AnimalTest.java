package chapter07;

public class AnimalTest {
	String name = "홍길동";
	public static void main(String[] args) {
		System.out.println("-- AnimalTest 클래스 실행!!! --");

		//사자, 호랑이 객체 생성
		Animal lion = new Animal();
		Animal tiger = new Animal();
		Animal giraffe =  new Animal();
		Animal elephant =  new Animal();
		
		lion.name = "심바"; //라이온에 주소를 따라가서 거기에 name전역변수를 삼바로 변경
		lion.age = 5;
		
		tiger.name = "호돌이"; //라이온에 주소를 따라가서 거기에 name전역변수를 삼바로 변경
		tiger.age = 3;
		
		
		System.out.println("lion.name = "+lion.name);
		System.out.println("lion.age = "+lion.age);
		System.out.println("tiger.name = "+tiger.name);
		System.out.println("tiger.age = "+tiger.age);
		
		lion.sleep();
		tiger.sleep();
		
		
		giraffe.name = "기린이";
		elephant.name = "코순이";
		
		System.out.println("giraffe.name = "+giraffe.name);
		System.out.println("elephant.name = "+elephant.name);
	}

}
