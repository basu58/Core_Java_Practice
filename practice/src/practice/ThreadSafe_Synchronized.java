package practice;

import java.util.concurrent.atomic.AtomicInteger;

class Counter{
	volatile int count;
	//AtomicInteger count=new AtomicInteger();
	public void increment() {
		//count.incrementAndGet();
		count++;
	}
}
public class ThreadSafe_Synchronized {

	public static void main(String[] args)throws Exception {
		Counter t=new Counter();
		Thread t1=new Thread(()->{
			for(int i=0; i<1000; i++)
				t.increment();
		}
				);
		Thread t2=new Thread(()->{
			for(int i=0; i<1000; i++)
				t.increment();
		}
				);
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println(t.count);
	}//main method

}//class
