package Important;

public class MethodRefrence {
	
	public static void main(String[] args) {
		
		System.out.println("Hello ");
		
		WorkerInter worker = HelperRef::dostuff;
		
		worker.dostuff();
		
		Runnable runnable = HelperRef::threadTask;
		
		Thread t = new Thread(runnable);
		
		t.start();
		
		HelperRef hr = new HelperRef();
		
		Runnable run = hr::childThread;
		
		Thread tr = new Thread(run);
		
		tr.start();
		
	//	HelperRef hr = new HelperRef();
		
		Runnable r = hr::primeNumber;
		
		Thread te = new Thread(r);
		
		te.start();
		
		
	}

}
