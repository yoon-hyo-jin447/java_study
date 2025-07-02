package myTest;

import java.util.Scanner;

public class MyTest1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String name = "";
		int[] score = new int[4];
		String[] subject = {"국어", "영어", "수학", "사회", "총점","평균"};
		System.out.println("학생명>");
		name = scan.next();
		int tot = 0;
		
		for(int i=0;i<subject.length-2;i++) {
			System.out.println(subject[i]+"> ");
			score[i] = scan.nextInt();
			tot += score[i];
		}
		
		System.out.print("학생명\t");
		for(int j=0;j<subject.length;j++) {
			System.out.print(subject[j]+"\t");
		}
		System.out.println();
		System.out.print(name+"\t");
		for(int i=0;i<subject.length-1;i++) {
			if(i<subject.length-2) {
				System.out.print(score[i]+"\t");
			}
			else {
				System.out.print(tot+"\t");
				System.out.print(tot/(subject.length-2)+"\t");
			}
		}
		
		
		
		
	}

}
