package ex17_3_Thread_four;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ThreadSleep_Date {
	public static void main(String[] args) {
		Thread t1=new Thread_date();
		t1.start();
		
	}
}

class Thread_date extends Thread{
	public void run() {
		SimpleDateFormat sd = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 hh시 mm분 ss초 ");
		while(true) {
			try {
				Thread.sleep(1000);
				System.out.println(sd.format(new Date().getTime()));
			}catch(InterruptedException e) {
				System.out.println(e.getMessage());
			}
		} // while
	} // run
} // class