package ex6_1_array;

public class ArrayEx6 {

	public static void main(String[] args) {
		/*int[] arr=new int[] {20,30,40,80,10};
		int max=arr[0];
		int min=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println("max="+max);
		System.out.println("min="+min);*/
		char[] hex= {'C','A','F','E','2'};
		String[] binary= {"0000","0001","0010","0011","0100","0101","0110","0111"
				,"1000","1001","1010","1011","1100","1101","1110","1111"
		};
		String result="";
		
		for(int i=0;i<hex.length;i++) {
			if(hex[i]>='0'&&hex[i]<='9') {
				System.out.println("hex[i]="+hex[i]);
				System.out.println("binary[hex[i]-'0']="+binary[hex[i]-'0']);
				result+=binary[hex[i]-'0']+" ";
			}else {
				result+=binary[hex[i]-'A'+10]+" ";
				//System.out.println("hex[i]="+hex[i]-'A'+10);
				System.out.println("binary[hex[i]-'A'+10]="+binary[hex[i]-'A'+10]);
			}
		}
		
		System.out.println("hex:"+new String(hex));
		System.out.println("binary:"+result);

	}
}