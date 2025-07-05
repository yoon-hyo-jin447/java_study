package myTest;

public class Student {
		//Field
		String name;
		int kor;
		int eng;
		int math;
		//Constructor
		public Student() {
			
		}
	
		//Method
		public int getTot() {
			return kor+eng+math;
		}
		
		public int getAvg() {
			return (kor+eng+math)/3;
		}
}
