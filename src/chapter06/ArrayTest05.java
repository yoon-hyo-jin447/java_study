package chapter06;

public class ArrayTest05 {

	public static void main(String[] args) {
		int[] nlist = new int[3];
//		nlist[0] = "1";  //Type mismatch
		nlist[2] = 99;	//Runtime시에 ArrayIndexOutOfException 발생
		
		System.out.println(nlist.hashCode());
		
		for(int i=0 ;i<nlist.length ; i++) {
			System.out.println(nlist[i]);			
		}

	}

}
