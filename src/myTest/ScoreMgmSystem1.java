package myTest;

import java.util.Scanner;

public class ScoreMgmSystem1 {
	//Field
	Student[] sList = new Student[100];
	Scanner scan = new Scanner(System.in);
	int count  = 0;
	String[]  subject = {"국어","수학","영어"};
	
	
	
	
	
	
	
	//Constructor
	public ScoreMgmSystem1() {
		
	}
	
	
	//Method
	public void showMenu() {
			System.out.println("--------------------------------------");
			System.out.println("1. 학생추가\t2. 전체 학생 조회");
			System.out.println("3. 학생 조회\t4. 학생 점수 수정");
			System.out.println("5. 학생 삭제\t9. 프로그램 종료");
			System.out.println("--------------------------------------");
			System.out.println("메뉴를 선택해주세요 숫자로 선택해주세요");
			
			if(scan.hasNextInt()) {
				menuSelect(scan.nextInt());
			}
			else {
				System.out.println("메뉴를 잘못 입력하셨습니다 숫자로 입력주세요");
				showMenu();
			}
		
	}
	
	public void menuSelect(int menu) {
		switch(menu) {
		case 1:
			insert();
			showMenu();
			break;
		case 2:
			showAll();
			showMenu();
			break;
		case 3:
			searchIvl();
			showMenu();
			break;
		case 4:
			update();
			showMenu();
			break;
		case 5:
			delete();
			showMenu();
			break;
		case 9:
			System.out.println("프로그램을 종료하겠습니다");
			System.exit(0);
			break;
		default:
			System.out.println("메뉴에 없는 번호를 입력하셨습니다 다시 입력해주세요");
			
		}
	}
	
	public void insert() {
		System.out.println("학생 추가 화면입니다");
		System.out.print("추가할 학생명>");
		sList[count] = new Student(); //중요
		sList[count].name = scan.next();
		System.out.print(subject[0]+"점수");
		sList[count].kor = scan.nextInt();
		System.out.print(subject[1]+"점수");
		sList[count].math = scan.nextInt();
		System.out.print(subject[2]+"점수");
		sList[count].eng = scan.nextInt();
		System.out.println("추가 완료");
		show(count);
		count++;
		System.out.println("계속하시겠습니까? 계속하려면 아무키: 종료시  n");
		if(scan.next().equals("n")) {
			System.out.println("학생 추가 종료");
		}
		else {
			insert();
		}		
		}
	
	public void showAll() {
		if(count != 0) {
			System.out.println("학생명\t국어\t수학\t영어\t총점\t평균");
			for(int i=0;i<count;i++) {
				show(i);
			}
		}
		else {
			System.out.println("검색할 데이터가 없습니다.");
		}
	}
	
	public void searchIvl() {
		if(count != 0) {
			int searchIdx = searchIndex("검색");
			
			if(searchIdx != -1) {
				System.out.println("학생명\t국어\t수학\t영어\t총점\t평균");
				show(searchIdx);
			}
			else {
				System.out.println("조회할 학생이 존재하지 않습니다.");
			}
			
			System.out.println("계속하시겠습니까? 계속하려면 아무키: 종료시  n");
			if(scan.next().equals("n")) {
				System.out.println("학생 조회 종료");
			}
			else {
				searchIvl();
			}
		}
		else{
			System.out.println("검색할 학생 데이터가 존재하지 않습니다");
		}
	}
	
	public void update() {
		if(count != 0) {
			int searchIdx = searchIndex("수정");
		
			if(searchIdx != -1) {
				System.out.print(subject[0]+"점수");
				sList[searchIdx].kor = scan.nextInt();
				System.out.print(subject[1]+"점수");
				sList[searchIdx].math = scan.nextInt();
				System.out.print(subject[2]+"점수");
				sList[searchIdx].eng = scan.nextInt();
				System.out.println("수정 완료");
				
				System.out.println("학생명\t국어\t수학\t영어\t총점\t평균");
				show(searchIdx);
			}
			else {
				System.out.println("수정할 학생이 존재하지 않습니다.");
			}
			
			System.out.println("계속하시겠습니까? 계속하려면 아무키: 종료시  n");
			if(scan.next().equals("n")) {
				System.out.println("학생 수정 종료");
			}
			else {
				update();
			}
		}
		else {
			System.out.println("수정할 데이터가 없습니다.");
		}
	}
	
	public void delete() {
		if(count != 0) {
			int searchIdx = searchIndex("삭제");
			
				if(searchIdx != -1) {
					for(int i=searchIdx;i<count-1;i++) {
						sList[i] = sList[i+1];
					}
					sList[count-1] = null;
					count--;
				}
				else {
					System.out.println("삭제할 학생이 존재하지 않습니다");
				}
			
				System.out.println("계속하시겠습니까? 계속하려면 아무키: 종료시  n");
				if(scan.next().equals("n")) {
					System.out.println("학생 삭제 종료");
				}
				else {
					delete();
				}	
			}
		else{
				System.out.println("데이터가 존재하지않습니다.");
			}
		}
	
	
	
	public int searchIndex(String want) {
		System.out.println(want+"할 학생을 입력해주세요");
		String searchName = scan.next();
		int searchIdx = -1;
		for(int i=0;i<count;i++) {
			if(searchName.equals(sList[i].name)) {
				searchIdx = i;
				break;
			}
		}
		return searchIdx;
	}
	
	public void show(int index) {
		System.out.print(sList[index].name+"\t");
		System.out.print(sList[index].kor+"\t");
		System.out.print(sList[index].math+"\t");
		System.out.print(sList[index].eng+"\t");
		System.out.print(sList[index].getTot()+"\t");
		System.out.print(sList[index].getAvg()+"\n");
	}
	


}
