package myTest1;

import java.util.Scanner;

public class OrderSystem {
	//Field
	Scanner scan = new Scanner(System.in);
	String[] foodList = {"햄버거(🍔)","피자요(🍕)","라멘요(🍜)","샐러드(🥗)"};
	int[] foodPrice = {100,200,300,400};
	Food[] menuList  = new Food[4];
	Food[] orderedList = new Food[4];
	int orderCount = 0;
	int paidCount = 0;
	
	
	
	//Constructor
	
	//Method
	public void showMenu() { //전체 메뉴 화면
		System.out.println("************************");
		System.out.println("welcome to Food mart!!!");
		System.out.println("1. 음식주문\t2. 주문 내역");
		System.out.println("3. 음식 결제\t4. 결제 내역");
		System.out.println("9. 프로그램 종료");
		System.out.println("************************");
		System.out.println("메뉴를 선택해주세요");
		if(scan.hasNextInt()) {
			int menu = scan.nextInt();
			menuSelect(menu);
		}
		else {
			System.out.println("잘못입력하셨습니다 숫자로 입력해주세요");
			showMenu();
		}
	}
	
	public void menuSelect(int menu) {// 메뉴 선택에 대한 이동
		switch(menu) {
		case 1:
			foodOrder();
			break;
		case 2:
			orderList();
			break;
		case 3:
			foodPay();
			break;
		case 4:
			payList();
			break;
		case 9:
			System.exit(0);
			break;
		default :
			System.out.println("주문하신 메뉴가 존재하지 않습니다.");
			showMenu();
			
		}
	}//menuSelect 종료
	public void menuProvide() {
		System.out.println("음식 주문 화면입니다.");
		System.out.println("**************************************");
		for(int i=0;i<menuList.length;i++) {
			Food food = new Food();
			food.no = i+1;
			food.name = foodList[i];
			food.price = foodPrice[i];
			menuList[i] = food;
		}	
	}
	
	public void foodOrder() { // 음식 주문
		menuProvide();
		orderCheck();
	}
	
	
	
	public void orderCheck() { //메뉴가 잘 선택되었는지 검사
		System.out.println("메뉴를 선택해주세요(숫자)");
		if(scan.hasNextInt()) {
			int foodNumber = scan.nextInt();
				if(1<= foodNumber && foodNumber <=4) {
					order(foodNumber);
				}
				else {
					System.out.println("메뉴 준비중입니다");
				}
				
		}
		else {
			System.out.println("잘못 입력하셨습니다 숫자로 입력해주세요");
		}
		foodOrder();
		
	}//orderCheck 종료
	
	
	public void order(int foodNumber) {
		int repeatIdx = -1;
		
		if(repeatIdx == -1 ) {
		System.out.println("주문하신 메뉴는 "+foodNumber);
		orderedList[orderCount] = new Food();
		orderedList[orderCount].no = menuList[foodNumber].no;
		orderedList[orderCount].name = menuList[foodNumber].name;
		orderedList[orderCount].price = menuList[foodNumber].price;
		System.out.println("주문 완료");
		orderCount++;
		}
		else {
			orderedList[repeatIdx].qty +=1;
		}
	}
	
	
	public void orderList() {
		System.out.println("주문리스트 화면입니다 ");
		System.out.println("음식번호\t음식명\t가격\t갯수");
		for(Food food : orderedList) {
			System.out.print(food.no);
			System.out.print(food.name);
			System.out.print(food.price);
			System.out.print(food.qty);
		}
			
			
	}
	public void foodPay() {
		
	}
	public void payList() {
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
