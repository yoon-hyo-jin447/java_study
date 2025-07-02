package myTest;

public class test2 {
	public static void main(String[] args) {
		int[][] score = new int[5][];
		score[0]= new int[1];
		score[1]= new int[2];
		score[2]= new int[3];
		score[3]= new int[2];
		score[4]= new int[1];
		int count = 0;
		for(int i=0;i<score.length;i++) {
			for(int j=0;j<score[i].length;j++) {
				score[i][j]= count;
				System.out.print("["+i+","+j+"] = "+score[i][j]+"\t");
				count+=10;
			}
			System.out.println();
		}
		
	}
}
