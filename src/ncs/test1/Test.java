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

	// �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
	public static void main(String[] args) {
		Test c = new Test();
		int ex = 6;
		System.out.println(c.collatz(ex));
	}
}