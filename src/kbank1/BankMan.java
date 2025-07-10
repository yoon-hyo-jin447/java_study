package kbank1;

public class BankMan {
  public String name;
  
  public BankMan() {}
  public BankMan(String name) {
	  this.name = name;
  }
  
  
  public boolean getInformation(AccountPaperVo accountPaper, AccountVo dataBase) {
	  boolean result = false;
	  if(accountPaper.getName() == dataBase.getVo(0).getName()) {
		  if(accountPaper.getAccount() == dataBase.getAccount()) {
			  if(accountPaper.getPassword() == dataBase.getPassword()) {
				  if(dataBase.getSum()> accountPaper.getwithDraw()) {
					  result = true;
				  }
				  
				 
			  }
		  }
		  
	  }
	  return result;
  }
  
}
