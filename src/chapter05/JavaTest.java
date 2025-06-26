package chapter05;

import java.util.Scanner;

public class JavaTest {
 public static void main(String[] args) {
	 //주문화면 생성
	 /* 1.햄버거 가격 :4300
	  * 2.샐러드 가격 :5600
	  * 3.샌드위치 가격 : 4800
	 */
	 //주문 결제
	 //주문 내역
	 System.out.println("**********************");
	 System.out.println("\t주문 화면");
	 System.out.println("1.햄버거 가격: 4300");
	 System.out.println("2.샐러드 가격: 5600 ");
	 System.out.println("3.샌드위치 가격: 4800");
	 System.out.println("**********************");
	 System.out.println("주문하실 메뉴를 번호로 입력해주세요");
	 Scanner scan = new Scanner(System.in);
	 int menuNum = -1;
	 String menuName = "";
	 int price =-1;
	 int charge = 0;
	 int change = -1;
	 int charge1 = -1;
	 
	 while(true) {
	 System.out.println("다시 입력해주세요");
	 if(scan.hasNextInt()) {
		 menuNum = scan.nextInt();
	 
		 if(menuNum == 1) {
			 
		 } else if(menuNum == 1) {
			 	menuName="햄버거"; price=4300;
			 	break;
		 		}
		 	else if(menuNum == 2) {
		 		menuName="샐러드"; price=5600; 
		 		break;
		 	}
		 	else if(menuNum == 3) {
		 		menuName="샌드위치"; price=4800;
		 		break;
		 	}
		 else {
			 System.out.println("메뉴준비중입니다");
		 }
	 }
	 else {
		 System.out.println("메뉴번호만 입력해주세요");
		 scan.nextLine();	 
	 }
	 }
	 
	 System.out.println("잔돈은" +(price - charge)+"입니다");
	 System.out.println("주문음식 "+menuName+" 가격: "+price);
	 while(charge < price) {
		System.out.println("돈을 넣어주세요");
		charge1 = scan.nextInt();
		charge += charge1;
		System.out.println("지금까지 지불하신 금액" + charge);
		}
	 System.out.println("잔돈은" +(charge - price)+"입니다");
	 
	 
}
}