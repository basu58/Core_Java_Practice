package practice;

public class MultiThread {
	
	public static void main(String[] args)throws Exception {
		Thread t1=new Thread(()-> {
			for(int i=0; i<=5; i++) {
				System.out.println("Hi "+Thread.currentThread().getPriority());
				try {
					Thread.sleep(500);
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
});
		Thread t2=new Thread(()-> {
			for(int i=0; i<=5; i++) {
				System.out.println("Hello "+Thread.currentThread().getPriority());
				try {
					Thread.sleep(500);
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
});
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);

  t1.setName("Hi Thread.."); t2.setName("Hello Thread..");
 
		System.out.println(t1.getName());
		System.out.println(t2.getName());
		
		
		t1.start();
		try {
			Thread.sleep(10);
		} catch (Exception e) {
			// TODO: handle exception
		}
		t2.start();
		
		t1.join();
		System.out.println(t2.isAlive());
		t2.join(); 
		
		System.out.println(t1.isAlive());
		System.out.println(t2.isAlive());
		
		System.out.println("MainThread.main()");
	}
}
