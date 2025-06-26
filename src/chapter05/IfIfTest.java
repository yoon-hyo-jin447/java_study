package chapter05;

/*
 * 중첩 if
 */
import java.util.Scanner;

public class IfIfTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int math = 0, eng = 0;
		
		
		System.out.println("수학점수>");
		math = scan.nextInt();
		System.out.println("영어점수>");
		eng = scan.nextInt();
		
		
		
		if(math >= 60) {
			if(eng >= 60) {
				System.out.println("통과");
			} else {
				System.out.println("탈락");
		} 
		} else {
			System.out.println("탈락");
		}
		//2. 논리연산자 && if ~else
		if(math >=60 && eng >= 60) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}

	}

}
