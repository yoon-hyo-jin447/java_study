package chapter07;

import java.util.Scanner;

public class ScoreMgmSystem {
	
//[클래스명 : ScoreMgmSystem]
//Field : admin:String, sname:Student,
//constructor : ScoreMgmSystem()
//Method : insert(), update(), remove(), search()
	
	//Field
	String admin;
	Student student;
	Scanner scan = new Scanner(System.in);
	
	Student[] sList = new Student[10];
	int count = 0;
	//Constructor
	
	
	public ScoreMgmSystem() {
		
	}
	
	
	//Method
	
	public void insert() {
		
//		student = new Student();
		for(int i=count;i<10;i++) {
		sList[count] = new Student();
		System.out.println("학생명");
		sList[i].name = scan.next();
		
		System.out.println("국어점수");
		sList[i].kor = scan.nextInt();
		
		System.out.println("영어점수");
		sList[i].eng = scan.nextInt();
		
		System.out.println("수학점수");
		sList[i].math = scan.nextInt();
		
		System.out.println("=> 등록완료!!");
		count++;
		
		
		System.out.println("그만하시겠습니까? 그만할거면 n");
		if(scan.next().equals("n")) {
			break;
		}
		
		if(count == 10) {
			System.out.println("더이상 등록을 못합니다 종료하겠습니다");
			break;
		}//if문 종료
			
			
		}//for문 종료
	}//insert문 종료
	public void show() {
		
		System.out.println("---------------------");
		System.out.println("학생명\t국어\t영어\t수학\t총점\t평균");
		System.out.println("---------------------");
		for(int i=0;i<count;i++) {	
		System.out.print(sList[i].name+"\t");
		System.out.print(sList[i].kor+"\t");
		System.out.print(sList[i].eng+"\t");
		System.out.print(sList[i].math+"\t");
		System.out.print(sList[i].getTot()+"\t");
		System.out.println(sList[i].getAvg()+"\t");
		System.out.println("---------------------");
			
		}
		
	}
	public void update() {		
		if(count!= 0) {
			System.out.println("수정할 학생이 없습니다");
		}
		else {
			boolean updateFlag = true;
			while(updateFlag) {
			System.out.println("어느 학생을 수정하시겠습니까?");
			String searchName = scan.next();
			int searchIdx = -1;
			for(int i=0;i<count;i++) {
				if(searchName == sList[i].name) {
					searchIdx=i;
			}
			}
			
				
			if(searchIdx == -1) {
				System.out.println("검색하신 학생이 없습니다.");
			}//if문 종료
			else {
				System.out.println("지금 수정하실 학생은"+sList[searchIdx].name+"입니다");
				System.out.println("국어점수");
				sList[searchIdx].kor = scan.nextInt();
				
				System.out.println("영어점수");
				sList[searchIdx].eng = scan.nextInt();
				
				System.out.println("수학점수");
				sList[searchIdx].math = scan.nextInt();	
				
				System.out.println("update");
			}//else문 종료
			
			System.out.println("수정을 그만하시겠습니까? 그만할거면 n");
			if(scan.next().equals("n")) {
				updateFlag = false;
			}
		}	
		}
	}
	public void remove() {
		if(count !=0) {
		System.out.println("삭제하실 학생을 입력해주세요");
		String deleteName =  scan
	
		System.out.println("remove");
		}
		else {
			System.out.println("삭제할 데이터가 존재하지 않습니다");
		}
	}
	public void search() {
		System.out.println("search");
	}
	
	
	
	
}
