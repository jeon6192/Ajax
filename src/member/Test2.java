package member;

import java.util.Scanner;

public class Test2 {
	// Lv3 시저암호
		/*String caesar(String s, int n) {
			String result = "";
			n%=26;
			
			for(int i=0;i<s.length();i++) {
				char ch=s.charAt(i);
				if(ch>=65 && ch<=90) { // 대문자
					ch+=n;
					if(ch>90)	ch-=26;
				}else if(ch>=97 && ch<=122) {
					ch+=n;
					if(ch>122)	ch-=26;
				}
				result+=ch;
			}

			return result;
		}

		public static void main(String[] args) {
			Test2 c = new Test2();
			System.out.println("s는 'a B z', n은 4인 경우: " + c.caesar("a B z", 4));
		}*/
		
	
	
		    
	    // Lv1 가운데 글자 가져오기
	/*	        Test2 se = new Test2();
		        System.out.println(se.getMiddle("powerr"));
	}
	String getMiddle(String word){
    	int a=word.length();
        char c;
        String str="";
        if(a%2==1){
        	a/=2;
        	System.out.println(a);
          c=word.charAt(a);
          str=Character.toString(c);
        }else{
        	a=a/2-1;
  				c=word.charAt(a);
          str=Character.toString(c);
  				c=word.charAt(a+1);
          str+=Character.toString(c);
        }

	    	return str;    
	    }*/
		
	
	
	// Lv2 정수 내림차순으로 배치하기
	/*	Test2 ri = new Test2();
		System.out.println(ri.reverseInt(118372));
	}
		public int reverseInt(int n){
			String str=Integer.toString(n);
			char temp;
			char arr[]=new char[str.length()];
			for(int i=0;i<arr.length;i++) {
				arr[i]=str.charAt(i);
			}
			
			for(int i=0;i<str.length()-1;i++) {
				for(int j=0;j<str.length()-1;j++) {
					if(arr[j]<arr[j+1]) {
						temp=arr[j];
						arr[j]=arr[j+1];
						arr[j+1]=temp;						
					}
				}
			}
			str="";
			for(int i=0;i<arr.length;i++) {
				str+=Character.toString(arr[i]);
			}
			int a=Integer.parseInt(str);
	    
			return a;
		}*/
		
		
	
	// 백준 2-8 설탕
	/*@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		if(a<3||a>5000)	return;
		sc.close();
		
		int sum=sugar(a);
		System.out.println(sum);
		
	}
	
	public static int sugar(int n) {
		int remainder=0;
		int th=0;
		int a=n/5;
		
		for(int i=a;i>=0;i--) {
			remainder=n-(5*i);
			if(remainder%3==0) {	
				th=remainder/3;
				remainder=(n-remainder)/5;
				return remainder+th;
			}
		}
		return -1;
	}
	*/
	
	/*
	// 리우잡
	public static void main(String[] args) {
		System.out.println("크기");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		
		int[] arr=new int[a];
		System.out.println("수열");
		for(int i=0;i<a;i++) {
			arr[i]=sc.nextInt();
		}
		sc.close();
		
		int min=arr[0];
		for(int i=1;i<a;i++) {
			if(min>arr[i]) {
				min=arr[i];
			}
		}
		int[] index = new int[a];
		int b=0;
		for(int i=0;i<a;i++) {
			if(arr[i]==min) {
				index[b]=i+1;
				b++;
			}
		}
		for(int a2:index) {
			if(a2!=0)
				System.out.print(a2+" ");
		}
	}*/
		
		    
}
	