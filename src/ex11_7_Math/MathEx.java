package ex11_7_Math;

public class MathEx {
	public static void main(String[] args) {
		System.out.println(Math.random());
		System.out.println((int)(Math.random()*10)+1);
		int a=(int)(Math.random()*10)+1;
		int b=(int)(Math.random()*10)+1;
		int c=(int)((45-1+1)*Math.random()+1);
		// ((상한값-하한값+1)*난수+하한값
		System.out.println(a*b);
		System.out.println(c);
		/*for (int i = 0; i < 6; i++) {
			System.out.print((int)(45*Math.random()+1)+"\t");
		}
		System.out.println();*/
		int[] arr=new int[6];
		for(int i=0;i<arr.length;i++) {
			int num=(int)(45*Math.random()+1);
			arr[i]=num;
			for(int j=0;j<i;j++) {
				if(arr[j]==arr[i]) {
					i--;
					break;
				}
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+"\t");						
		}
		
		
		
		
	}
}
