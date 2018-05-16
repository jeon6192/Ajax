package ex6_1_array;

public class ArrayEx4 {
	public static void main(String args[]) {
		int[] score=new int[] {95,70,80,75,100};
		int sum=0;
		for(int i=0;i<score.length;i++) {
			System.out.println("score["+i+"]="+score[i]);
			sum+=score[i];
		}
		System.out.println("รัมก="+sum);
		
	}
}