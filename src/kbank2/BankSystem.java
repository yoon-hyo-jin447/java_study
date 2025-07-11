package kbank2;


public class BankSystem {
  String name;
  AccountVo[] accountList;
  
  public BankSystem(String name) {
	  this.name = name;
	  accountList = createAccountList();//은행 고객 리스트 생성
  }
  
  
  /**
   * 은행직원이 관리하는 고객 리스트 출력
   */
  public void showAccountList() {
		 System.out.println("=============================================");
		 System.out.println("\t"+name+" 고객 리스트");
		 System.out.println("=============================================");
		 for(int i=0;i<accountList.length;i++) {
			 AccountVo account = accountList[i];
			 System.out.print(i+1 + ".\t");
			 System.out.print(account.getName() + ".\t");
			 System.out.print(account.getAccountNumber()+ ".\t");
			 System.out.print(account.getPassword() + ".\t");
			 System.out.print(account.getBalance() + ".\n");
		 }
		 System.out.println("=============================================");
	 }
  
  
  
  
  public AccountVo[] createAccountList() {
		 String[] names = {"홍길동", "이순신", "김유신"};
		 String[] numbers = {"kb-1234", "kb-9876", "kb-3456"};
		 String[] password = {"1234", "9876", "3456"};
		 int[] balances = {500, 1000, 700};
		 AccountVo[] list = new AccountVo[names.length];
		 
		 for(int i=0;i<names.length;i++) { 
			AccountVo account = new AccountVo();
			account.setName(names[i]);
			account.setAccountNumber(numbers[i]);
			account.setPassword(password[i]);
			account.setBalance(balances[i]);
			list[i] = account;
		 }
		 return list;
	 }
  
  
  /**
   * 계정검색
   * @param accountPaper
   * @return
   */
  public int searchAccount(AccountPaperVo accountPaper) {
	  int resultIdx = -1;
	  for(int i=0;i<accountList.length;i++) {
		  AccountVo account = accountList[i];
	  if(account.getAccountNumber().equals(accountPaper.getAccountNumber()) &&
		account.getPassword().equals(accountPaper.getPassword())) {
		  	resultIdx = i;
		  	break;
	  }
  }
	  return resultIdx;
  }
  
//  public void processWithdrawal(int searchIdx, int money) {
//	  accountList[searchIdx].setBalance(accountList[searchIdx].getBalance()-money);
//  }
  
 
  
  
  public void confirmBalance(AccountPaperVo accountPaper) {
	  int resultIdx = -1;
	  for(int i=0;i<accountList.length;i++) {
		  AccountVo account = accountList[i];
	  if(account.getAccountNumber().equals(accountPaper.getAccountNumber()) &&
		account.getPassword().equals(accountPaper.getPassword())) {
		  	resultIdx = i;
		  	break;
	  }
  }
	  
	if(resultIdx !=  -1) {
		System.out.println("=============================================");
			 System.out.print(accountList[resultIdx].getName() + ".\t");
			 System.out.print(accountList[resultIdx].getAccountNumber()+ ".\t");
			 System.out.print(accountList[resultIdx].getPassword() + ".\t");
			 System.out.print(accountList[resultIdx].getBalance() + ".\n");
	
		 System.out.println("=============================================");
		 System.out.println("[BankSyste] 이용해셔서 감사합니다");
	}else {
		System.out.println("[BankSyste] 일치하는 고객정보가 없습니다.");
	}
	 
	  
	  
  }
}
