package practice;

class Counter2{
	int count;
	boolean valueSet=false;

	public synchronized void getCount() throws Exception {
		while(!valueSet) {
			wait();
		}
		System.out.println("Get = "+count);
		valueSet=false;
		notify();
	}

	public synchronized void setCount(int count)throws Exception {
		while(valueSet) {
			wait();
		}
		System.out.println("Set = "+count);
		this.count = count;
		valueSet=true;
		notify();
	}
	
}
class Producer implements Runnable{
	Counter2 c;
	
	public Producer(Counter2 c) {
		this.c = c;
		Thread t=new Thread(this,"Producer");
		t.start();
	}

	@Override
	public void run() {
		int i=0;
		while(true) {
			try {
				c.setCount(i++);
			} catch (Exception e1) {
				e1.printStackTrace();
			}
			try {Thread.sleep(1000);}catch(Exception e) {}
		}
	}
	
}
class Consumer implements Runnable{
	Counter2 c;
	
	public Consumer(Counter2 c) {
		this.c = c;
		Thread t=new Thread(this,"Consumer");
		t.start();
	}

	@Override
	public void run() {
		int i=0;
		while(true) {
			try {
				c.getCount();
			} catch (Exception e1) {
				e1.printStackTrace();
			}
			try {Thread.sleep(5000);}catch(Exception e) {}
		}
	}
	
}
public class InterThread_Communication {

	public static void main(String[] args) {
		Counter2 c=new Counter2();
		new Producer(c);
		new Consumer(c);
	}

}
