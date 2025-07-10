package kbank1;

public class AccountPaperVo1 {
	private  String name;
	private int account;
	private int sum;
	private int password;
	
	public AccountPaperVo1() {}

	
	public AccountPaperVo1(String name, int account, int sum, int password) {
		this.name = name;
		this.account = account;
		this.sum = sum;
		this.password = password;
		
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAccount() {
		return account;
	}

	public void setAccount(int account) {
		this.account = account;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public int getPassword() {
		return password;
	}

	public void setPassword(int password) {
		this.password = password;
	}

	
	
	
	
}
