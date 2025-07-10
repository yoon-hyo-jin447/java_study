package kbank1;

public class Customer {
	String name;
	private int account;
	private int withDraw;
	private int password;
	
	public Customer() {
		
	}
	
	public Customer(String name) {
		this.name = name;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public int getAccount() {
		return account;
	}

	public void setAccount(int account) {
		this.account = account;
	}

	public int getWithDraw() {
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
