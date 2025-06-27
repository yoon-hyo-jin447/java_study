package chapter05;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int start = 0,end = 0;
		System.out.println("프로그램을 시작하겠습니다");
		while(true) {
			System.out.print("시작>");
			start=scan.nextInt();
			if(start == -1) {
				System.out.print("프로그램을 종료하겠습니다");
				System.exit(0);
			} else {
				System.out.print("종료>");
				end=scan.nextInt();
				
				for(int i=1;i<=9;i++) {
					for(int j=start; j<=end;j++) {
					System.out.print(j+"*"+i+"="+(j*i)+"\t");
					}
				System.out.println();
				}
				
			}
		}

	}

}
