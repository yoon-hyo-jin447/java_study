package chapter07;

import java.util.Scanner;

/*
 * - 학생 3명의 점수를 입력 받는다. 
 * - 한 명 입력 후 계속 입력 여부를 메시지로 출력 후 입력 받는다.
 */
public class ScoreMgmSystem {
	//Field
	String admin;
	Student student;
	Scanner scan = new Scanner(System.in);
	Student[] sList = new Student[10];
	int count = 0;
	
	//Constructor
	public ScoreMgmSystem() {}
	
	//Method
	/*
	 * 메뉴 선택
	 * 
	 */
	public void showMenu() {
		System.out.println("-----------------------------------------");
		System.out.println("더조은 고등학교 성적관리 프로그램");		
		System.out.println("-----------------------------------------");
		System.out.println("1. 학생 등록");		
		System.out.println("2. 학생 리스트 출력");		
		System.out.println("3. 학생 성적 검색");		
		System.out.println("4. 학생 성적 수정");		
		System.out.println("5. 학생 삭제");		
		System.out.println("9. 프로그램 종료");		
		System.out.println("-----------------------------------------");
		System.out.print("메뉴선택(숫자)> ");
//		int menu = scan.nextInt();
//		choiceMenu(menu);
		
		menuCheck(scan.nextInt());
	}
	
	/*
	 * 선택한 메뉴에 따라 기능별 메소드 호출
	 */
	public void menuCheck(int menu) {
		switch(menu) {
		case 1: 
			insert();
			showMenu(); // 재귀 호출
			break;
		case 2:
			showList();
			showMenu();
			break;
		case 3:
			search();
			showMenu();
			break;
		case 4:
			update();
			showMenu();
			break;
		case 5:
			remove();
			showMenu();
			break;
		case 9:
			System.out.println("--성적관리 시스템 종료--");
			System.exit(0);
		default :
			System.out.println("=> 메뉴 준비 중~");
			showMenu();
		}
		
		
	}
	
	public void insert() {
		System.out.println("=> 학생 정보 등록하세요");
		sList[count] = new Student();
		
		System.out.print("학생명> ");
		sList[count].name = scan.next();
		
		System.out.print("국어> ");
		sList[count].kor = scan.nextInt();
		
		System.out.print("영어> ");
		sList[count].eng = scan.nextInt();
		
		System.out.print("수학> ");
		sList[count].math = scan.nextInt();
		
		count++;
		System.out.println("=> 등록 완료!!");
		
		System.out.print("계속 등록(아무키), 종료(n)?> ");
		if(scan.next().equals("n")) {
			showMenu();
		}
		else {
			insert();
		}
		
		
		
	}
	
	public void showList() {
		if(count !=0) {
		System.out.println("--------------------------------");
		System.out.print("학생명\t국어\t영어\t수학\t총점\t평균\n ");
		System.out.println("--------------------------------");
		int i = 0;
		for(Student student : sList) { // student sList에 주소가 저장된다 반복하면서 기존에있던student는 삭제되고 다시 새롭게 저장된다
										//그러면서 slist에 주소가 저장되면서 하나의 힙저장소에 두개가 연결된다
										//student = new Student(); 처럼 하나씩생성하고 삭제
//			if(i<count) {
//			System.out.print(student.name +"\t");
//			System.out.print(student.kor +"\t");
//			System.out.print(student.eng +"\t");
//			System.out.print(student.math +"\t");
//			System.out.print(student.getTot() +"\t");
//			System.out.print(student.getAvg() +"\n");
//			}
//			i++;
			if(student != null) {
				System.out.print(student.name +"\t");
				System.out.print(student.kor +"\t");
				System.out.print(student.eng +"\t");
				System.out.print(student.math +"\t");
				System.out.print(student.getTot() +"\t");
				System.out.print(student.getAvg() +"\n");
				} else {
//					System.out.print("i="+i);
					break;}
//				i++;
		}
		}
		else {
			System.out.println("등록된 데이터 없음, 등록부터 진행해 주세요");
		}
	}
	
	
	public void update() {
		//1. 수정할 학생명이 존재여부 검색 : 유-> 새로운 성적 입력 후 수정
		//1. 수정할 학생명이 존재여부 검색 : 무-> 검색 데이터 존재X, 반복진행
		if(count != 0) { //데이터 등록 여부 체크
			
//				System.out.print("[수정]학생명 검색> ");
//				String modifiedName = scan.next();
				int modiIdx = searchIndex("[수정]");
				
//				for(int i=0; i<count; i++) {
//					if(sList[i].name.equals(modifiedName)) modiIdx = i;
//				}
				
				if(modiIdx == -1) {
					System.out.println("수정할 데이터가 존재X, 다시 입력해주세요");
				} else {
//					String oldName = sList[modiIdx].name;//새로 생성된 객체에 학생명 복사
//					sList[modiIdx] = new Student();	
//					String[] subjectList = {"국어", "영어", "수학"};
					
//					sList[modiIdx].name = oldName;
					System.out.print("국어> ");
					sList[modiIdx].kor = scan.nextInt();
					
					System.out.print("영어> ");
					sList[modiIdx].eng = scan.nextInt();
					
					System.out.print("수학> ");
					sList[modiIdx].math = scan.nextInt();	
					
					System.out.println("=> 수정 완료!!");
					
					appearSystem(modiIdx);
//					System.out.println("--------------------------------");
//					System.out.println("\t\t 검색 결과");
//					System.out.print("학생명\t국어\t영어\t수학\t총점\t평균\n ");
//					System.out.println("--------------------------------");
//					System.out.print(sList[modiIdx].name +"\t");
//					System.out.print(sList[modiIdx].kor +"\t");
//					System.out.print(sList[modiIdx].eng +"\t");
//					System.out.print(sList[modiIdx].math +"\t");
//					System.out.print(sList[modiIdx].getTot() +"\t");
//					System.out.print(sList[modiIdx].getAvg() +"\t");
//					System.out.println("--------------------------------");
				
					System.out.print("계속 수정?(계속:아무키나누르세요, 종료:n)> ");
					if(scan.next().equals("n")) {
						showMenu();
					}
					else update();
				}
		} else {
			System.out.println("=> 등록된 데이터가 없습니다. 등록을 진행해 주세요.");
		}
	}
	
