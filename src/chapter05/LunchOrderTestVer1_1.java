package chapter05;

import java.util.Scanner;

public class LunchOrderTestVer1_1 {
//	static int menuNumber;
//	static String menuName;
//	static int price;
//	static int charge;
//	static int change;

	public static void main(String[] args) {
		//메뉴판
		System.out.println("**********************************");
		System.out.println("\t Welcome to Food Mart!!!");
		System.out.println("**********************************");
		System.out.println("\t 1. 햄버거(🍔):100\t2. 피자(🍕):200");
		System.out.println("\t 3. 라멘(🍜):300\t4. 샐러드(🥗):400");
		System.out.println("\t 9. 나가기");
		System.out.println("**********************************");
		
		check();
//		Scanner scan = new Scanner(System.in);
//		int menuNumber=0;
//		String menuName="";
//		int price=0;
//		int charge = -1;
//		int change = -1;
//		int menuNumber2 = -1;
		
		//1.메뉴선택
//		System.out.println("메뉴를 선택해주세요 숫자로 선택바랍니다");
////		if(scan.hasNextInt()) {
////				menuNumber = scan.nextInt();
////			switch(menuNumber) {
////				case 1: menuName = "햄버거"; price = 100;  
////					break;
////				case 2: menuName = "피자"; price = 200;  
////					break;
////				case 3: menuName = "라멘"; price = 300;  
////					break;
////				case 4: menuName = "샐러드"; price = 400;  
////					break;
////				case 9: System.out.println("나가기"); System.exit(0);
////					break;
////				default : System.out.println("메뉴가 준비중입니다");
////				
////				
////			}//스위치문 종료
////			
////		} else {
////			System.out.println("올바르지않은 값입니다");
////			
////		}//if문 끝남
//		
////		if(scan.hasNextInt()) {
////			menuNumber = scan.nextInt();
////			if(menuNumber==1) {
////				menuName = "햄버거"; price = 100; 
////			} else if(menuNumber==2) {
////				menuName = "피자"; price = 200; 
////			} else if(menuNumber==3) {
////				menuName = "라멘"; price = 300; 
////			} else if(menuNumber==4) {
////				menuName = "샐러드"; price = 400; 
////			} else {
////				System.out.println("메뉴가 준비중입니다");
////				menuNumber2 = scan.nextInt();
////			}
////		} else {
////			System.out.println("잘못된 입력입니다.");
////		}
//	
//		
//		System.out.println("주문하신 메뉴는" + menuName + "입니다 가격은 " + price + "입니다");
//		System.out.println("결제를 진행하겠습니다 지불하실 금액을 입력해주세요");
//		
//		//주문 메뉴 결제
//		if(scan.hasNextInt()) {
//			charge = scan.nextInt();
//			if(charge >= price) {
//				change = charge - price;
//			} else {
//				System.out.println("지불하신 금액이 적습니다");
//			}
//		} else {
//			System.out.println("올바르지 않은 입력값입니다.");
//		}
//		
//		System.out.println("주문한 메뉴는 " + menuName + " 입니다" + " 결제금액은 " + price + "원 입니다" + "잔돈은 " + change +"원 입니다.");
//		//3.주문 내역 출력 : 주문한 메뉴는 (햄버거), 결제금액(), 잔돈() 입니다.
//		
	}	
		public static void check() {
		    Scanner scan = new Scanner(System.in);
		    int menuNumber = 0;
		    String menuName = "";
		    int price = 0;
		    int charge = -1;
		    int change = -1;

		    // 메뉴 선택 루프
		    while (true) {
		        System.out.println("메뉴를 선택해주세요 숫자로 선택바랍니다");
		        if (scan.hasNextInt()) {
		            menuNumber = scan.nextInt();
		            if (menuNumber == 1) {
		                menuName = "햄버거"; price = 100; break;
		            } else if (menuNumber == 2) {
		                menuName = "피자"; price = 200; break;
		            } else if (menuNumber == 3) {
		                menuName = "라멘"; price = 300; break;
		            } else if (menuNumber == 4) {
		                menuName = "샐러드"; price = 400; break;
		            } else if (menuNumber == 9) {
		                System.out.println("나가기"); System.exit(0);
		            } else {
		                System.out.println("메뉴가 준비중입니다");
		            }
		        } else {
		            System.out.println("잘못된 입력입니다. 숫자를 입력해주세요.");
		            scan.next(); // 잘못된 입력 소비
		        }
		    }

		    System.out.println("주문하신 메뉴는 " + menuName + "입니다 가격은 " + price + "입니다");
		    System.out.println("결제를 진행하겠습니다 지불하실 금액을 입력해주세요");

		    // 결제 루프
		    while (true) {
		        if (scan.hasNextInt()) {
		            charge = scan.nextInt();
		            if (charge >= price) {
		                change = charge - price;
		                break;
		            } else {
		                System.out.println("지불하신 금액이 적습니다. 다시 입력해주세요.");
		            }
		        } else {
		            System.out.println("올바르지 않은 입력값입니다. 숫자를 입력해주세요.");
		            scan.next(); // 잘못된 입력 소비
		        }
		    }

		    System.out.println("주문한 메뉴는 " + menuName + " 입니다. 결제금액은 " + price + "원, 잔돈은 " + change + "원입니다.");
		}

		
		
		
		

		
		
	}
	
	
