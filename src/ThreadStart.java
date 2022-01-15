
public class ThreadStart extends Thread {

	public static void main(String[] args) {
		ThreadStart t= new ThreadStart();
		t.start();
		System.out.println(Thread.currentThread().getName());
		
		ThreadStart t1= new ThreadStart();
		t1.start();
		
		

	}

	@Override
	public void run() {
	
		System.out.println(Thread.currentThread().getName());
	}

	@Override
	public synchronized void start() {
		// TODO Auto-generated method stub
		super.start();
	}
	
	
	
	
	

}
