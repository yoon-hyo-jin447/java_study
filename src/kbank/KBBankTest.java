package kbank;

public class KBBankTest {

	public static void main(String[] args) {
		//입출금 용지 한장 비치됨
		AccountPaperVo accountPaper = AccountPaperVo.getInstance();
		System.out.println();
		
		BankMan staffPark = new BankMan("박보검");
		staffPark.showAccountList();
		
		Customer hong = new Customer(null, "kb-1234","1234", 100);
		//고객 홍길동이 출금용지에 이름, 계좌번호, 비밀번호를 작성함
		hong.setAccountPaper(accountPaper);
		
		
//		은행 직원 박보검이 용지를 확인함
//		staffPark.setAccountPaper(hong.getAccountPaper());
		staffPark.check(hong.getAccountPaper(), hong);
		
//		금액이 누락되어 고객에게 금액을 물어봄
		
//		고객이 100만원이라 응답함
//		staffPark.askMoney(hong.answerMoney());
//		
////		은행 직원이 계좌 정보를 검증함
//		staffPark.check();
//		
////		출금 처리를 하고, 잔액 400만원으로 업데이트함
//		staffPark.changeProcess();
//		
////		고객이 잔액을 확인하고 퇴장함
//		hong.confirmBalance();
	}

}
