package chapter05;

import java.util.Scanner;

public class DrinkOrderTestVer1 {

	public static void main(String[] args) {
		//지역 변수 선언
		Scanner scan =  new Scanner(System.in);
		int menuNo = 0;
		boolean menuFlag = true;
		String menuName ="";
		int price = 0;
		String menuPriceOutput = "";
		
		
		
		
		//step 1 : 메뉴판 출력
		System.out.println("===메뉴판===");
		System.out.println("☕ 아메리카노 - 2,800원");
		System.out.println("🍵 바닐라 라떼 - 3,500원");
		System.out.println("🥤 딸기 쉐이크 - 4,000원");
		System.out.println("--------------------------");
		
		//step 2: 메뉴 주문 가능	
		while(menuFlag) {
			System.out.println("주문할 메뉴 번호 입력> ");
			if(scan.hasNextInt()) {
				//선택 메뉴번호를 체크하여 메뉴명, 메뉴가격을 별도의 변수에 저장
				menuFlag = false;
				menuNo=scan.nextInt();
				switch(menuNo) {
				case 1 :
					menuName = "아메리카노"; price = 2800;
					
					break;
				case 2 :
					menuName = "바닐라 라떼"; price = 3500;
					
					break;
				case 3 :
					menuName = "딸기쉐이크"; price = 4000;
					
					break;
				default :
					System.out.println("메뉴 준비중입니다 ");
					menuFlag = true;
				}
//				menuFlag = false;
				//출력용 메뉴가격 저장
				menuPriceOutput = String.format("%,d", new Object[] {Integer.valueOf(price)});
			} else {
				System.out.println("올바르지 않은 값입니다. 다시 입력해주세요");
				scan.next();
			}
		}
		System.out.println("-- step1 종료 --");
		System.out.println("주문하신 음료는" + menuName + "입니다"+" 가격은 " + price + " 입니다");
		
		//step3: 메뉴 결제 기능
		
		//step4: 메뉴 
		
		
	}

}
