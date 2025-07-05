package myTest;

import java.util.Scanner;

public class ScoreMgmSystemSvr {

	public static void main(String[] args) {
		ScoreMgmSystem sms = new ScoreMgmSystem();
		Scanner scan = new Scanner(System.in);
		int count = 0;
		for(int i=0;i<5;i++) {
			System.out.println("관리자 아이디를 입력해주세요");
			String admin = scan.next();
			System.out.println("관리자 비밀번호를 입력해주세요");
			int password = scan.nextInt();
			
			if(admin.equals(Admin1.sendAdmin()) && password == Admin1.sendPassword()) {
			sms.menuShow();
			}
			else {
				System.out.println("비밀번호와 암호가 다릅니다 다시 입력해주세요");	
				System.out.println("비밀번호와 암호가 다릅니다 다시 입력해주세요");
			}
			
		}
		System.out.println("5회 잘못입력하셨습니다 종료하겠습니다");	
		
		
	}

}
