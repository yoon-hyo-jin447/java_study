package myTest;

import java.util.Scanner;

/*
 *1. 학생 등록
 *2. 학생 리스트 출력
 *3. 학생 성적 검색
 *9. 프로그램 종료
 *
 *2차원 배열로 작성
 *과목은 처음에 최대값 지정 가능
 *
 */
public class mytest3 {
  public static void main(String[] args) {
	  Scanner scan = new Scanner(System.in);
	  System.out.println("몇명에 학생을 입력하실건가요? 숫자로만 입력");
	  final int MAXSIZE = scan.nextInt();
	  System.out.println("과목수는 몇개인가요? 숫자로만 입력");
	  final int MAXSIZE1 = scan.nextInt();
	  String[] subjectName = new String[MAXSIZE1+2];
	  for(int i=0;i<MAXSIZE1;i++) {
		  System.out.println("추가할 과목을 입력해주세요");
		  		subjectName[i]=scan.next();
	  }
	  System.out.print("추가한과목\t");
	  for(int i=0;i<MAXSIZE1;i++) {
		  System.out.print(subjectName[i]+"\t");		  
	  }
	  subjectName[MAXSIZE1]="총점";
	  subjectName[MAXSIZE1+1]="평균";
	  System.out.println();
	  
	  String[] studentList = new String[MAXSIZE];
	  int[][] scoreList =  new int[MAXSIZE][MAXSIZE1+2];
	  
	  boolean menuFlag =  true;
	  int count = 0;
	  while(menuFlag) {
		  System.out.println("------------------------");
		  System.out.println("1.학생 등록\t2.학생 리스트 출력 ");
		  System.out.println("3.학생 성적 검색\t9.프로그램 종료 ");
		  System.out.println("------------------------");
		  System.out.println("원하시는 메뉴를 숫자로 입력해주세요");
		  if(scan.hasNextInt()) {
			  int menuNumber = scan.nextInt();
			  
			  if(menuNumber==1) {
				  for(int i=count;i<studentList.length;i++) {
					  int tot =0;
					  int avg =-1;
				  System.out.print("학생명>>");
				  studentList[i] = scan.next();
					  for(int j=0;j<subjectName.length-2;j++) {
						  System.out.print(subjectName[j]+"점수>>");
						  scoreList[i][j] = scan.nextInt();
						  tot +=scoreList[i][j];
						  avg =tot/(subjectName.length-2);
					  }
					  scoreList[i][MAXSIZE1] = tot;
					  scoreList[i][MAXSIZE1+1] = avg;
					  count++;
					  
					  System.out.print("등록을 그만하시겠습니까? 그만할려면 n");
					  if(scan.next().equals("n")) {
						  i=studentList.length;
					  }
					  else {
						  continue;
					  }
					  
				  }
			  }
			  else if(menuNumber==2) {
				  System.out.println("학생 리스트 출력 화면입니다");
				  System.out.print("학생");
				  for(int i=0;i<subjectName.length;i++) {
					  System.out.print("\t"+subjectName[i]);
				  }
				  System.out.println();
				  	for(int i=0;i<count;i++) {
				  		System.out.print(studentList[i]);
				  		for(int j=0;j<scoreList[i].length;j++) {
				  			System.out.print("\t"+scoreList[i][j]);
				  		}
				  		System.out.println();
				  	}
				  	
				  	
			  }
			  else if(menuNumber==3) {
				  System.out.println("학생명을 입력해주세요");
				  System.out.println();
				  
				  for(int i=0;i<count;i++) {
					  if(scan.next().equals(studentList[i])) {
						  for(int k=0;k<subjectName.length;k++) {
							  System.out.print(subjectName[k]+"\t");
						  }
						  System.out.println();
						  for(int j=0;j<scoreList[i].length;j++) {
							  System.out.print(scoreList[i][j]+"\t");
						  }
					  }
					  else {
						  continue;
					  }
				  }
				  System.out.println();
				  
			  }
			  else if(menuNumber==9) {
				  System.out.println("프로그램 종료");
				  System.exit(0);
			  }
			  else {
				  System.out.println("지금 입력하신 번호는 메뉴가 없는 번호입니다 다시 입력해주세요");
				  scan.nextLine();
			  }
		  
		  }
		  else {
			  System.out.println("숫자로 입력해주세요");
			  scan.nextLine();
			  menuFlag = true;
		  }
		  
	  }
			   
	  
	  
	  
  }
}
