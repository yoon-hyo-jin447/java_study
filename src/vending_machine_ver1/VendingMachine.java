package vending_machine_ver1;

import commons.Menu;

//공통 틀이나 기능들을 모으는게 공통모듈
public class VendingMachine {
	String[] nameList = {"☕ 밀크커피","☕ 아메리카노","🍋 유자차 ", "🥛 우유 "};
	int[] priceList = {300,400,300,200};
	Menu[] menuList;
	String title;
	
	
	
	public VendingMachine() {
		this("막심");
	}
	public VendingMachine(String title) {
		this.title = title;
		createMenuList();
		showMenuList();
	}
	
	/*
	 * 메뉴 출력
	 */
	public void showMenuList() {
		System.out.println("----------------------------");
		System.out.println("-----☕☕🥤------"+title+" Coffee Menu-------------");
		System.out.println("----------------------------");
	for(Menu menu : menuList) {
		System.out.print(menu.getNo() +"\t");
		System.out.print(menu.getName()+"\t");
		System.out.print(String.format("%,d",menu.getPrice())+"원\n");
	}
		System.out.println("----------------------------");
	}
	
	
	
	/*
	 * 메뉴 리스트 생성
	 */
	public void createMenuList() {
		menuList = new Menu[nameList.length];
		for(int i=0;i<nameList.length;i++) {
			int no = i+1;
			String name = nameList[i];
			int price = priceList[i];
			
			Menu menu = new Menu(no, name, price); //이렇게 짜도된다.
			menuList[i] = menu;
		}		
	}
	
	
	
	
	
}
