package kbank;


/**
 * 은행에 비치되어 있는 입출금 용지 
 */
public class AccountPaperVo {
	private String name;
	private String accountNumber;
	private int money;
	private String password;
	static AccountPaperVo accountPaper = new AccountPaperVo();
	
	private  AccountPaperVo() {}
	
	public static AccountPaperVo getInstance() {
		return accountPaper;
	}

	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAccountNumber() {
		return accountNumber;
	}


	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}


	public int getMoney() {
		return money;
	}


	public void setMoney(int money) {
		this.money = money;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	
	
	
	
}
