package kbank1;

public class AccountPaperVo {
	private  String name;
	private int account;
	private int withDraw;
	private int password;
	
	static AccountPaperVo accountpaper = new AccountPaperVo();
	
	private AccountPaperVo() {}

	
	
	public static AccountPaperVo getInstance() {
		return accountpaper;
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



	public int getwithDraw() {
		return withDraw;
	}



	public void setWithDraw(int withDraw) {
		this.withDraw = withDraw;
	}



	public int getPassword() {
		return password;
	}



	public void setPassword(int password) {
		this.password = password;
	}	
	
}
