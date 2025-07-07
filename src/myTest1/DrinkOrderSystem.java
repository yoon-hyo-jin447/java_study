package myTest1;

import java.util.Scanner;

public class DrinkOrderSystem {
//Field
	String[] menu = {"아메리카노","바닐라 라떼","딸기 쉐이크"};
	int[] price = {2800,3500,4000};
	Scanner scan = new Scanner(System.in);
	Menu[]  drinkList = new Menu[3];
	Order[] orderDrink = new Order[3];
	Payment[] paymentList = new Payment[3];
	int orderCount = 0;
	int payCount = 0;
	int charge = 0;
	int change = 0;
	
//Constructor
	
//Method
	
public void createList() {
	for(int i=0;i<drinkList.length;i++) {
		drinkList[i] = new Menu();
		drinkList[i].no = i+1;
		drinkList[i].name = menu[i];
		drinkList[i].price = price[i];
	}
}
public void DrinkShow() {
	System.out.println("**************************");
	System.out.println("메뉴 주문 화면입니다");
	System.out.println("1.☕ 아메리카노 - 2,800원 ");
	System.out.println("2. 🍵 바닐라 라떼 - 3,500원");
	System.out.println("3. 🥤 딸기 쉐이크 - 4,000원");
	System.out.println("**************************");
	System.out.println("메뉴 번호를 입력해주세요!(숫자)");
	createList();
	if(scan.hasNextInt()) {
		int menuNumber = scan.nextInt();
		menuSelect(menuNumber);
	}
	else {
		System.out.println("숫자로 입력해주세요");
	}
}
	
public void menuSelect(int menuNumber) {
	if(1<= menuNumber && menuNumber <=3) {
		System.out.print("주문하신 메뉴 : "+drinkList[menuNumber-1].name+"\t");
		System.out.println("결제 예정 금액 : "+ drinkList[menuNumber-1].price+"원");
		BasketSet(menuNumber);
	}
	else {
		System.out.println("메뉴 준비중입니다.");
		DrinkShow();
	}
}

public void BasketSet(int menuNumber) {
	int idx = findRepeat(menuNumber);
	if(idx == -1) {
	orderDrink[orderCount] = new Order();
	 orderDrink[orderCount].no = drinkList[menuNumber-1].no;
	 orderDrink[orderCount].name = drinkList[menuNumber-1].name;
	 orderDrink[orderCount].price = drinkList[menuNumber-1].price;
	 orderDrink[orderCount].qty =1;
	 orderCount++;
	}
	else {
		orderDrink[idx].qty += 1;
	}
	
	System.out.println("장바구니에 추가가 완료되었습니다");
	System.out.println("장바구니에 더 담으시겠습니까? 계속하려면 아무키나: 종료시 n");
	if(scan.next().equals("n")) {
		pay();
	}
	else {
		DrinkShow();
	}
	
}

public int findRepeat(int menuNumber) {
	int searchIdx = -1;
	for(int i=0;i<orderCount;i++) {
		if(orderDrink[i].no == menuNumber ) {
			searchIdx = i;
		}
	}
	return searchIdx;
}

public void pay() {
	System.out.println("결제 화면입니다");
	int totalAmount = 0;
	totalAmount = mustPay();
	System.out.println("결제해야할 금액"+totalAmount);
	System.out.println("금액은 넣어주세요");
	
	if(scan.hasNextInt()) {
		charge += scan.nextInt();
		if(charge>=totalAmount) {
			change = charge - totalAmount;
			System.out.println("결제완료");
			
			paymentList[payCount] = new Payment();
			paymentList[payCount].name =  orderDrink[0].name+"~등";
			paymentList[payCount].amount = totalAmount;
			paymentList[payCount].charge = charge;
			paymentList[payCount].change = change;
			payCount++;
			showPaymentList();
			
		}
		else {
			System.out.println("금액이 부족합니다");
		}
	}
	else {
		System.out.println("금액을 잘못입력하셨습니다 다시 입력해주세요");
	}
	pay();
}


public int mustPay() {
	int sum = 0;
	for(int i=0;i<orderCount;i++) {
		sum += orderDrink[i].price* orderDrink[i].qty;
	}
	return sum;
	
}

public void showPaymentList() {
	System.out.println("주문 내역입니다");
	System.out.println("메뉴명\t총금액\t결제금액\t잔돈");
	for(int i=0;i<payCount;i++) {
		System.out.print(paymentList[i].name +"\t");
		System.out.print(paymentList[i].amount+"\t");
		System.out.print(paymentList[i].charge+"\t");
		System.out.print(paymentList[i].change+"\n");
	}
	System.out.println("감사합니다");
	DrinkShow();
	
}







}