	public void remove() {
		if(count != 0 ) {
//			System.out.print("[삭제]학생명 검색> ");
//			String deletName =  scan.next();
			int deleteIdx = searchIndex("[삭제]");
//			for(int i=0;i<count;i++) {
//				if(sList[i].name.equals(deletName)) {
//					deleteIdx =i;
//				}
//			}
			
			if(deleteIdx != -1) {
				for(int i=deleteIdx;i<count-1;i++) {
					sList[i] = sList[i+1];
				}
				sList[count-1] = null;
				count--;
				System.out.println("삭제완료");
				System.out.print("계속 삭제?(계속:아무키나누르세요, 종료:n)> ");
				if(scan.next().equals("n")) {
					showMenu();
				}
				else remove();
				
				
			}
			else {
				System.out.println("삭제할 데이터가 존재X, 다시 입력해주세요");
			}
			
			
			
			
		}else {
			System.out.println("=> 등록된 데이터가 없습니다. 등록을 진행해 주세요.");
		}

	}
	
	
	
	/*
	 * 학생명을 검색하여 주소를 리턴하는 메소드
	 */
	
	public int searchIndex(String pname) { //ctrl누르고  해당 메소드 클릭하면 거기도 이동한다
		System.out.println(pname+"학생명>");
		String searchName =  scan.next();
		int searchIdx = -1;
		for(int i=0;i<count;i++) {
//			Student student = sList[i];//이렇게 하는게 좀 더 괜찮다
			if(sList[i].name.equals(searchName)) searchIdx = i;		
		}
		
		return searchIdx;
	}
	
	
	
	public void search() {
		if(count != 0) {
//		System.out.println("=> 학생 정보를 입력해주세요");
//		System.out.println("학생명 검색;");
//		String searchName =  scan.next();
		int searchIdx = searchIndex("[검색]");
//		for(int i=0;i<count;i++) {
//			Student student = sList[i];//중요
//			if(student.name.equals(searchName)) searchIdx = i;		
//		}
		
		if(searchIdx != -1) {
			appearSystem(searchIdx);
//		System.out.println("--------------------------------");
//		System.out.println("\t\t 검색 결과");
//		System.out.print("학생명\t국어\t영어\t수학\t총점\t평균\n ");
//		System.out.println("--------------------------------");
//		System.out.print(sList[searchIdx].name +"\t");
//		System.out.print(sList[searchIdx].kor +"\t");
//		System.out.print(sList[searchIdx].eng +"\t");
//		System.out.print(sList[searchIdx].math +"\t");
//		System.out.print(sList[searchIdx].getTot() +"\t");
//		System.out.print(sList[searchIdx].getAvg() +"\t");
//		System.out.println("--------------------------------");
		
		
		System.out.print("계속 검색 하시겠습니까?(계속: 아무키나 누르세요, 종료:n ");
		if(scan.next().equals("n")) {
			showMenu();
		}
		else search();
		
		} else {
		System.out.print("=> 검색 데이터 없음 ");
		
		System.out.print("계속 검색 하시겠습니까?(계속: 아무키나 누르세요, 종료:n ");
		if(scan.next().equals("n")) {
			showMenu();
		}
		else search();
		}
		
		
		}else {
			System.out.println("등록된 데이터 없음, 등록부터 진행해 주세요");
		}	
	}//search	
	
	
	
	public void appearSystem(int number) {
		System.out.println("--------------------------------");
		System.out.println("\t\t 검색 결과");
		System.out.print("학생명\t국어\t영어\t수학\t총점\t평균\n ");
		System.out.println("--------------------------------");
		System.out.print(sList[number].name +"\t");
		System.out.print(sList[number].kor +"\t");
		System.out.print(sList[number].eng +"\t");
		System.out.print(sList[number].math +"\t");
		System.out.print(sList[number].getTot() +"\t");
		System.out.print(sList[number].getAvg() +"\t");
		System.out.println("--------------------------------");
		
	}
	
}//class
