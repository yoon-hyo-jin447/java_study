package myTest;

import java.util.Scanner;

public class OrderProgram {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int menuNum = -1;
		String menuName = "";
		int price = -1;
		int charge = 0;
		int change = 0;
		boolean flag = true;
		boolean chargeFlag = true;
		System.out.println("\t======메뉴판======");
		System.out.println("\t 1 ☕ 아메리카노 - 2,800원 ");
		System.out.println("\t 2 🧃 바닐라 라떼 - 3,500원");
		System.out.println("\t 3 🍓딸기 쉐이크 - 4,000원");
		System.out.println("메뉴 번호를 입력해주세요");
//		menuNum = scan.nextInt();
		while(flag) {
		if(scan.hasNextInt()) {
			menuNum = scan.nextInt();
			flag = false;
				switch(menuNum) {
					case 1:
						menuName = "아메리카노"; price = 2800;
						break;
					case 2:
						menuName = "바닐라 라떼"; price = 2800;
						break;
					case 3:
						menuName = "딸기 쉐이크"; price = 2800;
						break;
					default:
						System.out.println("메뉴 준비중입니다 다시 골라주세요");
						flag = true;
					}
		}
		else {
			System.out.println("잘못된 입력입니다 숫자 한자리로 입력해주세요");
			scan.nextLine();
			
		}
		}
		System.out.println("주문하신 음료는 "+menuName+" 입니다"+" 가격은 "+price+" 입니다");
		
		System.out.println("돈을 넣어주세요");
		while(chargeFlag) {
			if(scan.hasNextInt()) {
				chargeFlag = false;
				charge += scan.nextInt();
			 	if(charge >= price) {
			 		change =  price - charge;
			 	}
			 	else {
			 		System.out.println("금액이 너무 적습니다");
			 		System.out.println("지금까지 지불한 금액 : "+charge);
			 		chargeFlag = true;
			 		
			 		
			 	}
			}
			else {
				System.out.println("잘못 입력하셨습니다 금액을 입력해주세요");
				scan.nextLine();
			}
		}
		System.out.println("결제되었습니다 잔돈은"+change+" 입니다");
		
	}
}
