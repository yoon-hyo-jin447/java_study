package myTest;

import java.util.Scanner;

public class StudyScoreManagement {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int choice = -1;
		String name = "";
		int number = -1;
		String study  = "";
		int  score = -1;
		int  score2 = -1;
		int  score3 = -1;
		boolean choiceFlag = true;
		boolean scoreFlag = true;
		String grade = "";
		System.out.println("======학생 성적 관리 시스템=======");
		System.out.println("1.학생등록\t2.학생 목록 조회");
		System.out.println("3.학생 성적 검색\t4.성적 수정");
		System.out.println("5.학생삭제\t6.종료");
		System.out.println("숫자로 입력해주세요");
		while(choiceFlag) {
			if(scan.hasNextInt()) {
//				choiceFlag = false;
				choice = scan.nextInt();
				switch(choice) {
					case 1:
						System.out.println("학생등록페이지입니다 입력해주세요");
						System.out.println("이름");
						name = scan.next();
						System.out.println("학번");
						number = scan.nextInt();
						System.out.println("전공");
						study = scan.next();
						System.out.println("국어점수");
						 	while(scoreFlag) {
							if(scan.hasNextInt()) {
								scoreFlag =  false;
								score = scan.nextInt();
							}
							else {
								scoreFlag = true;
								scan.nextLine();
								System.out.println("숫자로 입력해주세요");
							}
						 	}
						System.out.println("영어점수");
						score2 = scan.nextInt();
						System.out.println("수학점수");
						score3 = scan.nextInt();
						System.out.println("");
						System.out.println("이름: "+name);
						System.out.println("학번: "+number);
						System.out.println("전공: "+study);
						System.out.println("국어 점수: "+score);
						System.out.println("영어 점수: "+score2);
						System.out.println("수학 점수: "+score3);
						System.out.println("-> 등록 완료");
						break;
					case 2:
						System.out.println("학생 성적 조회 화면 입니다");
						System.out.println("[학생 성적 조회] "+name);
						System.out.println("학번 "+ number);
						System.out.println("국어: "+ score +"영어:"+score2+"수학: "+score3);
						System.out.println("총점: "+(score+score2+score3)+" 평균: "+((score+score2+score3)/3)+" 등급: " +(grade=((score+score2+score3)/3)>=90? "A":"B"));
						break;
					case 3:
						break;
					case 4:
						break;
					case 5:
						break;
					case 6:
						System.exit(0);
					default:
						System.out.println("잘못된 입력입니다 다시 입력해주세요");
						choiceFlag = true;
			}
			}
			else{
				System.out.println("잘못된 입력입니다 다시 입력해주세요");
				scan.nextLine();
			}
			
			
		
		}
		

	}

}
