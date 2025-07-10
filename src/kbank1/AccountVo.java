package kbank1;

public class AccountVo {
	private  int account = 11111111;
	private  String name = "홍길동";
	private  int password = 1111;
	private  int sum = 500;
	static int count = 0;
	
	private static AccountPaperVo1[] bank = new AccountPaperVo1[10];
	private static AccountVo accountvo = new AccountVo();

	
	
	
	private AccountVo() {}
	
	public static AccountVo getInstance() {
		return accountvo;
	}
	
	public static void setInformation(String name,int account,int sum,int passsword) {
		bank[count] = new AccountPaperVo1(name,account,sum,passsword);
		count++;
	}
	public AccountPaperVo1 getVo(int number) {
		return bank[number];
	}
	
	
	public int getSum() {
		return sum;
	}

	public  void setSum(int sum) {
		this.sum = sum;
	}

	public   int getAccount() {
		return account;
	}

	public  String getName() {
		return name;
	}

	public int getPassword() {
		return password;
	}
	
}
