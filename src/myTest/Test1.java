package myTest;

public class Test1 {

	public static void main(String[] args) {
		//배열기반 안에 값을 변경해도 해시코드가 달라지지않음 주소기반이기때문이다
		int[] strObj1 =  new int[1];
		strObj1[0]=10;
		System.out.println(strObj1); 
		int str1 = 1;
		System.out.println(System.identityHashCode(strObj1));
		System.out.println(strObj1.hashCode()); 
		strObj1[0] = str1;
		System.out.println(System.identityHashCode(strObj1));
		System.out.println(strObj1.hashCode()); 
		System.out.println(strObj1); 
		

	}

}
