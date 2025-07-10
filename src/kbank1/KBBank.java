package kbank1;

public class KBBank {

	public static void main(String[] args) {
		AccountVo dataBase = AccountVo.getInstance();
		AccountVo.setInformation("홍길동",11111111,500,1111);
		BankMan man =  new BankMan("박보검");
		Customer client = new Customer("홍길동");
		
		AccountPaperVo accountPaper = AccountPaperVo.getInstance();
		client.setName("홍길동");
		client.setAccount(11111111);
		client.setWithDraw(100);
		client.setPassword(1111);
		
		
	
		
		accountPaper.setName(client.getName());
		accountPaper.setAccount(client.getAccount());
		accountPaper.setWithDraw(client.getWithDraw());
		accountPaper.setPassword(client.getPassword());
		
		
		
		if(man.getInformation(accountPaper, dataBase)) {
			int restSum = dataBase.getSum() - accountPaper.getwithDraw();
			dataBase.setSum(restSum);
			System.out.println(dataBase.getSum());
		}
		else {
			System.out.println("인증이 되지 않았습니다");
		}
		
		
		
		
		
		

	}

}
