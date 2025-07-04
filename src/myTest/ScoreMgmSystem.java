package myTest;

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
		if(count == 0) {
			System.out.println("수정할 학생이 없습니다");
		}
		else {
			boolean updateFlag = true;
			while(updateFlag) {
			System.out.println("어느 학생을 수정하시겠습니까?");
			String searchName = scan.next(); //scan.next()는 내부적으로 new String(...)처럼 새로운 객체를 생성
			int searchIdx = -1;
			for(int i=0;i<count;i++) {
				if(searchName.equals(sList[i].name)) { // ==을 사용할 때 기본형과 참조형이 섞이면 참조형이 언박싱되어 값 비교가 되고,
					//둘 다 참조형이면 주소 비교가 된다.
					//sList[i].name 이안에 값은 문자열이기때문에 상수풀에 저장되고 주소가 남겨짐.
					//searchName도 scan.next()가 new String으로 새롭게 생성해주기때문에 주소값을 가진다 그렇기때문에 두개를 
					//== 로 비교하면 주소값을 비교하게되니까 안됨
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
		String deleteName =  scan.next();
		int deleteIdx = -1;
		
		
		for(int i=0;i<count;i++) {
			if(deleteName.equals(sList[i].name )) {
				deleteIdx = i;
			}
		}
		
		for(int i=deleteIdx;i<count-1;i++ ) {
			if(i == count-1) {
				sList[i] = sList[i];
			}
			else {
			sList[i] = sList[i+1];
			}
		}
		count--;
		System.out.println("remove");
		}
		else {
			System.out.println("삭제할 데이터가 존재하지 않습니다");
		}
	}
	public void search() {
		System.out.println("학생성적조회화면입니다.");
		if(count !=0) {
			boolean searchFlag = true;
			while(searchFlag) {
			System.out.println("조회할 학생명");
			String searchName=scan.next();
			int searchIdx = -1;
			for(int i=0;i<count;i++) {
				if(searchName.equals(sList[i].name)) {
					searchIdx = i;
				}
			}
			
			if(searchIdx != -1) {
				System.out.println("학생명\t국어\t영어\t수학\t총점\t평균");
				System.out.print(sList[searchIdx].name);
				System.out.print(sList[searchIdx].kor);
				System.out.print(sList[searchIdx].eng);
				System.out.print(sList[searchIdx].math);
				System.out.print(sList[searchIdx].getTot());
				System.out.print(sList[searchIdx].getAvg());
				
			}else {
				System.out.println("조회한 학생을 찾을 수 없습니다");
			}
			
			System.out.print("더 조회하시겠습니까? 종료할려면 n");
			if(scan.next().equals("n")) {
				searchFlag = false;
			}
			
		}
			
		}
		else {
			System.out.println("조회할 데이터가 없습니다");
		}
	}
	
	
	
	
}