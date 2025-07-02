package myTest;

import java.util.Scanner;

public class LunchOrderTestVer3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int MAX_SIZE = 100;
		String[] menuList = {"햄버거(🍔)","피자(🍕)", "라멘(🍜)", "샐러드(🥗)"};
		String[] orderMenuList = new String[MAX_SIZE];
		int[] orderPriceList = new int[MAX_SIZE];
		int[] priceList = {100,200,300,400};
		int menuCount = 0;
		
		String[] paymentMenuList = new String[MAX_SIZE];
		int[] totalAmountList = new int[MAX_SIZE];
		int[] paidAmointList =new int[MAX_SIZE];
		int[] changeList = new int[MAX_SIZE];
		int paymentCount = 0;
		boolean menuFlag = true;
		while(menuFlag) {
			System.out.println("******************************************");
			System.out.println("\t Welcome to Food Mart!!!");
			System.out.println("******************************************");
			System.out.println("\t 1. 음식 주문");		
			System.out.println("\t 2. 주문 내역");		
			System.out.println("\t 3. 음식 결제");	
			System.out.println("\t 4. 결제 내역");
			System.out.println("\t 9. 프로그램 종료");		
			System.out.println("******************************************");
			System.out.println("***** Food Mart에 오신것을 환영합니다");
//			int MAX_SIZE = 100;
//			String[] menuList = {"햄버거(🍔)","피자(🍕)", "라멘(🍜)", "샐러드(🥗)"};
//			String[] orderMenuList = new String[MAX_SIZE];
//			int[] orderPriceList = new int[MAX_SIZE];
//			int[] priceList = {100, 200, 300, 400};
//			int menuCount = 0;
			
			
			
			System.out.print("메뉴> ");
			int menu = scan.nextInt();
			boolean orderFlag = true;
				
					switch(menu) {
						case 1:
							while(orderFlag) {
								System.out.println("******************************************");
								System.out.println("\t 1. 햄버거(🍔):100\t 2. 피자(🍕):200");		
								System.out.println("\t 3. 라멘(🍜):300\t 4. 샐러드(🥗):400");		
								System.out.println("******************************************");
								System.out.print("주문 메뉴(숫자로)> ");
								
								
								if(scan.hasNextInt()) {
									int menuNo = scan.nextInt();
									if(1<=menuNo && menuNo<=4) {
										orderMenuList[menuCount] = menuList[menuNo-1];
										orderPriceList[menuCount] = priceList[menuNo-1];
									}
									else {
										System.out.println("메뉴 준비중입니다");
									}
								}
								else {
									System.out.println("=> 올바르지 않은 입력값입니다. 다시 입력해주세요");
									scan.next();
								}//if문 종료
								
								System.out.println("주문을 계속하시겠습니까? 주문화면을 나갈려면 n");
								if(scan.next().equals("n")) {
									orderFlag = false;
								}
								menuCount++;
							}
							break;
						case 2:
							if(menuCount != 0) {
								System.out.println("-----------------------------------------");
								System.out.println("번호\t메뉴명\t가격");
								System.out.println("-----------------------------------------");
								for(int i=0;i<menuCount;i++) {
									System.out.print(i+1+"\t");
									System.out.print(orderMenuList[i]+" \t");
									System.out.print(orderPriceList[i]+"\n");	
								}
							}
							else {
								System.out.println("주문 내역이 없습니다.");
							}
							break;
							
						case 3:
							boolean paymentFlag = true;
							int totalPayment = 0;
							int charge = 0;
							int change = 0;
							for(int i=0;i<menuCount;i++) {
								totalPayment += orderPriceList[i];
							}
							while(paymentFlag) {
								System.out.println("=> 결제 예정 금액 : "+ totalPayment);
								System.out.println("금액을 넣어주세요");
								charge += scan.nextInt();
								
								if(charge >= totalPayment ) {
									change = charge - totalPayment;
									paymentFlag = false;
								}
								else {
									System.out.println("금액이 부족합니다");
									System.out.println("지금까지 넣은 금액"+charge);
									
								}
							}//while문 종료
							totalAmountList[paymentCount] = totalPayment;
							
							paymentMenuList[paymentCount] = orderMenuList[1];
							
							paidAmointList[paymentCount] = charge;
							changeList[paymentCount] = change;
							
							System.out.println("음식 결제 내역------------------------");	
							System.out.println("메뉴명\t결제금액\t잔돈------------------------");
							System.out.print(paymentMenuList[0]+"..등");
							System.out.print(totalAmountList[paymentCount]);
							System.out.print(paymentMenuList[paymentCount]);
							System.out.print(paidAmointList[paymentCount]);
							System.out.print(changeList[paymentCount]+"\n");
							
							System.out.println("결제 완료");
							
							orderMenuList = new String[MAX_SIZE];
							orderPriceList = new int[MAX_SIZE];
							menuCount =0;
							paymentCount++;
							break;
							
						case 4:
							if(paymentCount !=0) {
							System.out.println("\t 4. 결제 내역");
							System.out.println("메뉴명\t결제금액\t지불금액\t잔돈------------------------");
							for(int i=0;i<paymentCount;i++) {
								System.out.print(paymentMenuList[i]+"\t");
								System.out.print(totalAmountList[i]+"\t");
								System.out.print(paidAmointList[i]+"\t");
								System.out.print(changeList[i]+"\n");	
							}
							

							}
							else {
							System.out.println("결제내역이 없습니다");
							}
							break;
							
						case 9:
							System.out.println("\t 9. 프로그램 종료");	
							System.exit(0);
						default:
			
						}
				
		}//while문 종료

	}

}
