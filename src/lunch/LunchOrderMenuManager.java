package lunch;

public class LunchOrderMenuManager {
	//Field
	LunchOrderSystemOOP system; //전역변수라 초기값은 null
//	String[] lunchMenuNames;
//	int[] lunchMenuPrice;
	
	//Constructor
	public LunchOrderMenuManager() {}
	public LunchOrderMenuManager(LunchOrderSystemOOP system) {
		this.system = system; //이부분 굉장히 중요
//		this.lunchMenuNames = lunchMenuNames;
//		this.lunchMenuPrice =  lunchMenuPrice;
	}
	
	//Method
		/*
		 * 런치메뉴 생성
		 */
		public void createLunchMenu() {
			LunchMenu menu = null; //이렇게 밖에서 선언을 해도되는데 안에서는 꼭 할당해야한다
			for(int i=0;i<system.lunchMenuNames.length; i++) {
				menu = new LunchMenu();
				menu.no = i+1;
				menu.name = system.lunchMenuNames[i];
				menu.price = system.lunchMenuPrice[i];
				
				system.lunchMenuList[i] = menu;
			}		
		}
		
		/*
		 * 런치메뉴 출력
		 */
		public void showLunchMenu() {
			System.out.println("******************************************");
			for(LunchMenu menu : system.lunchMenuList) {
				System.out.print(menu.no + ". ");
				System.out.print(menu.name + "\t");
				System.out.print(menu.price + "\n");
			}
			System.out.println("******************************************");
			selectLunchMenu();
		}
		
		/*
		 * 런치메뉴 선택
		 */
		public void selectLunchMenu() {
			System.out.print("주문메뉴(숫자)> ");
			
			if(system.scan.hasNextInt()) {
				lunchMenuCheck(system.scan.nextInt());			
			} else {
				System.out.println("=> 입력된 값이 바르지 않음. 다시 입력!!");
				system.scan.next();
				selectLunchMenu();
			}
		}
		
		
		/*
		 * 메인메뉴 출력
		 */
		public void showMainMenu() {
			System.out.println("******************************************");
			System.out.println("\t Welcome to ["+system.title+"] Mart!!!");
			System.out.println("******************************************");
			System.out.println("\t 1. 음식 주문");		
			System.out.println("\t 2. 주문 내역");		
			System.out.println("\t 3. 음식 결제");		
			System.out.println("\t 4. 결제 내역");		
			System.out.println("\t 9. 프로그램 종료");		
			System.out.println("******************************************");
			System.out.println("***** Food Mart에 오신것을 환영합니다");	
//			createLunchMenu();
			selectMainMenu();

		}//showMainMenu method
		
		/*
		 * 메인메뉴 선택
		 */
		public void selectMainMenu() {
			System.out.print("메인메뉴(숫자)> ");
			
			if(system.scan.hasNextInt()) {
				mainMenuCheck(system.scan.nextInt());			
			} else {
				System.out.println("=> 입력된 값이 바르지 않음. 다시 입력!!");
				system.scan.next();
				selectMainMenu();
			}
		}
		
		/*
		 * 메인메뉴 체크
		 */
		public void mainMenuCheck(int mainMenu) {
			switch(mainMenu) {
			case 1: showLunchMenu();	break;
			case 2: system.orderList();		break;
			case 3: system.payment();			break;
			case 4: system.paymentList();		break;
			case 9: 
				System.out.println("=> 음식 주문 시스템 종료!!");
				System.exit(0);
				break;
			default:
				System.out.println("=> 메뉴 준비중~");
				showMainMenu();
			}
		}
		
		/*
		 * 런치메뉴 체크
		 */
		public void lunchMenuCheck(int lunchMenu) {
			//lunchMenu : 1~4 => 주문가능, 다른번호 : 메뉴 준비중 => 다시 입력
			if(1<= lunchMenu && lunchMenu <= 4) {
				//주문 진행 
				system.order(lunchMenu);
				
			} else {
				System.out.println("=> 런치 메뉴 준비중~");
				showLunchMenu();
			}
		}
}
