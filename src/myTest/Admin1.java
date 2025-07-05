package myTest;

public class Admin1 {
	static String administration = "윤효진";
	static int password = 1111;
	
	public Admin1() {
		
	}
	
	public static boolean sendAdmin(String a) {
		if(a.equals(administration) ) {
			return true;
		}
		else {
			return false;
		}
	
	}
	
	public static boolean sendPassword(int  b) {
		if(b == password) {
			return true;
		}
		else {
			return false;
		}
	}
	
}
