package myTest;

public class Admin {
	static String administration = "윤효진";
	static String password = "yun!";
	
	public Admin() {
		
	}
	
	public static boolean sendAdmin(String a) {
		if(a.equals(administration) ) {
			return true;
		}
		else {
			return false;
		}
	
	}
	
	public static boolean sendPassword(String  b) {
		try {
			if(b.equals(password)) {
				return true;
			}
			else {
				return false;
			}
		}catch(NumberFormatException e){
			System.out.println("숫자로 입력해주세요");
			return false;
		}
	}
	
}
