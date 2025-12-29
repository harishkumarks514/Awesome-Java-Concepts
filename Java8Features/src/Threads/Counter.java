package Threads;

public class Counter {
	 int count = 0;

	    void increment() {
	        count++;   // NOT atomic
	    }
	    
	    Counter c = new Counter();

	    Thread t1 = new Thread(() -> {
	        for(int i = 0; i < 1000; i++) c.increment();
	    });

	    Thread t2 = new Thread(() -> {
	        for(int i = 0; i < 1000; i++) c.increment();
	    });

//	    System.out.println(  t1.start());
//	    System.out.println(  t2.start());
	 
	    
}
