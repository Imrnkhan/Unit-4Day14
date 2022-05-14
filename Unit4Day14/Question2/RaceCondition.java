package Unit4Day14.Question2;

// public class RaceCondition {
    
// }


//What is a race condition?

//A condition in which the critical section is concurrently executed by two or more threads.
//It leads to incorrect behavior of a program.
//
//In layman terms, a race condition can be defined as, a condition in which two or more
//threads compete together to get certain shared resources.



//How will you find and solve race condition show with proper running code ?


class Counter implements Runnable{

	private int c = 0;
	public void increment() {
		try {
			Thread.sleep(10);
		} catch (Exception e) {
			e.printStackTrace();  
		}
		c++;
	}

	public void decrement() {
		c--;
	}

	public int getValue(){
		return c;

	}
	@Override 
	public void run() {
		//incrementing  
		this.increment();
		System.out.println("Value for Thread After increment " + Thread.currentThread().getName() + " " + this.getValue());

		// decrementing
		this.decrement();
		System.out.println("Value for Thread at last " + Thread.currentThread().getName() + " " + this.getValue());          

	}



}


public class RaceCondition {
	public static void main(String[] args) {

		Counter counter = new Counter();
		Thread t1 = new Thread(counter , "Thread-1");
		Thread t2 = new Thread(counter,"Thread-2");
		Thread t3 = new Thread(counter, "Thread-3");  
		t1.start();
		t2.start();
		t3.start();



	}
}



// What is a race condition? How will you find and solve race condition show with proper running code ?