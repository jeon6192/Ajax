package member;

import java.util.Arrays;
import java.util.HashMap;

class Teset
{
	// Lv3 다음 큰 숫자
	    /*public int nextBigNumber(int n)
	    {
	
		int answer= 0;
	  String a1=Integer.toBinaryString(n);
		int c=8-a1.length();
		for(int i=0;i<c;i++) {
			a1="0"+a1;
		}
	  int c1=0;
	  for(int i=0;i<a1.length();i++) {
				if(a1.charAt(i)=='1') {
					c1++;
				}
			}
	  answer=n;
	  while(true) {
				int d1=0;
				answer++;
				String b1=Integer.toBinaryString(answer);
				c=8-a1.length();
				for(int i=0;i<c;i++) {
					b1="0"+b1;
				}
				for(int i=0;i<b1.length();i++) {
					if(b1.charAt(i)=='1') {
						d1++;
					}
				}
				if(c1==d1) break;
			}
	
		return answer;
	}
	    public static void main(String[] args)
	    {
	        Teset test = new Teset();
	        int n = 78;
	        System.out.println(test.nextBigNumber(n));
	    }*/
	
	// Lv4 숫자의 표현
	/*public int expressions(int num) {
		int answer = 0;
		int sum=0;
		int startNum=1;
		for(int i=startNum;i<=num;i++) {
			sum+=i;
			if(sum>num) {
				sum=0;
				startNum++;
				i=startNum;
			}
			if(sum==num) {
				answer++;
				sum=0;
				startNum++;
				i=startNum;
			}
		}

		return answer;
	}

	public static void main(String args[]) {
		Teset expressions = new Teset();
		// 아래는 테스트로 출력해 보기 위한 코드입니다.
		System.out.println(expressions.expressions(15));
	}*/
	
	// Lv3 멀리뛰기
	/*public int jumpCase(int num) {
		int answer=0;
		if(num==1) return 1;
		else if(num==2)	return 2;
		else {
			answer = jumpCase(num-1)+jumpCase(num-2);
		}
        return answer;
    }

    public static void main(String[] args) {
        Teset c = new Teset();
        int testCase = 4;
        //아래는 테스트로 출력해 보기 위한 코드입니다.
        System.out.println(c.jumpCase(testCase));
    }*/
	
	
	/*public long nlcm(int[] num) {
		long answer = 0;
		long[] b=new long[num.length];
		int a=2;
		int c=0;
		int d=0;
		
		while(d<100) {
			for(int i=0;i<num.length;i++) {
				if(num[i]%a==0) {
					c++;
				}
			}
			if(c==4) {
				answer=a;
				for(int j=0;j<b.length;j++) {
					answer*=(num[j]/a);
				}
				break;
			}
			c=0;
			a++;
			d++;
		}
		

		return answer;
	}

	public static void main(String[] args) {
		Teset c = new Teset();
		int[] ex = { 4, 8, 12, 16 };
		2	2 4 6 8
		2	1 2 3 4
		96
		// 아래는 테스트로 출력해 보기 위한 코드입니다.
		System.out.println(c.nlcm(ex));
	}
	*/
	
}