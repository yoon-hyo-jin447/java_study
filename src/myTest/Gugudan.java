package myTest;

import java.util.Scanner;

public class Gugudan {
	public static void main(String[] args) {
		Scanner scan =  new Scanner(System.in);
		int start = -1, end = -1;
		System.out.println("시작할 구구단>");
		start = scan.nextInt();
		System.out.println("끝낼 구구단>");
		end  = scan.nextInt();
		for(int i=1;i<=9;i++) {
			for(int j=start;j<=end;j++) {
				System.out.print(j+"x"+i+"="+(j*i)+"\t");
			}
			System.out.println();
		}
	}

}
