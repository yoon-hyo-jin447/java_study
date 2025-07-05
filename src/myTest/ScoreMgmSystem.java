package myTest;

import java.util.Scanner;

public class ScoreMgmSystem {
	//Field
	int password;
	Student[] sList = new Student[10];
	Scanner scan = new Scanner(System.in);
	int count = 0;
	
	
	
	//Constructor
	public ScoreMgmSystem() {
		
	}
	
	
	
	//Method
	public void menuShow() {
			System.out.println("---------------------------------------");
			System.out.println("1. 학생 추가\t2. 전체 학생 조회");
			System.out.println("3. 특정 학생 조회\t4. 특정 학생 수정");
			System.out.println("5. 특정 학생 삭제\t9. 프로그램 종료");
			System.out.println("원하시는 메뉴를 선택해주세요(숫자)");
			System.out.println("---------------------------------------");
			if(scan.hasNextInt()) {
				int menuNumber = scan.nextInt();
				menuCheck(menuNumber);
			}
			else {
				System.out.println("잘못된 입력입니다 숫자로 입력해주세요");
				menuShow();
			}
	}
	
	public void menuCheck(int menuNumber) {
		switch(menuNumber) {
		case 1:
			insert();
			break;
		case 2:
			searchAll();
			menuShow();
			break;
		case 3:
			searchIvl();
			break;
		case 4:
			update();
			
			break;
		case 5:
			delete();
			
			break;
		case 9:
			System.out.println("프로그램을 종료합니다");
			System.exit(0);
			break;	
		}
	}
	
	public void insert() {
		System.out.println("학생 추가 화면입니다");
		System.out.print("추가할 학생을 입력해주세요");
		sList[count] = new Student(); //
		sList[count].name = scan.next();
		System.out.print("국어 점수>");
		sList[count].kor = scan.nextInt();
		System.out.print("수학 점수>");
		sList[count].math = scan.nextInt();
		System.out.print("영어 점수>");
		sList[count].eng = scan.nextInt();
		System.out.print("추가 완료");
		count++;
		
		
		System.out.print("더 추가하시겠습니까?  맞으면(아무키) : 종료(n)");
		if(scan.next().equals("n")) {
			menuShow();
		}
		else {
			insert();
		}
		
		
		
		
		
	}
	
	public void searchAll() {
		if(count != 0) {
			System.out.println("학생명\t국어\t수학\t영어\t총점\t평균");
			for(Student student : sList) {
				if(student != null) {
				System.out.print(student.name+"\t");
				System.out.print(student.kor+"\t");
				System.out.print(student.math+"\t");
				System.out.print(student.eng+"\t");
				System.out.print(student.getTot()+"\t");
				System.out.print(student.getAvg()+"\n");
				}
				else break;
			}
			menuShow();
		}
		else {
			System.out.println("조회할 데이터가 없습니다.");
			menuShow();
		}
	}
	
	public void searchIvl() {
		if(count !=0) {
		int searchIdx = searchIndex("조회");
				
		if(searchIdx != -1) {
		
			appearSystem(searchIdx);
			
			System.out.print("더 조회하시겠습니까?  맞으면(아무키) : 종료(n)");
				if(scan.next().equals("n")) {
					menuShow();
				}
				else {
					searchIvl();
				}
		}
		else {
			System.out.println("검색한 학생을 찾을 수가 없습니다");
			searchIvl();
		}
			
		
		}//if문 종료
		else {
			System.out.println("검색할 데이터가 없습니다");
			menuShow();
		}//else문 종료
	}
	
	public void update() {
		if(count != 0) {
			int updateIdx = searchIndex("수정");

			if(updateIdx != -1) {
			
				System.out.print("국어 점수>");
				sList[updateIdx].kor = scan.nextInt();
				System.out.print("수학 점수>");
				sList[updateIdx].math = scan.nextInt();
				System.out.print("영어 점수>");
				sList[updateIdx].eng = scan.nextInt();
				System.out.print("수정 완료");
				
				appearSystem(updateIdx);
				
				
				System.out.print("더 수정하시겠습니까?  맞으면(아무키) : 종료(n)");
				if(scan.next().equals("n")) {
					menuShow();
				}
				else {
					update();
				}
			}
			else {
				System.out.println("검색한 학생을 찾을 수가 없습니다");
				update();
			}
			
			
			
			
		}
		else {
			System.out.println("검색할 데이터가 없습니다");
			menuShow();
		}
		
	}
	
	public void delete() {
		if(count != 0) {
			int deleteIdx = searchIndex("삭제");
			
			if(deleteIdx != -1) {
				for(int i=deleteIdx;i<count-1;i++) {
					sList[i] = sList[i+1]; 
				}
				sList[count-1] = null;
				count--;
				System.out.println("삭제가 완료되었습니다");
				
				System.out.print("더 삭제하시겠습니까?  맞으면(아무키) : 종료(n)");
				if(scan.next().equals("n")) {
					menuShow();
				}
				else {
					delete();
				}
				
				
				
			}//if문 종료
			else {
				System.out.println("검색한 학생명이 존재하지않습니다");
				delete();	
			}//else문 종료
			
		}
		else {
			System.out.println("검색할 데이터가 없습니다");
			menuShow();
		}
	}//delete문 종료
	
	
	public int searchIndex(String want) {
		System.out.println(want+"할 학생을 입력해주세요");
		String searchName = scan.next();
		int searchIdx = -1;
		
		for(int i=0;i<count;i++) {
			if(searchName.equals(sList[i].name)) {
					searchIdx = i;
			}	
		}//for문 종료
		return searchIdx;
	}
	
	
	
	
	public void appearSystem(int idx) {
		System.out.println("학생명\t국어\t수학\t영어\t총점\t평균");
		System.out.print(sList[idx].name+"\t");
		System.out.print(sList[idx].kor+"\t");
		System.out.print(sList[idx].math+"\t");
		System.out.print(sList[idx].eng+"\t");
		System.out.print(sList[idx].getTot()+"\t");
		System.out.print(sList[idx].getAvg()+"\n");
	}

	
	
	

}
