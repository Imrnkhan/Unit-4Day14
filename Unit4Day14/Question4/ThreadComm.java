package Unit4Day14.Question4;




    
//Explain wait(), notify(),notifyAll() how they are used for inter thread communication.

//Two synchronized thread can communicate each other by using some methods present in Object class,
//those methods are wait(), notify(), notifyAll().

//Whenever we need to suspend a synchronized thread unconditionally then we use wait() method.
//Whenever we need to resume a suspended(waiting) thread then we use notify() method.

//this is known as thread-synchronization or inter-thread communication.

//we can call wait(), notify(),notifyAll() only in the synchronized block or synchronized methods.
//otherwise we will get a runtime exception.
class MyThread extends Thread {
	int num = 0;

	@Override
	public void run() {
		synchronized (this) {
			System.out.println("child thread performing calculation");
			for (int i = 0; i <= 100; i++) {
				num = num + i;
			}
			System.out.println("child thread giving the notification");
			this.notify();
		}
	}
}

public class ThreadComm {

	public static void main(String[] args) throws InterruptedException {
		MyThread mt=new MyThread();
		mt.start();

		synchronized (mt) { //getting the lock of mt object
			System.out.println("main thread calls the wait method");
            System.out.println("------------------");
			mt.wait();
			System.out.println("main thread got the notification");
            System.out.println("-------------------------");
			System.out.println(mt.num);
		}
	}
}


// 4)Explain wait(), notify(),notifyAll() how they are used for inter thread
// communication.