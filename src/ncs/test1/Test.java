package ncs.test1;

class Test {
	public int collatz(int num) {
		int answer = 0;
		int a=0,b=0;
		while(b<500) {
			if(num%2==0){
				
    		}else {
    			
    		}
			a++;
			b++;
		}
    
      

		return answer;
	}

	// 아래는 테스트로 출력해 보기 위한 코드입니다.
	public static void main(String[] args) {
		Test c = new Test();
		int ex = 6;
		System.out.println(c.collatz(ex));
	}
}