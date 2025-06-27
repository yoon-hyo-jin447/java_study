package chapter05;

import java.util.Scanner;

public class ForOverlabTest {

	public static void main(String[] args) {
		//2단 ~ 5단 출력 //행번호가 아우터조건 열번호가 이너
		Scanner scan = new Scanner(System.in);
		int start = 0, end = 0;

		System.out.println("프로그램 종료: start, end 모두 0 입력");
		
		boolean flag = true;//보통 while문 변수로 flag로
		
		while(flag) {
			System.out.print("시작할 단을 입력해주세요 ");
			start = scan.nextInt();
			 
			System.out.print("종료할 단을 입력해주세요 ");
			end = scan.nextInt();
			if(start ==0 && end ==0) {
				flag = false;
				//while 블록은 빠져 나간 후 종료
			} else {
				for(int i=1; i<=9; i++)  {
					for(int j=start;j<=end; j++) {
						System.out.print(j + "*" + i +"=" + (i*j) + "\t");
					}
				System.out.println();
				}
				System.out.println("프로그램 종료: start, end 모두 0 입력");
			}
		}//while


		System.out.println("--프로그램을 종료--");// while(true)여서 표시된다
		System.exit(0);
	}

}
